package example.signIn;

import java.util.Scanner;

/*
 * 로그인 프로세스 구현
 */
public class SignIn {
	/*
	 * 입력 : 아이디, 비밀번호
	 */
	
	public static void main(String[] args) {
		
		//상수는 변수명을 대문자로!!!!!! 
		final String ID = "qwer1234";
		final String PASSWORD = "qwer1234"; //원래는 여기를 디비에서 긁어오고 
		
		/*
		 * 결과 : 성공 & 실패(값을 입력하지 않았을 때,정보가 일치않을 경우)
		 */
		//1. 사용자로부터 아이디와 패스워드 입력받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디와 비밀번호를 입력하세요.");
		
		String userId = scanner.nextLine(); 
		String userPassword = scanner.nextLine();
		
		//2. 사용자가 모두 (아이디, 비번)입력했는지 검증
		// userId, userPassword 변수가 비었는지 확인하는 과정
		//문자열에서 값이 비었는지 확인하는 기능(메소드) 
//		string.isEmpty(); 비었으면 true, 아니면 false - > 조건
		//비었으면 실행되도록 ==  참이면 실행
		if(userId.isEmpty() || userPassword.isEmpty()) {
			System.out.println("모두 입력하세요.");
			return; 
		}
		
//		3. 비교해서 입력값과 저장된 값이 동일하면 성공, 틀리면 실패 
//		원래는 비교할게 디비에 있어야겠지만 일단 메모리에 저장시킵시다.(상수로)
//		string.equals(비교대상) : 같으면 true, 아니면false
		
		if(!userId.equals(ID) || !userPassword.equals(PASSWORD)) { // 아이디 비번 다른 경우 두개 같이 검증 
			System.out.println("로그인 정보가 일치하지 않습니다");
			return; // 메인메소드 종료 
		}
		
//		if(userId.equals(ID) &&  userPassword.equals(PASSWORD)) {
//			System.out.println();
//		} 이렇게 하면 안댐! 
		
		System.out.println("로그인성공!");
		//여기서 로그인 토큰? 같은거 뭐 하고 암호화처리 하는 거만 빼면 실제 로그인이랑 같음
		
	}
	

}





























