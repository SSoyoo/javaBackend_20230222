package trainReservation.entity;

import java.util.List;
import java.util.UUID;

public class ResevationInfo {
	
/*
 * 예약변호
 * 열차번호
 * 좌석번호리스트
 * 출발역
 * 출발시간
 * 도착역
 * 도착시간
 * 총금액
 */

	private String reservationNumber;
	private String trainNumber;
	private List<String> seats;
	private String departureStation;
	private String departureTime;
	private String arrivalStaion;
	private String arrivalTime;
	private int totalCost;
	
	public ResevationInfo() {

	}
	
	

	public ResevationInfo(String trainNumber, List<String> seats, String departureStation,
			String departureTime, String arrivalStaion, String arrivalTime, int totalCost) {

		this.reservationNumber = UUID.randomUUID().toString();
		this.trainNumber = trainNumber;
		this.seats = seats;
		this.departureStation = departureStation;
		this.departureTime = departureTime;
		this.arrivalStaion = arrivalStaion;
		this.arrivalTime = arrivalTime;
		this.totalCost = totalCost;
	}



	public String getReservationNumber() {
		return reservationNumber;
	}
	
	public String getTrainNumber() {
		return trainNumber;
	}

	public List<String> getSeats() {
		return seats;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalStaion() {
		return arrivalStaion;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public int getTotalCost() {
		return totalCost;
	}



	@Override
	public String toString() {
		return "ResevationInfo [reservationNumber=" + reservationNumber + ", trainNumber=" + trainNumber + ", seats="
				+ seats + ", departureStation=" + departureStation + ", departureTime=" + departureTime
				+ ", arrivalStaion=" + arrivalStaion + ", arrivalTime=" + arrivalTime + ", totalCost=" + totalCost
				+ "]";
	}
	
	
	
	
	
}
