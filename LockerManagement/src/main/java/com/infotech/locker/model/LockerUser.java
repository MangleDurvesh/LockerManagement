package com.infotech.locker.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_lockeruser")
public class LockerUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer userId;
	
	@Column
	private String userName;
	
	@Column
	private String mailId;
	
	@Column
	private Integer contact;
	
	@OneToMany(mappedBy="tbl_locker")
	private Set<Locker> locker;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Integer getContact() {
		return contact;
	}

	public void setContact(Integer contact) {
		this.contact = contact;
	}

	public Set<Locker> getLocker() {
		return locker;
	}

	public void setLocker(Set<Locker> locker) {
		this.locker = locker;
	}
}
