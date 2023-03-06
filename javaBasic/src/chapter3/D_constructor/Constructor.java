package chapter3.D_constructor;
/*
 * 생성자
 * 인스턴스가 생성될 때, 호출되는 인스턴스 '초기화 메서드'
 * 인스턴스변수의 초기화 작업에 사용
 * 인스턴스 생성시에 실행되어야 할 작업을 작성하는 위치
 * 
 * 생성자의 조건
 * 생성자의 이름은 해당 클래스 명과 같아야하고
 * 생성자는 반환값이 없다
 * 
 * 
 */
class Circle{
	
	double radius;
	double diameter;
	double circumference;
	double area;
	
//	생성자 사용방법!
//	클래스명 ([파라미터], [,..,,,]){인스턴스 생성시 실행할 코드}
	
//	생성자도 메소드이기때문에 오버로딩을 적용해서 
//	매게변수에 따라 다른 작업을 수행하게 할 수 있다.

	
	
	public Circle() {
		System.out.println("빈 생성자입니다.");
		this.radius = 10;
		this.diameter = 2*radius;
		this.circumference = 3.14 * 2 * radius;
		this.area = 3.14 * radius * radius;

	}	
	
//	생성자를 이용해서 인스턴스 복사
//	그렇게 쓰이는 경우는 없음
	
	Circle(Circle circle){
		
		this.radius = circle.radius;
		this.diameter = circle.diameter;
		this.circumference = circle.circumference;
		this.area = circle.area;
	}
	
	
	
	public Circle(double radius) { 
		
		System.out.println("Circle이 생성됩니다");
		this.radius = radius; //this = 인스턴스 자기자신 , 인스턴스 변수를 지칭하고 싶을 때는 this를 쓴다.
		this.diameter = 2 * radius;
		this.circumference = 3.14 * 2 * radius;
		this.area = 3.14 * radius * radius;
	
	}
	


}



public class Constructor {

	public static void main(String[] args) {
		
		System.out.println("==생성자==");
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5);
		System.out.println("==========");
//
//		circle1.radius = 10;
//		circle1.diameter = 20;
//		circle1.circumference =62.8;
//		circle1.area = 314;
//
		System.out.println(circle1.area); // 기본생성자에서 이미 반지름을 10이라 하고 생성했으니 
		System.out.println(circle2.area); 
		
	}

}




