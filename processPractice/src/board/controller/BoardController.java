package board.controller;



import java.util.List;

import board.common.constant.HttpStatus;
import board.dto.repose.ResponseDto;
import board.dto.repose.board.DeleteBoardResponseDto;
import board.dto.repose.board.GetBoardListResponseDto;
import board.dto.repose.board.GetBoardResponseDto;
import board.dto.repose.board.PatchBoardResponseDto;
import board.dto.repose.board.PostBoardResponseDto;
import board.dto.request.board.PatchBoardDto;
import board.dto.request.board.PostBoardDto;
import board.service.BoardService;

public class BoardController {

	private BoardService boardService;

	public BoardController() {
		boardService = new BoardService();
	}

	public void postBoard(PostBoardDto dto) {

		if (dto.auth()) {// 인증
			System.out.println(HttpStatus.UNAUTHORIZED); 
			return;
		}
		
		if(dto.vaild()) {//필수값 누락, 잘못된타입 등
			System.out.println(HttpStatus.BAD_REQUSET);
			return;
		}
		//ResponseDto에 무언가를 넣어줘야함
		ResponseDto<PostBoardResponseDto> response = boardService.postBoard(dto);
		System.out.println(response);

	}
	
	public void getBoardList() {
		
		ResponseDto<List<GetBoardListResponseDto>>response = boardService.getBoardList();
		System.out.println(response);
		
	}
	
	public void getBoard(int boardNumber) {
		
		if(boardNumber <=0) {
			System.out.println(HttpStatus.BAD_REQUSET);
			return;
		}
		
		ResponseDto<GetBoardResponseDto> response = boardService.getBoard(boardNumber);
		System.out.println(response);
		
	}
	
	public void patchBoard(PatchBoardDto dto) {
		
		if(dto.auth()) {
			System.out.println(HttpStatus.UNAUTHORIZED);
			return;
		}
		if(dto.valid()) {
			System.out.println(HttpStatus.BAD_REQUSET);
			return;
		}
		
		ResponseDto<PatchBoardResponseDto> response = boardService.patchBoard(dto);
		System.out.println(response);
	}
	
	public void deleteBoard(int boardNumber, String email) {
		
		boolean auth = email.isBlank();
		
		if(auth) {
			System.out.println(HttpStatus.UNAUTHORIZED);
			return;
		}
		
		boolean valid = boardNumber <= 0;
		
		if(valid) {
			System.out.println(HttpStatus.BAD_REQUSET);
			return;
		}
	
		ResponseDto<List<DeleteBoardResponseDto>> response =
				boardService.deleteBoard(boardNumber,email);
		System.out.println(response);
				
		
	}
	
	
	
	

}

























