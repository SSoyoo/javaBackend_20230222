package chapter1.B_Constant;

public class Constant {

	public static void main(String[] args) {
		
		int age = 10; // 바꾸면 안된다할게 
		//사람이라면 무조건 실수, 다른걸 바꾸려다가 실수로 age를 바꿀수도 있잖아 \
		//그런걸 방지하는 용도로, 아예 실수를 못하도록 해버리는 거 
		
		
		// 상수 선언 방법
		//final 데이터타입 상수명 = 데이터;
		
	
		final int WINDOW_WIDTH = 1920;
		final int WINDOW_HEIGHT = 1080;
		int size = WINDOW_WIDTH * WINDOW_HEIGHT; // 이걸 보면 이게뭐지? 싶을건데 데이터에다가 이름을 지정해서 
		
		
		final int NUMBER;
		NUMBER = 100;
		final double PIE = 3.14;
		
//		PIE = 3.141592; 오류! 상수는 값을 바꿀 수 없다 
		
		
		
		//리터럴상수 : 
		//프로그래밍 언어에는 데이터를 담아두는 상수와 리터럴 상수가 존재
		//그 중에 리터럴상수는 데이터 그 자체를 의미
		//final int WINDOW_WIDTH = 1920; 
		//상수를 선언할거다 그 타입은 정수다 이름이 ㅇㅇ다~ 
		//그 결과를 대입하겠다 대입하는값은 1920이라는 리터럴 상수를 넣겠다
	
	}

}
