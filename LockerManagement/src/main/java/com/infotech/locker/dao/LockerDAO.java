package com.infotech.locker.dao;

import java.util.List;

import com.infotech.locker.model.Locker;

public interface LockerDAO {
public List<Locker> getAllAvailableLocker();
	
	public Locker getUserPassCode(Locker locker);
	
	public void allocateLocker(Locker locker);
	
	public void deAllocateUser(Locker locker);

}
