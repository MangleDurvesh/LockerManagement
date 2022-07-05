package com.infotech.locker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.locker.dao.LockerDAO;
import com.infotech.locker.model.Locker;

@Service
public class LockerServiseImpl implements LockerServise {
	@Autowired
	private LockerDAO lockerDAO;
	
	@Override
	public List<Locker> getAllAvailableLocker() {
		return lockerDAO.getAllAvailableLocker();
	}
	
	@Override
	public void bookLocker(Locker locker) {
		List<Locker> listLocker = lockerDAO.getAllAvailableLocker();
		if (listLocker.contains(locker.getLockerCode())) {
			locker.setLockerStatus(1);
			lockerDAO.allocateLocker(locker);
		}
	}
	
	@Override
	public void checkOutLocker(String transactionId, Locker locker) {
		if (isTransactionSuccess() || isValidUser(locker)) {
			locker.setUserId(null);
			locker.setPassCode(null);
			lockerDAO.deAllocateUser(locker);
		} else {
			// exception
		}		
	}
	
	// validate the status of transaction
	public boolean isTransactionSuccess() {
		// 3rd party API will be used to validate transaction
		// temporarly we are returning true
		return true;
	}
	
	public boolean isValidUser(Locker locker) {
		Locker userLocker = lockerDAO.getUserPassCode(locker);
		return locker.getPassCode().equals(userLocker.getPassCode()) ? true : false;
	}
}
