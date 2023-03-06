package chapter3.F_Inheritance;

/* 
 * 상속! 
 * 기존클래스를 재사용해서 새로운 클래스를 작성하는 것 
 * 코드의 재사용성을 높이고 코드의 중복을 제거함 -> 생산성향상, 유지보수성 향상
 * 
 * 사용방법
 * class 클래스명 extends 조상클래스명 { ... }
 */

class Human {
	
	Human() {
	
	}
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
		this.telNumber = "010-1234-4567";
		this.contury = "Korea";
	
	}
	
	String name;
	int age;
	String telNumber;
	String contury;
	
	void eat(String food) {
		System.out.println(this.name  +"이(가) " +food +"을(를) 먹습니다");
	}
}
//	Developer 클래스는 Human의 속성과 기능을 모두 사용 가능

class Developer extends Human { 
	
	Developer() {

	}
	
	Developer(String name, int age, String position, String language) {
//		super : 부모 클래스를 지칭
//		super() : 부모 클래스의 생성자 지칭
		
		super(name, age); 
		this.position = position;
		this.language = language;

	}
	

	
	String position;
	String language;
	
	void develope(){
		System.out.println(super.name +"(이)가" + this.language + "로 " + this.position + "개발을 합니다");
		// 어디의 변수인지 정확하게 지칭! 
	}
	
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Developer developer1 = new Developer();
		
		developer1.name = "john doe"; //Human에 있으니까 상속받은 Developer가 쓸수있다.
		developer1.position = "Back end";
		developer1.language ="Java";
		
		developer1.eat("사과");
		developer1.develope();
		System.out.println();
		
		Developer developer2 = new Developer("Michle" , 29 , "Front end" ,  "Javascript");
		developer2.eat("바나나");
		developer2.develope();
		
		
		

	}

}






























