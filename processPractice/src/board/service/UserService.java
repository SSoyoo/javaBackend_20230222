package board.service;

import board.common.constant.ResponseMessage;
import board.dto.repose.ResponseDto;
import board.dto.repose.user.SignInResponseDto;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;
import board.entity.User;
import board.repository.UserRepository;

public class UserService {
	
	private UserRepository userRepository;
	
	public UserService() {
		userRepository = new UserRepository();
	}
	
	public ResponseDto<Boolean> signUp(SignUpDto dto) {
		
		String email = dto.getEmail();
		String password = dto.getPassword();
		String passwordCheck = dto.getPasswordCheck();
		
		boolean hasEmail = userRepository.existsByEmail(email);
		
		if(hasEmail)
			return new ResponseDto<Boolean>(false, ResponseMessage.EXIST_EMAIL, false);
		
		
		if(!password.equals(passwordCheck)) {
			
			return new ResponseDto<>(false, ResponseMessage.PASSWORD_NOT_MATCH,false);
		}
		
		User user = new User(dto);
		userRepository.save(user);
		
		return new ResponseDto<>(true,ResponseMessage.SUCESS,true);
	}
	
	
	
	public ResponseDto<SignInResponseDto> signIn(SignInDto dto){
		
		SignInResponseDto data = null;
		
		String email = dto.getEmail();
		String password = dto.getPassword();
		
		User user = userRepository.findByEmail(email);
		if(user == null) {
			return new ResponseDto<SignInResponseDto>(false, ResponseMessage.FAIL_SIGN_IN, null);
		}
		
		boolean isEqualPssword = user.getPassword().equals(password);
		if(!isEqualPssword) {
			return new ResponseDto<SignInResponseDto>(false, ResponseMessage.FAIL_SIGN_IN, null);
		}
		
		data = new SignInResponseDto(user);
		
		return new ResponseDto<>(true,ResponseMessage.SUCESS,data);
		
		
	}
	
	
	

}
