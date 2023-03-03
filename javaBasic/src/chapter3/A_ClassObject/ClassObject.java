package chapter3.A_ClassObject;
/*
 * 클래스 
 * 객체를 정의해 놓은 것 
 * 객체를 생성하는 기반 
 * 객체를 정의하는 틀 또는 설계도 
 * 클래스는 객체의 상태를 나타내는 필드와 객체의 행동을 나타내는 메소드로 구성된다.
 * 필드 : 클래스에 포함된 변수 혹은 상수
 * 메서드 : 어떠한 특정 작업을 수행하기 위한 명령문의 집합
 * 
 * 객체(Object) : 실제로 존재하는 모든 것 물건, 개념, 모든 것 
 * 				: 클래스로 생성된 실체
 *				: 클래스로 생성된 각각의 객체는 독립적으로 존재함
 *				: 같은 클래스로 생성된 객체라 하더라도 각각이 가지고 있는 '속성 값'은 다를 수 있다(일반적으로 다름)
 *
 *클래스 선언방법 : class 클래스명 {속성1, 속성2, ..... , 기능1, 기능2, ...}
 *				  : 속성 -> 변수, 특성, 필드, 상태
 * 				  : 기능 -> 메서드, 함수, 행위
 */	

// 클래스명은 UpperCamelCase 명명 규칙을 따름
class SmartPhone {
	
	// 기종, 색상, 메모리, 전화번호 , 전원(속성 :변수)
	// 전화걸기, 영상시청 , 문자발송, 전원켜고끄기 (기능 : 함수, 메소드)
	
	String modelName;
	String color;
	int memory;
	String phoneNumber;
	boolean power;
	
	void call(String toTelNumber) {
		System.out.println(toTelNumber + " 로 전화를 겁니다.");
	}
	
	void showVideo() {
		System.out.println("영상을 시청합니다");
	}
	
	void sendMessage(String message, String toTelNumber) {
		System.out.println(toTelNumber +" 로 " + message + " 를 보냅니다.");
	}
	
	void setPower() {
		power = !power;
	}
	
	
}


public class ClassObject {
	
	public static void main(String[] args) {
		
//		인스턴스 
//		특정 클래스로 생성된 객체를 인스턴스라고 한다.
//		클래스로 객체를 생성하는 행위를 '인스턴스화'한다라고 한다.
		
//		인스턴스 선언방법
//		클래스 참조변수명(인스턴스명)
		
		SmartPhone iphone14;
//		인스턴스 생성방법
//		참조변수명 = new 클래스명();
		
		iphone14 = new SmartPhone(); 
		SmartPhone iphone14Pro = new SmartPhone();
//		같은 틀을 가진 다른 존재
		
		
		System.out.println(iphone14);
		System.out.println(iphone14Pro);

//		인스턴스의 속성 접근 및 기능 사용
//		속성사용 : 참조변수.멤버변수;
//		기능 사용 : 참조변수.메서드([매개변수[, ....]]);
		
		iphone14.modelName = "아이폰";
		iphone14.color = "black";
		iphone14.memory = 512;
		iphone14.phoneNumber ="010-1234-4567";
		iphone14.power = false;
		


		System.out.println(iphone14.modelName);
		System.out.println(iphone14.phoneNumber);
		
		System.out.println(iphone14Pro.modelName); 
		// null 메모리의 위치, 주소를 지정하지 않았음 자바에서의  null은 메모리주소를 지정하지 않았다! 존재하지 않음
		System.out.println(iphone14Pro.memory); //  0
		System.out.println(iphone14Pro.power);
		
		iphone14.call("010-1111-1111");
		iphone14.showVideo();
		System.out.println(iphone14.power);
		iphone14.setPower();
		System.out.println(iphone14.power);
		
		iphone14Pro = iphone14;
		iphone14Pro.phoneNumber ="010-8999-9999";
		System.out.println(iphone14.phoneNumber);
		
//		객체배열
//		클래스명[] 객체배열명 = new 클래스명[길이];
		
		SmartPhone [] smartPhoneList = new SmartPhone[3];
		
		smartPhoneList[0] = iphone14;
		smartPhoneList[1] = iphone14Pro;
		smartPhoneList[2] = new SmartPhone();
		
		for(int i = 0 ; i<smartPhoneList.length; i++) {
			SmartPhone smartPhone = new SmartPhone(); // 근데, 이렇게 하면 같은 이름으로 세개의 변수가 생기는 게 아니야?? 
			smartPhone.phoneNumber = "010-1111-111"+i;
			smartPhoneList[i] = smartPhone;
		}
		
		
//		SmartPhone smartPhone = new SmartPhone();
//		for(int i = 0 ; i<smartPhoneList.length; i++) {
//			smartPhone.phoneNumber = "010-1111-111"+i;
//			smartPhoneList[i] = smartPhone;
//		}
//			이렇게 하면 메모리공간 하나, 같은 주소로 세번작업하는 거고 for문안에 만들면 공간이 3개		
		
		for(SmartPhone phone : smartPhoneList) {
			System.out.println(phone);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}






















































