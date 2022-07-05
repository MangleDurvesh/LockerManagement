package com.infotech.locker.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer paymentId;
	
	@Column
	private String transactionId;
	
	@Column
	private String date;
	
	@Column
	private Integer lockerCode;
	
	@OneToOne(mappedBy="lockerId")
	private Set<Locker> locker;

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getLockerCode() {
		return lockerCode;
	}

	public void setLockerCode(Integer lockerCode) {
		this.lockerCode = lockerCode;
	}

	public Set<Locker> getLocker() {
		return locker;
	}

	public void setLocker(Set<Locker> locker) {
		this.locker = locker;
	}
}
