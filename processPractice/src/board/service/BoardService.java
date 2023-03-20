package board.service;

import java.util.List;

import board.common.constant.ResponseMessage;
import board.dto.repose.ResponseDto;
import board.dto.repose.board.GetBoardListResponseDto;
import board.dto.repose.board.GetBoardResponseDto;
import board.dto.repose.board.PostBoardResponseDto;
import board.dto.request.board.PostBoardDto;
import board.entity.Board;
import board.entity.User;
import board.repository.BoardRepository;
import board.repository.UserRepository;

public class BoardService {
	
	private BoardRepository boardRepository;
	private UserRepository userRepository;
	
	public BoardService() {
		boardRepository = new BoardRepository();
		userRepository = new UserRepository();
	}
	
	public ResponseDto<PostBoardResponseDto> postBoard(PostBoardDto dto){
		
		PostBoardResponseDto data = null;
		
		String email = dto.getWiterEmail();
		User user = userRepository.findByEmail(email);
		
		if(user == null) {
			return new ResponseDto<>(false,ResponseMessage.NOT_EXIST_USER ,null);
		}
		Board board = new Board(dto, user);
		boardRepository.save(board);
		
		data = new PostBoardResponseDto(board);
		return new ResponseDto<PostBoardResponseDto>(true, ResponseMessage.SUCCESS, data);

	}
	

	public ResponseDto<List<GetBoardListResponseDto>> getBoardList(){
		
		List<GetBoardListResponseDto>data = null;
		List<Board> boardList = boardRepository.findBy();
		
		data = GetBoardListResponseDto.copyList(boardList);
		return new ResponseDto<List<GetBoardListResponseDto>>(true, ResponseMessage.SUCCESS, data);
		
	}
	
	public ResponseDto<GetBoardResponseDto> getBoard(int boardNumber){
		
		GetBoardResponseDto data = null;
		
		Board board = boardRepository.findByBoardNumber(boardNumber);
		
		if(data == null) {
			return new ResponseDto<GetBoardResponseDto>(false, ResponseMessage.NOT_EXIST_BOARD, null);
		}
		
		data = new GetBoardResponseDto(board);
		return new ResponseDto<GetBoardResponseDto>(true, ResponseMessage.SUCCESS, data);
	}

}