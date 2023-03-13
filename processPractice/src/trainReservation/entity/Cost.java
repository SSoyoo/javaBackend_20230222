package trainReservation.entity;
// 비용과 관련된 Entity class

public class Cost {
	
	private String depatureStation;
	private String arrivalStation;
	private int amount; 
	
	public Cost() {
	
	}

	public Cost(String depatureStation, String arrivalStation, int amount) {
	
		this.depatureStation = depatureStation;
		this.arrivalStation = arrivalStation;
		this.amount = amount;
	}

	
	public String getDepatureStation() {
		return depatureStation;
	}


	public String getArrivalStation() {
		return arrivalStation;
	}


	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		
		return "Cost [departureStation: " + this.depatureStation +
				", arrivalStation: " +this.arrivalStation +
				", amount: " + this.amount + "]";
	}

	
	
	

}
