package com.factly_blog.blogs.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Table(name="Blog")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class BlogBo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	private String description;
	private String emailId;
	/*
	 * private Long like; private Long dislike;
	 */
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="realauthor")
	private AuthorBo realauthor;
	
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public AuthorBo getRealauthor() {
		return realauthor;
	}

	public void setRealauthor(AuthorBo realauthor) {
		this.realauthor = realauthor;
	}

	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Override
	public String toString() {
		return "BlogBo [id=" + id + ", description=" + description + ", emailId=" + emailId + ", realauthor="
				+ realauthor + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}

	
	
}