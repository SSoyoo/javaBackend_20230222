package chapter6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Client {
	
	private String clientNumber;
	private String name;
	private boolean gender;
	private String registrationDate;
	private String address;
	private String phoneNumber;
	private boolean receiveMarketingInfo;
	private boolean consentPersonalInfomation;
	
	public Client() {}
	
	
	
	public Client(ClientDto dto) {
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
		this.clientNumber = UUID.randomUUID().toString();
		this.name = dto.getName();
		this.gender = dto.isGender();
		this.registrationDate = simpleDateFormat.format(now);
		this.address = dto.getAddress();
		this.phoneNumber = dto.getPhoneNumber();
		this.receiveMarketingInfo = dto.isReceiveMarketingInfo();
		this.consentPersonalInfomation = dto.isConsentPersonalInfomation();
	}



	



	public String getClientNumber() {
		return clientNumber;
	}
	public String getName() {
		return name;
	}
	public boolean isGender() {
		return gender;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public boolean isReceiveMarketingInfo() {
		return receiveMarketingInfo;
	}
	public boolean isConsentPersonalInfomation() {
		return consentPersonalInfomation;
	}
	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setReceiveMarketingInfo(boolean receiveMarketingInfo) {
		this.receiveMarketingInfo = receiveMarketingInfo;
	}
	public void setConsentPersonalInfomation(boolean consentPersonalInfomation) {
		this.consentPersonalInfomation = consentPersonalInfomation;
	}
	
}

	class ClientDto{
		
		private String name;
		private boolean gender;
		private String address;
		private String phoneNumber;
		private boolean receiveMarketingInfo;
		private boolean consentPersonalInfomation;
		
		public String getName() {
			return name;
		}
		public boolean isGender() {
			return gender;
		}
		public String getAddress() {
			return address;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public boolean isReceiveMarketingInfo() {
			return receiveMarketingInfo;
		}
		public boolean isConsentPersonalInfomation() {
			return consentPersonalInfomation;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setGender(boolean gender) {
			this.gender = gender;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public void setReceiveMarketingInfo(boolean receiveMarketingInfo) {
			this.receiveMarketingInfo = receiveMarketingInfo;
		}
		public void setConsentPersonalInfomation(boolean consentPersonalInfomation) {
			this.consentPersonalInfomation = consentPersonalInfomation;
		}
		
	
		
	}
