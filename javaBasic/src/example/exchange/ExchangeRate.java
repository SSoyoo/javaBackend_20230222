package example.exchange;

public class ExchangeRate {
	
	//화폐 : 화폐 = 환율
	
	//넣을 화폐(원화, 달러, 엔화, 위안화 , ...)
	//외부에서 접근할 수 없도록 private접근제어자 
	
	private String exchaingingCurrency;
	
	//바꿀 화폐(원화, 달러, 엔화, 위안화, ...)
	private String exchangedCurrency; 
	 
	//환율(1000 / 1,316.30 )
	private double exchangeRate;
	
	
	
	
	public ExchangeRate(String exchaingingCurrency, String exchangedCurrency, double exchangeRate) {
		
		this.exchaingingCurrency = exchaingingCurrency;
		this.exchangedCurrency = exchangedCurrency;
		this.exchangeRate = exchangeRate;
	}

	
//	Get 메서드 : 인스턴스가 가지고 있는 특정 인스턴스 변수 값을 반환해주기 위한 메서드
	
	public String getExchaingingCurrency() {
		return exchaingingCurrency;
	}
	public String getExchangedCurrency() {
		return exchangedCurrency;
	}
	


	public double getExchangeRate() {
		return exchangeRate;
	}
	
//	Set메서드 : 인스턴스가 가지고 있는 특정 인스턴스 변수를 변경할 때 사용하는 메서드
	public void setExchaingingCurrency(String exchaingingCurrency) {
		this.exchaingingCurrency = exchaingingCurrency;
	}

	public void setExchangedCurrency(String exchangedCurrency) {
		this.exchangedCurrency = exchangedCurrency;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	@Override
	public String toString() {
		return "ExchangeRate [exchaingingCurrency=" + exchaingingCurrency + ", exchangedCurrency=" + exchangedCurrency
				+ ", exchangeRate=" + exchangeRate + "]";
	}
	
	
	
	
}
