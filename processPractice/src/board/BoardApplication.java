package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;

public class BoardApplication {
	
	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();
	
	private static final String SIGN_UP ="POST /sigh-up";
	private static final String SIGN_IN ="POST /sign-in";
	
	public static void main(String[] args) {
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("URL End point: ");
			String endpoint = scanner.nextLine();
			
			switch(endpoint) {
			
			case "SIGN_UP":
				
				SignUpDto signUpDto = new SignUpDto();
				
				System.out.println("이메일주소: ");
				signUpDto.setEmail(scanner.nextLine());
				
				System.out.println("비밀번호: ");
				signUpDto.setPassword(scanner.nextLine());
				
				System.out.println("비밀번호확인: ");
				signUpDto.setPasswordCheck(scanner.nextLine());
				
				System.out.println("닉네임: ");
				signUpDto.setNickname(scanner.nextLine());
				
				System.out.println("휴대전화번호: ");
				signUpDto.setPhoneNumber(scanner.nextLine());
				
				System.out.println("주소: ");
				signUpDto.setAddress(scanner.nextLine());
				
				System.out.println("상세주소: ");
				signUpDto.setAddressDetail(scanner.nextLine());
				
				//System.out.println(signUpDto);
				
				userController.signUp(signUpDto);
				break;
				
			case "SIGN_IN":
				
				SignInDto signInDto = new SignInDto();
				System.out.println("이메일 주소:");
				signInDto.setEmail(scanner.nextLine());
				System.out.println("비밀번호");
				signInDto.setPassword(scanner.nextLine());
				
//				System.out.println(signInDto);
				userController.signIn(signInDto);
				
				default:
					System.out.println(HttpStatus.NOT_FOUND);
			}//스위치
			
			
			
			
			
		}//while문


	} //메인메소드

}// 클래스 끝 
