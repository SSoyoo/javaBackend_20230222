package trainReservation.dto;

import java.util.Scanner;

//DTO : DAata Transfer Object
//레이어간 데이터를 전송할 때 사용하는 객체

public class GetTrainListDto {
	
	private String depatureStation;
	private String arrivalStaton;
	private String depatureTime;
	private int numberOfPeople;
	
	public GetTrainListDto() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출발역: ");
		this.depatureStation = scanner.nextLine();
		

		System.out.println("도착역: ");
		this.arrivalStaton = scanner.nextLine();
		
		System.out.println("출발 시간 : ");
		this.depatureTime = scanner.nextLine();
		
		System.out.println("인원 : ");
		this.numberOfPeople = scanner.nextInt();

	}

	public GetTrainListDto(String depatureStation, String arrivalStaton, String depatureTime, int numberOfPeople) {
		super();
		this.depatureStation = depatureStation;
		this.arrivalStaton = arrivalStaton;
		this.depatureTime = depatureTime;
		this.numberOfPeople = numberOfPeople;
	}

	public String getDepatureStation() {
		return depatureStation;
	}

	public String getArrivalStaton() {
		return arrivalStaton;
	}

	public String getDepartureTime() {
		return depatureTime;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setDepatureStation(String depatureStation) {
		this.depatureStation = depatureStation;
	}

	public void setArrivalStaton(String arrivalStaton) {
		this.arrivalStaton = arrivalStaton;
	}

	public void setDepartureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	@Override
	public String toString() {
		return "GetTrainListDto [depatureStation=" + depatureStation + ", arrivalStaton=" + arrivalStaton
				+ ", depatureTime=" + depatureTime + ", numberOfPeople=" + numberOfPeople + "]";
	}
	
	
	public boolean isEmpty() {
		
		return this.depatureStation.isBlank() || 
				this.arrivalStaton.isBlank() ||
				this.depatureTime.isBlank();

		}
	public boolean isEqualStation() {
		return this.depatureStation.equals(this.arrivalStaton);
	}
	
	public boolean isEqualDepartureStation(String station) {
		return this.depatureStation.equals(station);
		
	}
	
	public boolean isEqualArrivalStation(String station) {
		return this.arrivalStaton.equals(station);
	}
	
	
	
	
	
	}
	
