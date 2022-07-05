package com.infotech.locker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_locker")
public class Locker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer lockerId;
	
	@Column
	private Integer userId;
	
	@Column
	private String lockerCode;
	
	@Column
	private String passCode;
	
	@Column
	private Integer lockerStatus;
	
	@ManyToOne
	@JoinColumn(name="userId", nullable=false)
	private LockerUser lockerUser;

	public Integer getLockerId() {
		return lockerId;
	}

	public void setLockerId(Integer lockerId) {
		this.lockerId = lockerId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLockerCode() {
		return lockerCode;
	}

	public void setLockerCode(String lockerCode) {
		this.lockerCode = lockerCode;
	}

	public String getPassCode() {
		return passCode;
	}

	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}

	public Integer getLockerStatus() {
		return lockerStatus;
	}

	public void setLockerStatus(Integer lockerStatus) {
		this.lockerStatus = lockerStatus;
	}

	public LockerUser getLockerUser() {
		return lockerUser;
	}

	public void setLockerUser(LockerUser lockerUser) {
		this.lockerUser = lockerUser;
	}
}
