package board.controller;

import board.common.constant.HttpStatus;
import board.dto.repose.ResponseDto;
import board.dto.repose.user.SignInResponseDto;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;
import board.entity.User;
import board.service.UserService;

public class UserController {
	
	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public void signUp(SignUpDto dto) {
		
		if(dto.validate()) {
			
			System.out.println(HttpStatus.BAD_REQUSET);
			System.out.println("모든 값을 입력하세요");
			return;

		}
		
		ResponseDto<Boolean> response = userService.signUp(dto);
		System.out.println(response);
	
		userService.signUp(dto);		
		
	}

	public void signIn(SignInDto dto) {
		
		if(dto.validate()) {
			System.out.println(HttpStatus.BAD_REQUSET);
			return;
		}
		
		ResponseDto<SignInResponseDto> response = userService.signIn(dto);
		System.out.println(response);
		
	}
	
	
	
}
