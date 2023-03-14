package trainReservation.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Train;
import trainReservation.service.ReservationService;


//Controller Class(계층)
//사용자(클라이언트)로부터 입력 받는 기능 , 입력받은 데이터를 검증하는 기능 , 비즈니스로직의 결과를 반환

public class ReservationController {
	
	private DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm");
	private ReservationService reservationService = new ReservationService();
	
	public ReservationController() {
		this.reservationService = new ReservationService();
	}
	
	public void reservation() {
		while(true) {

			GetTrainListDto dto = new GetTrainListDto();
			LocalTime departureTime = null;
			
			
			if(dto.isEmpty()) {
				System.out.println("모두 입력하세요");
				continue; //컨티뉴가 되면 제일 처음으로 가서 새 인스턴스 생성
			}
			
			
			try {
				departureTime = LocalTime.parse(dto.getDepatureTime(), timeformatter);
			}catch(Exception exception) {
				System.out.println("잘못된 시간입니다.");
				continue; 
			}
			
			if(dto.getNumberOfPeople() <= 0) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			if(dto.isEqualStation()) { // 인스턴스에 있는 역이 같다면 위로 돌려보냄
				System.out.println("출발역과 도착역이 같습니다.");
				continue;
			}
			
			//이까지가 입력검증 모든 메서드에서는 입력검증이 먼저다. 
			
			List<Train> possibleTrains = reservationService.getPossibleTrainList(dto, departureTime);
			System.out.println(possibleTrains.toString());
		}
	}
}
