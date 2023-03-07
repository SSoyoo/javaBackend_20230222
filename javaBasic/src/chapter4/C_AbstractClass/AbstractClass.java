package chapter4.C_AbstractClass;
/*
 * 추상클래스 
 * 추상메서드가 포함되어 있는 클래스
 * 추상클래스로 인스턴스를 생성할 수 없다
 * 
 * 사용방법
 * abstract Class 클래스명 {}
 * 
 */


abstract class Abstract{
	int number1;
	abstract void method1();
	
//	추상메서드
//	선언부만 작성이 되어 있고 구현부는 작성되어 있지 않는 메서드
//	해당 클래스를 상속받은 자손 클래스에서 구현을 필수로 요구함
//	사용방법 : abstract 반환타입 메소드명 ();

}

class SubClass extends Abstract{

	@Override
	void method1() {
		System.out.println("구현!");
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {

//		Abstract abstract1 = new Abstract(); 추상클래스라서 인스턴스 생성 못함
		
		Abstract abstract1 = new SubClass(); 
	}

}
