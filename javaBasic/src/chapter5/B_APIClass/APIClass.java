package chapter5.B_APIClass;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * API 클래스
 * 자바 자체에서 제공해주는 개발에 도움을 주는 각종 라이브러리
 * 
 */

public class APIClass {

	public static void main(String[] args) {
//		Object class
//		모든 클래스의 조상 클래스
		
		Object object = new Scanner(System.in);
		object = new int[10];
		
//		String class
//		문자열 처리에 대한 메서드가 정의되어 있는 클래스
		String string = " This is string contents ";
//		.substring(시작인덱스, 종료인덱스);
		String substring = string.substring(6, 8);
		System.out.println(substring);		
		
//		.length() 
//		문자열의 길이를 가져오는 메서드
		
//		.toUpperCase(); ->모든 문자를 대문자로 교체
		
//		.toLowerCase(); ->모든 문자를 소문자로 교체

		String upperCase = string.toUpperCase();
		System.out.println(upperCase);
		String lowerCase= string.toLowerCase();
		System.out.println(lowerCase);
		
//		indexOf(문자열)
//		해당하는 문자열이 존재한다면 그 위치의 첫번째 인덱스를 번호를 반환
//		없으면 -1 반환
		
		int stringIndext = string.indexOf("ais");
		System.out.println(stringIndext); 
		
		
		// .trim
		//문자열의 앞뒤 공백 제거
		String trimString = string.trim();
		System.out.println(trimString);
		
		// .replaceAll(변환할 문자열, 변환될 문자열);
		//특정 문자열을 지정한 문자열을 지정한 문자열로 바꿔줌
		
		String replaceString = string.replaceAll("is", "are");
		System.out.println(replaceString);
	
		
//		Wrapper Class 
//		기본형 데이터 타입을 참조형 데이터 타입으로 다루기 위한 클래스
//		int -> Integer
//		double -> Double
//		....
		
		Integer integer =10;
		int number = integer;
		
//		문자열 -> 숫자
		
		String numberStirng = "110";
		int number1 = Integer.parseInt(numberStirng);
	
//		숫자 -> 문자열
		
		numberStirng = integer.toString(550);
		System.out.println(numberStirng);
		
//		Random class
//		무작위의 값을 얻고자 할 때 유용한 클래스
		
		Random random = new Random();
	
//		random.nextInt(); 무작위의 int 형 졍수
//		random.nextlong(); 무작위의 long 형 졍수
//		random.nextInt(최대값); 최대값보다 작은 int 형 정수 
		
	
		// .nextInt(): 무작위의 int 형 정수
		// .nextLong(): 무작위의 long 형 정수
		// .nextInt(최대값): 최대값보다 작은 int형 정수
//		
//		int randomNumber = random.nextInt(3);
//		System.out.println(randomNumber);
		
//		int[] lotto = new int[6];
//		
//		for (int index = 0; index < lotto.length; index++) {
//			
//			boolean equal = false;
//			
//			for (int subIndex = 0; subIndex < index; subIndex++) {
//				if (lotto[subIndex] == lotto[index]) {
//					System.out.println(lotto[subIndex] + " " + lotto[index]);
//					equal = true;
//				}
//			}
//			
//			if (equal) continue;
//			
//			lotto[index] = random.nextInt(45) + 1;
//		}
//		
//		for (int lottoNumber: lotto) {
//			System.out.print(lottoNumber + " ");
//		}
		
		
		
		Set<Integer> lottoSet = new TreeSet<>();
		
//		for(int i = 0 ; i<6 ; i++) {
//			lottoSet.add(random.nextInt(45)+1);
//		}
//		
//		System.out.println(lottoSet);
		
		while(lottoSet.size()<6) {
			int randomNumber = random.nextInt(45)+1;
			lottoSet.add(randomNumber);
		}

		System.out.println(lottoSet);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




















