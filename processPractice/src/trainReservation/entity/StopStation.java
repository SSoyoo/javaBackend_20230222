package trainReservation.entity;
//정차역에 관한 Entity class
public class StopStation {
	
	private String StationName;
	private String depatureTime;
	private String arrivalTime;
	
	public StopStation() {
	}

	public StopStation(String stationName, String depatureTime, String arrivalTime) {
	
		StationName = stationName;
		this.depatureTime = depatureTime;
		this.arrivalTime = arrivalTime;
	}

	public String getStationName() {
		return StationName;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	@Override
	public String toString() {
		return "StopStation [StationName=" + StationName + ", depatureTime=" + depatureTime + ", arrivalTime="
				+ arrivalTime + "]";
	}
	
	
	
	
	
	

}
