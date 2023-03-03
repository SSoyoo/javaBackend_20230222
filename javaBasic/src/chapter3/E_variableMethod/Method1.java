package chapter3.E_variableMethod;


/*
 * 메서드
 * 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것 
 * 작업을 미리 작성해둔 것  
 * 메서드에 넣을 값과 반환값만 알면된다 = 블랙박스 구조
 * 
 * 
 * 메서드의 장점 
 * 1. 높은 재사용성 : 한번 만들어 놓은 메서드를 반복해서 사용가능
 * 2. 중복된 코드 제거 : 반복적으로 나타나는 문장들을 메서드로 만들어서 사용하면 
 * 					   : 코드의 중복 제거가능, 수정이 발생하면 하나의 코드만 수정하면 된다
 * 3. 프로그램 구조화  : 작업 단위로 여러개의 메서드를 담아 프로그램을 구조화 할 수 있다.
 */

class HigerMathematics{
//	 파라미터가 있는 메서드는 반드시 파라미터 범위 등과 같은 검증을 먼저 해줘야함.
	
	// final double PIE = 3.14; // 원 사이즈, 둘레 구하는데 다 쓰이니까 전역변수로 올려줌
	static final double PIE = 3.14; // 스태틱메서드에 인스턴스를 생성해야 쓸 수 있는 인스턴스 변수가 쓰이기 때문에 변수도 클래스변수가 되어야한다
//	클래스 변수와 마찬가지로 메서드에 static을 포함하게 되면 클래스 메서드로 사용할 수 있다. (= 클래스로 접근 할 수 있다)
	 static double getTriangleSize(double underside , double height) {
		 
		 if (underside <= 0 || height <= 0) {
			 System.out.println("밑변과 높이는 양수여야합니다.");
			 return 0;
		 }
		 
		 
		 double size = 0.5 * underside * height;
		 return size; 
	 }
	 
	 static double getCircleSize(double radius) {
		 
		 if(radius <= 0) {
			 System.out.println("반지름은 양수여야합니다");
			 return 0;
		 }
		 
		 double size= PIE * radius * radius;
		 return size;
	 }
	 
	 static double getCircleCircumference(double radius) {
		 
		 if(radius <= 0) {
			 System.out.println("반지름은 양수여야합니다");
			 return 0;
		 }
		
		 double circumference = radius * PIE * 2;
		 return circumference;
	 }
}


public class Method1 {
//	메서드의 선언부
//	[접근제어자 기타제어자] 반환타입 메서드명([매개변수[,...,..]) 
	public static void main(String[] args) {
//		메서드의 구현부
//		실제 프로그램의 절차를 작성하는 부분 
//		return 데이터; 로 결과를 반환시켜줌
//		반환타입이 void이면 return 으로 메서드를 종료시킴
		
	//	HigerMathematics math = new HigerMathematics();
		double size = HigerMathematics.getTriangleSize(10, 0);
		System.out.println(size); 
		
		double circleSize = HigerMathematics.getCircleSize(5);
		System.out.println(circleSize);
		
		circleSize = HigerMathematics.getCircleCircumference(-1);
		
	
	}

}







































