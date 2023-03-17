package board.dto.repose.user;

import java.util.UUID;

import board.entity.User;

public class SignInResponseDto { // 유저정보 반환
	
	private String email;
	private String nickName;
	private String phoneNumber;
	private String address;
	private String addressDetail;
	private String profileImageUrl;
	private String token;
	
	public SignInResponseDto() {
	}

	public SignInResponseDto(String email, String nickName, String phoneNumber, String address, String addressDetail,
			String profileImageUrl, String token) {

		this.email = email;
		this.nickName = nickName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.profileImageUrl = profileImageUrl;
		this.token = token;
	}
	
	//유저리스트에서 조건을 이용해서 검사했으면, 
    //	실제 유저 데이터가 반환이 될건데 위에 인스턴스를 만드는 생성자를 만들거임
	
	public SignInResponseDto(User user) {
		
		this.email = user.getEmail();
		this.nickName = user.getNickName();
		this.phoneNumber = user.getPhoneNumber();
		this.address = user.getAddress();
		this.addressDetail = user.getAddressDetail();
		this.profileImageUrl = user.getProfileImageUrl();
		this.token = UUID.randomUUID().toString();
		
	}

	public String getEmail() {
		return email;
	}

	public String getNickName() {
		return nickName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public String getToken() {
		return token;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "SignInResponseDto [email=" + email + ", nickName=" + nickName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", addressDetail=" + addressDetail + ", profileImageUrl=" + profileImageUrl
				+ ", token=" + token + "]";
	}

	
	
	
}
