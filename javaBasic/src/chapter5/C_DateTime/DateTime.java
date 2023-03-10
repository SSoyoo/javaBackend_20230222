package chapter5.C_DateTime;

import java.awt.Label;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//날짜 및 시간

public class DateTime {
	
	public static void main(String[] args) {
		
		
//		System.currentTimeMillis();
//		현재 시간을 long 타입으로 0.001초 단위로 표현
//		1960년 1월 1일 기준으로 얼마나 지났는지 보여줌
	
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		for (int count = 0 ; count < 1000000000 ; count++) {
			count++;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime); 
//		특정 기능이 시간이 얼마나 걸리는 지 알아볼때 쓰기도 함!
		
//		Date Class
//		날짜를 관리해주는 클래스
//		주로 날짜와 관련된 데이터타입을 취급할 때 사용

		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getMonth()); // 3월인데 2가나와 달을 다루는 개념이 인덱스 다루는 개념이랑 같아서 2가나와....
		// 줄이 그어지는 이유는? 사용하지 않는다~ 
		
		date.setHours(10);
		System.out.println(date);
		
		System.out.println();
		Date now = Date.from(Instant.now());
		System.out.println(now);
		
		Date minusTwoHour = Date.from(Instant.now().minus(2, ChronoUnit.HOURS));
		System.out.println(minusTwoHour); // 현재시간보다 두시간 감소된 시간 저장
		
//		SimpleDateFormat
//		Date 타입의 참조변수를 지정한 포맷의 문자열로 변경해주는 클래스
//		y :연 M 월 d일 H시간 m분 s초
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
		
		String fomatedDate = simpleDateFormat.format(now);
		System.out.println(fomatedDate);

		
//		Time Package
//		date 와 calander클래스의 단점 보완
		
//		localDate class
//		날짜를 관리해주는 클래스
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDateof = LocalDate.of(2022, 12, 25);
		System.out.println(localDateof);
		
		
//		LocalTime Class
//		시간을 관리해주는 클래스
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalTime localTimeof = LocalTime.of(12, 40);
		System.out.println(localTimeof);
		
//		LocalDateTime Class
//		날짜와 시간을 관리해주는 클래스
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime localDateTimeof = LocalDateTime.of(localDateof, localTimeof);
		System.out.println(localDateTimeof);
		
		
//		특정 날짜 혹은 시간 가져오기
//		 .get XXX();
		
		int year = localDateTime.getYear();
		int month = localDateTime.getMonthValue();
		System.out.println(month); //3
		Month enumMonth = localDateTime.getMonth();
		System.out.println(enumMonth);//march
		int dayofYear = localDate.getDayOfYear();
		int dayofMonth = localDate.getDayOfMonth();
//		getDayOfYear 이번년도에서 몇번째일인지 
//		getDayOfMonth 며칠 
		
		DayOfWeek dayofWeek = localDateTime.getDayOfWeek();
		
		boolean isLeapYear = localDate.isLeapYear();
		
		int hour = localDateTime.getHour();
		int minute = localDateTime.getSecond();
		int second = localDateTime.getSecond();
		int nano = localDateTime.getNano();
		
//		특정 날짜 및 시간 변경(직접변경, 더하기, 빼기)
//		직접변경 : withXXX(int 타입 데이터)
//		더하기 - 빼기 : plusXXX(long타입) , minusXXX(long 타입 데이터);
		
		localDateTime.withYear(2012).plusWeeks(4).minusHours(9);
		localDateTime.withDayOfYear(1).plusMinutes(50).minusNanos(50000);
		
		//로컬데이트타임에 어떤 지역인지 지정해두고 인스턴트로 바꿈
		Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
		Date datetime = Date.from(instant);
		
		System.out.println(datetime);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
