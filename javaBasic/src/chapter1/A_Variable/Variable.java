package chapter1.A_Variable;


//컨트롤 + / 주석 단축키

		//1. 변수 : 모든 프로그래밍 언어는 데이터를 보관할 수 있는 변수가 존재
		// 			데이터를 담을 수 있는 열려있는 상자
		
		// 변수는 반드시 선언 후 초기화 해야 사용가능
		// 선언 : 변수를 만드는 것 
		// 초기화 : 선언을 하고 초기에 데이터를 담는 행위

		// 중괄호 : 코드 블럭 

public class Variable {
	//main 메서드 : 실행시 실행되는 코드
	// 중괄호{....} : 코드 블럭 여러줄의 코드를 묶어주는 역할 
	public static void main(String[] args) {
		
		// 변수선언 방법 
		// 데이터타입 변수명;
		// 변수는 많이 길어지더라도 보면 뭔지 알 수 있도록 지어야함 
		// 
		
		int numberVariable; // 변수선언
		numberVariable = 1; //변수 초기화 변수명 = 데이터; 
		System.out.println(numberVariable); 
		
		//선언과 동시에 초기화: 데이터타입 변수명 = 데이터; 
		
		char characterVariable = 'a'; 
		System.out.println(characterVariable);
		
		int number1 =10, number2 =20; //가능은한데 이렇게 잘 안씀 
		
		
		
	}

}




























