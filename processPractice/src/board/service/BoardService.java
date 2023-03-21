package board.service;

import java.util.List;

import board.common.constant.ResponseMessage;
import board.dto.repose.ResponseDto;
import board.dto.repose.board.DeleteBoardResponseDto;
import board.dto.repose.board.GetBoardListResponseDto;
import board.dto.repose.board.GetBoardResponseDto;
import board.dto.repose.board.PatchBoardResponseDto;
import board.dto.repose.board.PostBoardResponseDto;
import board.dto.request.board.PatchBoardDto;
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
		
		if(board == null) {
			return new ResponseDto<GetBoardResponseDto>(false, ResponseMessage.NOT_EXIST_BOARD, null);
		}
		
		board.increaseViewCount();
		boardRepository.save(board);
		
		data = new GetBoardResponseDto(board);
		return new ResponseDto (true, ResponseMessage.SUCCESS, data);
	}

	public ResponseDto<PatchBoardResponseDto> patchBoard(PatchBoardDto dto){

		
		PatchBoardResponseDto data = null;
		
		String email = dto.getEmail();
		User user = userRepository.findByEmail(email);
		int boardNumber = dto.getBoardNumber();
		
		Board board = boardRepository.findByBoardNumber(boardNumber);
		
		if(user == null) {
			return new ResponseDto<PatchBoardResponseDto>(false, ResponseMessage.NOT_EXIST_USER, null);
		}
		
		if(board == null) return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_BOARD, null);
		if(!board.getWriterEmail().equals(email)){
			return new ResponseDto<PatchBoardResponseDto>(false, ResponseMessage.NOT_PERMISSION, null);
		}
		
		//검증이 끝났으니 수정
		
		board.patch(dto);
		boardRepository.save(board); //수정한 걸 저장하면 바꿔진다.
		
		data = new PatchBoardResponseDto(board); // 보드를 넣어서 데이터 생성후 반환
	
		return new ResponseDto(true,ResponseMessage.SUCCESS,data);
	}
	
	public ResponseDto<List<DeleteBoardResponseDto>> deleteBoard(int boardNumber, String email){
		
		List<DeleteBoardResponseDto>data = null;
		
		User user = userRepository.findByEmail(email);
	
		if(user == null) {
			return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_USER,null);
		}
		
		Board board = boardRepository.findByBoardNumber(boardNumber);
		
		if(board == null) {
			return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_BOARD,null);
		}
		
		if(!board.getWriterEmail().equalsIgnoreCase(email)) {
			return new ResponseDto<>(false, ResponseMessage.NOT_PERMISSION, null);
		}
		
		//이제 삭제
		
		boardRepository.deleteByBoardNumber(boardNumber);
		//반환해줄 리스트 불러오기
		
		List<Board> boardList = boardRepository.findBy();
		data = DeleteBoardResponseDto.copyList(boardList);
		return new ResponseDto<>(true, ResponseMessage.SUCCESS,data);
	}



}