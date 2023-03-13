package trainReservation.entity;

import java.util.List;

//기차 정보 Entity class

public class Train {
	
	private String trainNumber;
	
	private String depatureStation;
	private String depatureTime;
	
	private String arrivalStaton;
	private String arrivalTime;
	
	private int takeMinute; 
	private String type;

//	하나의 열차에 여러개의 정차역, 트레인 하나당 역을 여러개 가짐 ->리스트로 잡아줘야한다. 리스트로 그 제너릭을 StopStatoin

//	정차역( class 역명, 도착시간, 출발시간 ) 
	private List<StopStation> stopStations;
	
//	남아있는좌석 ( class 호차, 좌석번호, 좌석상태 )
	private List<Seat>seats;
	
	
	public Train() {

	}


	public Train(String trainNumber, String depatureStation, String depatureTime, String arrivalStaton,
			String arrivalTime, int takeMinute, String type, List<StopStation> stopStations, List<Seat> seats) {
		this.trainNumber = trainNumber;
		this.depatureStation = depatureStation;
		this.depatureTime = depatureTime;
		this.arrivalStaton = arrivalStaton;
		this.arrivalTime = arrivalTime;
		this.takeMinute = takeMinute;
		this.type = type;
		this.stopStations = stopStations;
		this.seats = seats;
	}


	public String getTrainNumber() {
		return trainNumber;
	}


	public String getDepatureStation() {
		return depatureStation;
	}


	public String getDepatureTime() {
		return depatureTime;
	}


	public String getArrivalStaton() {
		return arrivalStaton;
	}


	public String getArrivalTime() {
		return arrivalTime;
	}


	public int getTakeMinute() {
		return takeMinute;
	}


	public String getType() {
		return type;
	}


	public List<StopStation> getStopStations() {
		return stopStations;
	}


	public List<Seat> getSeats() {
		return seats;
	}


	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", depatureStation=" + depatureStation + ", depatureTime="
				+ depatureTime + ", arrivalStaton=" + arrivalStaton + ", arrivalTime=" + arrivalTime + ", takeMinute="
				+ takeMinute + ", type=" + type + ", stopStations=" + stopStations + ", seats=" + seats + "]";
	}
	
	
	


}
