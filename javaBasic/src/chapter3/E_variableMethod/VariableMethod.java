package chapter3.E_variableMethod;


/*
 * 클래스에서의 변수
 * 1. 인스턴스 변수 : 각각의 인스턴스마다 고유하게 가지고 있어야 하는 속성을 지정할 때 사용
 * 2. 클래스 변수 :  해당 클래스로 만들어진 모든 인스턴스가 동일하게 가지고 있어야 하는 속성을 지정할 때 사용
 * 3. 지역 변수 : 메서드 내에서 선언된 변수를 지역 변수라고 한다.(인스턴스변수와 클래스 변수는 전역변수) 
 * 
 * 		
 */

class GalaxyPhone{
//	인스턴스변수 : 인스턴스마다 고유하게 가지고 있는 속성
//				 : 인스턴스가 생성된 후에 사용가능
	String model;
	String owner;
	String telNumber;

	//	클래스 변수 : 앞에 static이라 붙인다, 해당클래스로 생성된 모든 인스턴스가 동일하게 가지고 있는 속성
	//				: 인스턴스 생성없이 클래스로 사용가능(인스턴스로도 사용가능)
	static String maker = "SAMSUNG";
	
	
	
}


class MoniterSize{
	
	static final int HEIGHT = 1080;
	static final int WIDTH = 1920;
}

public class VariableMethod {
	
	int number =10; // 이 클래스의 전역변수
	

	public static void main(String[] args) {

		double decimal = 10.0; // main메소드의 지역변수
	
		System.out.println(GalaxyPhone.maker);
		
		GalaxyPhone myS23 = new GalaxyPhone();
		myS23.model = "s23";
		myS23.owner = "김소유";
		myS23.telNumber = "010-1111-2222";
		
		GalaxyPhone myS22 = new GalaxyPhone();
		myS22.model = "S22";
		myS22.owner = "dfd";
		myS22.telNumber = "010-2222-3333";
		
		System.out.println(myS23.telNumber + "\n" + myS22.telNumber);
		
		myS23.maker = "SAMSUNG";
		System.out.println(myS23.maker);
		System.out.println(myS22.maker);
		System.out.println(GalaxyPhone.maker);
		
	
		int size = MoniterSize.HEIGHT * MoniterSize.WIDTH;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
