package example.signup;

import java.util.Scanner;

class SignUpDto {
	
	String userId;
	String userPassword;
	String userPasswordCheck;
	String userName;
	

}

public class SignUp2 {

	public static void main(String[] args) {
		

		
		String [] idList = {"qwer" , "asdf", "zxcv"};
		
		Scanner scanner = new Scanner(System.in);
		
		SignUpDto dto = new SignUpDto();
		
		System.out.println("아이디: ");
		dto.userId = scanner.nextLine();
		
		System.out.println("패스워드: ");
		dto.userPassword = scanner.nextLine();
		
		System.out.println("비밀번호 확인: ");
		dto.userPasswordCheck = scanner.nextLine();
		
		System.out.println("이름: ");
		dto.userName = scanner.nextLine();
		

		if(dto.userId.isBlank()|| dto.userPassword.isBlank() || 
				dto.userPasswordCheck.isBlank() || dto.userName.isBlank()) {
			System.out.println("모두 입력하세요");
			return;
		}

		for(String id : idList) {
			if(dto.userId.equals(id)) {
				System.out.println("중복되는 아이디입니다");
				return;
		}
		}

		if(!dto.userPassword.equals(dto.userPasswordCheck)) {
			System.out.println("비밀번호가 서로 다릅니다");
			return;
		}

		System.out.println("회원가입완료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
