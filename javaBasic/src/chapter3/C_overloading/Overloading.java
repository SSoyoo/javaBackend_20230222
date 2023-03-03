package chapter3.C_overloading;
/*
 * 오버로딩
 * 한 클래스 내에서 같은 이름으로 메서드를 여러개 만들어 정의하는 것
 * 이미 같은 이름의 메서드가 존재한다 하더라도 매개변수의 타입과 개수가 다르면 
 * 같은 이름으로 정의할 수 있다
 * 
 * 오버로딩의 조건
 * 매세드 명이 같아야 한다
 * 매개변수 개수 혹은 타입이 달라야한다
 * 반환타입은 오버로딩에 영향을 미치지 않는다.
 */
public class Overloading {
	
	int add(int x , int y) {
		return x + y;
	}
	
	double add(double x, int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x+y+z;
	}
	
//	매개변수의 데이터타입이 같고 매개변수의 이름이 다르면 다르다고해도
//	오버로딩은 성립하지 않는다. 
//	
	
	
	

	public static void main(String[] args) {
		
	}

}
