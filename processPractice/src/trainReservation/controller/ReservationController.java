package trainReservation.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import trainReservation.dto.GetTrainListDto;
import trainReservation.dto.PostReservationDto;
import trainReservation.entity.ResevationInfo;
import trainReservation.entity.Train;
import trainReservation.service.ReservationService;


//Controller Class(계층)
//사용자(클라이언트)로부터 입력 받는 기능 , 입력받은 데이터를 검증하는 기능 , 비즈니스로직의 결과를 반환

public class ReservationController {
	
	private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	private ReservationService reservationService = new ReservationService();
	
	public ReservationController() {
		this.reservationService = new ReservationService();
	}
	
	public void reservation() {

			while (true) {
				GetTrainListDto getTrainListDto = new GetTrainListDto();
				LocalTime departureTime = null;
				
				if (getTrainListDto.isEmpty()) {
					System.out.println("모두 입력하세요.");
					continue;
				}
				
				try {
					departureTime = LocalTime.parse(getTrainListDto.getDepartureTime(), timeFormatter);
				} catch(Exception exception) {
					System.out.println("잘못된 시간입니다.");
					continue;
				}
				
				if (getTrainListDto.getNumberOfPeople() <= 0) {
					System.out.println("잘못된 인원입니다.");
					continue;
				}
				
				if (getTrainListDto.isEqualStation()) {
					System.out.println("출발역과 도착역이 같습니다.");
					continue;
				}
				
				List<Train> possibleTrains = reservationService.getPossibleTrainList(getTrainListDto, departureTime);
				
				System.out.println(possibleTrains.toString());
				
				
				ResevationInfo resevationInfo = null;
				
				while(true) {
					
					PostReservationDto postReservationDto = new PostReservationDto(getTrainListDto.getNumberOfPeople());
					resevationInfo = reservationService.postReservation(postReservationDto, getTrainListDto);
					if(resevationInfo == null) continue;
					break;
				}
				
				System.out.println(resevationInfo);
				
				
				
				
				
				
				
				
				
				
				
				
				
		}
	}
}
