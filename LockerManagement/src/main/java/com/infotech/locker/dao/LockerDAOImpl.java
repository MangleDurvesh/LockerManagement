package com.infotech.locker.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.locker.model.Locker;

@Repository
public class LockerDAOImpl implements LockerDAO{
	private Integer lockerAvailable = 0;
	private Integer lockerNotAvailable = 1;
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Locker> getAllAvailableLocker() {
		Criteria cr = entityManager.unwrap(Session.class).createCriteria(Locker.class);
		cr.add(Restrictions.eq("lockerStatus", lockerAvailable));
		List<Locker> lockerList = cr.list();
		return lockerList;
	}
	
	@Override
	@Transactional
	public void allocateLocker(Locker locker) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(locker);
	}
	
	@Override
	public Locker getUserPassCode(Locker locker) {
		Criteria cr = entityManager.unwrap(Session.class).createCriteria(Locker.class);
		cr.add(Restrictions.eq("lockerCode", locker.getLockerCode()));
		Locker userLocker = (Locker) cr.list();
		return userLocker;
	}

	@Override
	@Transactional
	public void deAllocateUser(Locker locker) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(locker);
	}
}
