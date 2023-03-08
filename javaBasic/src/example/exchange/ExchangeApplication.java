package example.exchange;

import java.util.Scanner;

/*
 * 환전기 어플리케이션
 * input : 금액, 넣을 화폐, 바꿀 화폐
 * output : 금액, 바뀐 화폐
 * 
 * 가능한 환전 : 원, 달러, 엔
 * 
 */


public class ExchangeApplication {
//	외부에서 보일필요 없음 private 으로 
	private static String [] managedCurrencies= {"KRW" , "USD" , "JPY"};
	
	private static ExchangeRate [] exchangeRates = {
			//1. 원-> 달러
			new ExchangeRate("KRW", "USD", 1000 / 1318.80),
			//2. 원-> 엔
			new ExchangeRate("KRW", "JPY", 1000 / 960.35),
			//3. 달러 -> 원
			new ExchangeRate("USD", "KRW", 1318.80 / 1000),
			//4. 달러 -> 엔
			new ExchangeRate("USD", "JPY", 1318.80 / 960.35),
			//5. 엔 -> 원화
			new ExchangeRate("JPY", "KRW", 960.35 / 1318.80),
			//6. 엔 -> 달러
			new ExchangeRate("JPY", "USD", 960.35 / 1318.80),
	};
	
	public static void main(String[] args) {
//		입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("넣을 화폐 : ");
		String exchangingCurrency  = scanner.nextLine();
		
		System.out.println("바꿀 화폐 : ");
		String exchangedCurrency = scanner.nextLine();
		
		System.out.println("금액 : ");
		int amount = scanner.nextInt(); // 넣을 금액 
		
//		입력 검증
//		모두 입력 했는지 
		if(exchangingCurrency.isBlank() || exchangedCurrency.isBlank()) {
			System.out.println("모두 입력해 주세요");
			return;
		}
		
//		입력한 화폐가 동일할 때
		if(exchangingCurrency.equals(exchangedCurrency)) {
			System.out.println("동일한 화폐로 환전할 수 없습니다");
		}
	
		
//		유효한 금액이 아닐 때(금액이 양수가 아닐 때)
		
		if(amount <=0) {
			System.out.println("유효한 금액이 아닙니다");
			return;
		}
		

//		관리하고 있는 화폐가 아닐 때
		
		boolean hasExchanging = false;
		boolean hasExchanged = false;
		
		
		
		for(String magagedCurrency : managedCurrencies) {
			
			if(exchangingCurrency.equals(magagedCurrency)) {
				hasExchanging = true;
			}
			
			if(exchangedCurrency.equals(magagedCurrency)) {
				hasExchanged = true;
			}
			
		}	
		
		if(!(hasExchanging && hasExchanged)) {
			System.out.println("유효하지 않은 화폐 단위입니다");
		}
		
		
		double resultAmount = amount;
		
		for (ExchangeRate exchangeRate : exchangeRates) {
			
			boolean isSame= exchangingCurrency.equals(exchangeRate.getExchaingingCurrency()) && 
							exchangedCurrency.equals(exchangeRate.getExchangedCurrency());
			
			if(isSame){	
				 
				resultAmount *= exchangeRate.getExchangeRate();
				 break;
			}
		}
		
		//		정상출력 
		System.out.println(exchangedCurrency + ": "+ resultAmount);
		
	
	}

}
