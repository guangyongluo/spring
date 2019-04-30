package com.vilin.spring.chapter07.bankapp.profile.controller;

import com.vilin.spring.chapter07.bankapp.profile.domain.FixedDepositDetails;
import com.vilin.spring.chapter07.bankapp.profile.service.FixedDepositService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositControllerImpl implements FixedDepositController {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	 
	private FixedDepositService fixedDepositService;
	
	public FixedDepositControllerImpl() {
		logger.info("initializing");
	}

	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		this.fixedDepositService = fixedDepositService;
	}
	
	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 10000, 365, "someemail@something.com"));
	}
	
	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}
