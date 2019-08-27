package com.factly_blog.blogs.vo;

public class BlogVo {

	private String author;
	private String description;
	private String emailId;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "BlogVo [author=" + author + ", description=" + description + ", emailId=" + emailId + "]";
	}
	
}
