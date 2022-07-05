package com.infotech.locker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.locker.model.Locker;
import com.infotech.locker.service.LockerServise;

@RestController
public class LockerController {
	
	@Autowired
	private LockerServise lockerService;
	
	@GetMapping("/allAvailableLocker")
	public List<Locker> getAllAvailableLocker() {
		return lockerService.getAllAvailableLocker();
	}
	
	@PutMapping("/bookLocker/{lockerCode}/{passCode}")
	public void bookLocker(@PathVariable("lockerCode") String lockerCode, @PathVariable("passCode") String passCode, @RequestBody Locker locker) {
		locker.setLockerCode(lockerCode);
		locker.setPassCode(passCode);
		lockerService.bookLocker(locker);
	}
	
	@PutMapping("/checkOutLocker/{lockerCode}/{passCode}/{transactionId}")
	public void checkOutLocker(@PathVariable("lockerCode") String lockerCode, 
			@PathVariable("passCode") String passCode, @PathVariable("transactionId") String transactionId, @RequestBody Locker locker) {
		locker.setLockerCode(lockerCode);
		locker.setPassCode(passCode);
		lockerService.checkOutLocker(transactionId, locker);
	}
}
