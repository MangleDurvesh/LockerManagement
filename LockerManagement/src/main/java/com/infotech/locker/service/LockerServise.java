package com.infotech.locker.service;

import java.util.List;

import com.infotech.locker.model.Locker;

public interface LockerServise {
	public List<Locker> getAllAvailableLocker();
	
	public void bookLocker(Locker locker);
	
	public void checkOutLocker(String transactionId, Locker locker);
}
