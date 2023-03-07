package chapter4.D_Interface;
/*
 * 인터페이스
 * 추상클래스보다 추상화 정도가 높은 것
 * 추상클래스와 달리 일반메소드와 일반멤버변수를 가질 수 없다
 * 
 * 사용방법
 * interface 인터페이스명 { }
 * 
 */

interface ExampleInterface{
//	변수를 사용할 땐 public static final 형태로만 사용가능 
	public static final int Number = 10; // 초기화 필수

	//	메서드를 사용할 때는 public abstract로 선언해야 함
	public abstract void method1();
	public void method2(); // abstract를 안해도 저절로 추상메서드로 만들어짐
	void method3();
	
	
}

/*
 * 인터페이스간의 상속
 * 인터페이스는 , 를 써서 다중상속이 가능하다 
 * 
 */





interface SubExampleInterface extends ExampleInterface { 
	
}

/*
 * 인터페이스 구현
 * 인터페이스도 추상메소드를 포함하기 때문에 추상메서드를 구현하는 클래스를 통해서 인스턴스를 만들어줘야한다.
 * 인터페이스를 클래스로 구현할 때는 implements 키워드를 사용한다.
 */

class Implement implements ExampleInterface{ // 이 클래스로 인터페이스의 내용을 쓸수있음

	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
		
	}

	@Override
	public void method3() {
		System.out.println("method3");
		
	}
	
}



public class Interface {

	public static void main(String[] args) {
//		ExampleInterface exampleInterface = new ExampleInterface();
//		인터페이스 자체로 인스턴스를 생성할 수 없음
		
		ExampleInterface exampleInterface = new Implement(); // I~ 클래스도 인터페이스의 내용을 가지고 있으니 이렇게 사용가능, 구현한 거로만 생성가능! 
		

	}

}