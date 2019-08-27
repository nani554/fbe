package com.factly_blog.blogs.vo;

public class AuthorVo {
	
	private String authorName;
	private String mailId;
	private Long phoneNumber;
	private String password;
	private String confirmPassword;

	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "AuthorVo [authorName=" + authorName + ", mailId=" + mailId + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	
}

