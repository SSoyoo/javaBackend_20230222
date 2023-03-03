package chapter1.F_operator;

public class Operator {
/*
 * 연산자! 
 * 1. 산술연산자
 * 2. 대입연산자(할당연산자)
 * 3. 비교연산자
 * 4. 논리연산자
 * 5. 삼항연산자(조건연산자)
 */
	public static void main(String[] args) {
		
//		1. 산술연산자
//		덧셈연산자 :" + "좌항에 우항을 더한 값을 반환
		
		int addResult = 8 + 3;
		System.out.println(addResult);
		
//		뺄셈연산자 : " - " 좌항에서 우항을 뺀 값을 반환
		int minusResult = 8 - 3;
		System.out.println(minusResult);

//		곱셈연산자 : " * " 좌항에 우항을 곱한 값을 반환
		int multiResult = 8 * 3;
		System.out.println(multiResult);
		
//	 	나눗셈연산자 : " / " 좌항에서 우항을 나눈 값을 반환
		
		int remainderResult = 8/3;
		System.out.println(remainderResult);

		float float1 = 2.6666f;
		int number1 =(int)float1;
		System.out.println(number1); // 2 
		
		double remainderResult2 = 8.0 / 3.0;
		System.out.println(remainderResult2); // 2.6666666666666665 
		
		
//		나머지 연산자 : " % " : 좌항에서 우항을 나누고 남은 나머지를 반환
		
		int remainderResult3 = 8 % 3;
		System.out.println(remainderResult3); // 나머지인 2출력 
		
//		         * 알아둘 것 *  
//		정수와 정수의 연산결과는 정수로 반환
//		정수와 실수의 연산결과는 실수로 반환 
//		실수와 실수의 연산결과는 실수로 반환
		
		
//		2. 증감연산자 
//		'변수' 자신을 1증가 혹은 감소 시키는 연산자
//		증가연산자 : " ++ "
//		연산자의 좌항 혹은 우항의 값을 1증가 시킴

		int interger1 = 10;
		++interger1;
		System.out.println(interger1); // 1증가된 11출력
		
		interger1++;
		System.out.println(interger1); // 똑같이 1 증가
		
//		차이는 ?  
		System.out.println("================");
		interger1 = 0;
		System.out.println(interger1); // 0
		System.out.println(++interger1); //증가하고 읽어서 1
		System.out.println(interger1);	//1 
		System.out.println(interger1++); //일단 읽히고 증가가 되기 때문에 1그대로
		System.out.println(interger1); // 위에서 증가된 결과 출력 
		
		
		final int NUMBER = 0; 
//		NUMBER++; 상수에는 증감연산자 사용 불가!
//		0++;  리터럴상수 자체를 연산할 수 없다. 변수에만 적용된다!
		
		
//		감소연산자 --
//		연산자의 좌항 혹은 우항에 값을 1 감소시킴 
		
		int integer2 = 10;
		--integer2;
		integer2--;
		
		int number2 = 8;
		int number3 = 3;
		int sampleNumber = number2 / number3++;
		System.out.println(sampleNumber); // 3연산되고
		System.out.println(number3); // 다 끝나고 나면 4
	
//		대입연산자 
//		좌항에 우항을 (누적) 대입		
//		좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입
		
//		" = " 좌항에 우항을 그냥 대입
		
		int number4 = 10;
//		" += " 좌항에 우항을 더한 값을 좌항에 대입
		number4 += 3;
		System.out.println(number4);
		
//		" -= " 좌항에 우항을 뺀 값을 좌항에 대입
		
		number4 -= 6;
		System.out.println(number4);
		
//		" *= " 좌항에 우항을 곱한 값을 좌항에 대입
		
		number4 *= 3;
		System.out.println(number4);
		
		
//		" /= " 좌항에 우항을 나눈 값을 좌항에 대입
		number4 /= 5;
		System.out.println(number4);
		
//		" %= " 좌항에 우항을 나눈 나머지를 좌항에 대입
		
		number4 %= 3;
		System.out.println(number4);
		
//		대입 연산자의 좌항에는 무조건 변수만 지정할 수 있다
		
		
		
//		3. 비교연산자
//		좌항을 우항과 비교한 결과를 논리 값(true, false)으로 반환
		
//		" == " 좌항이 우항과 같다면 true를 반환, 아니면 false를 반환
		
		boolean boolean1 = 10 == 12;
		System.out.println(boolean1);
		
//		 " != " 좌항이 우항과 다르다면 true , 아니면 false 반환
		boolean boolean2 = 10 != 12;
		System.out.println(boolean2); // 다르니까 true
		
//		" > ", " >= " 좌항이 우항보다 크다면 true 작으면 false / 좌항이 우항보다 크거나 같으면 true, 아니면 false

		boolean boolean3 = 10 > 10;
		boolean boolean4 = 10 >= 10;
		
		System.out.println(boolean3);
		System.out.println(boolean4);
		
//		" < ", " <= " 좌항이 우항보다 작으면 true 크면 false / 좌항이 우항보다 작거나 같으면 true, 아니면 false	
		
		
		boolean boolean5 = 10 < 10;
		boolean boolean6 = 10 <= 10;
		
		System.out.println(boolean5);
		System.out.println(boolean6);
		
//		4. 논리연산자 : 논리 값을 연산하는 연산자
		
//		" & " AND 연산자 : 좌항과 우항이 모두 true 일 때 true 
//		논리상, 먼저오는 항이 false를 만나게 되면 뒤에오는 모든 연산은 하지 않음. 어차피 false가 되니까 
		
		boolean boolean7 = number3 > number4 && true ;
		System.out.println(boolean7);
		
//		|| :OR연산 좌항과 우항 중 하나라도 true이면 true , 아니면 false
//		가다가 하나라도 true를 만나면 뒤에서 연산하지 않음 
		
		boolean boolean8 = false || false ;
		System.out.println(boolean8);
		
		int number5 = 8;
		int number6 = 3;
		boolean boolean9 = (number5 > number6) && (number5++ > number6); // 먼저 연산할 거를 다 괄호로 묶기
		System.out.println();
		
		boolean boolean10 = (number5 > number6) || (number6 > number5++);
		
//		! :NOT 부정연산자
//		논리값의 부정을 반환 : 논리값이 true 면 false반환, false면 true 반환
		boolean boolean11 = !(number5 >number6);
		System.out.println(boolean11);
		
		
		
		
//		5. 삼항연산자 : 조건에 따라 다른 결과를 반환하는 연산자 
//		조건 ? 참일 때 결과 : 거짓일때 결과 
		
		String stirng1 = number5 > number6 ? "3보다큽니다" :
						 number5 == number6 ? "3입니다." : "3보다 작습니다.";
		
		System.out.println(stirng1);
		
		if(number5 > number6) {
			System.out.println("3보다 큽니다.");
		
		} else {
			if(number5 == number6) {
				System.out.println("3입니다");
			}else {
				System.out.println("3보다 작습니다");
			}
			System.out.println("보다 크지 않습니다");
		}
		
		
		
		

		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

