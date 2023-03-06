package chapter3.B_overriding;
/*
 * 오버라이딩
 * 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것 
 * 상속받은 메서드를 자손 클래스에 맞게 변경시키고자 할 때 오버라이딩을 사용한다
 * 
 */

class Human{
	String name;
	
	void eat(String food) {
		System.out.println(this.name + "가 " + food+"를 먹습니다");
	}
}

class Developer extends Human{
//	overload
	void eat() {
		System.out.println(super.name + "가 식사를 합니다");
	}
	
//	Override
//	
	void eat(String food) {
		System.out.println(super.name +"가 " + food + "를 절반만 먹습니다.");
	}
	
}


public class Overriding {

	public static void main(String[] args) {
	
		Developer developer = new Developer();
		developer.name = "john doe";
		developer.eat("과자");
		
		Human human = new Human();
		human.name = "Michle";
		human.eat("바나나");
		
	}

}
