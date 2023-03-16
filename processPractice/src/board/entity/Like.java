package board.entity;
/* 
 * 좋아요! 
 * 좋아한 사용자 이메일
 * 좋아한 사용자 프로필의주소
 * 좋아한 사용자 닉네임
 */
public class Like {

	private String userEmail;
	private String userProfileImageUrl;
	private String userNickName;
	
	public Like() {
	}

	public Like(String userEmail, String userProfileImageUrl, String userNickName) {
		this.userEmail = userEmail;
		this.userProfileImageUrl = userProfileImageUrl;
		this.userNickName = userNickName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserProfileImageUrl() {
		return userProfileImageUrl;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserProfileImageUrl(String userProfileImageUrl) {
		this.userProfileImageUrl = userProfileImageUrl;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	@Override
	public String toString() {
		return "Like [userEmail=" + userEmail + ", userProfileImageUrl=" + userProfileImageUrl + ", userNickName="
				+ userNickName + "]";
	}

	
	
}
