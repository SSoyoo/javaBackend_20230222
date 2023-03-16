package board.entity;
/*
 * 이메일주소 비밀번호 
 * 닉네임 휴대폰번호 주소 상세주소 
 * 프로필사진
 */
public class User {
	
	private String email;
	private String password;
	private String nickName;
	private String phoneNumber;
	private String address;
	private String addressDetail;
	private String profileImageUrl;
	
	public User() {
	}

	public User(String email, String password, String nickName, String phoneNumber, String address,
			String addressDetail, String profileImageUrl) {
	
		this.email = email;
		this.password = password;
		this.nickName = nickName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.profileImageUrl = profileImageUrl;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", nickName=" + nickName + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", addressDetail=" + addressDetail + ", profileImageUrl="
				+ profileImageUrl + "]";
	}
	
	
	
	
}
