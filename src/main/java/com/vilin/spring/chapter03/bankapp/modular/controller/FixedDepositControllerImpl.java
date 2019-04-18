package com.vilin.spring.chapter03.bankapp.modular.controller;

import com.vilin.spring.chapter03.bankapp.modular.domain.FixedDepositDetails;
import com.vilin.spring.chapter03.bankapp.modular.service.FixedDepositService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositControllerImpl implements FixedDepositController {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	private FixedDepositService fixedDepositService;
	
	public FixedDepositControllerImpl() {
		logger.info("initializing");
	}
	
	public FixedDepositService getFixedDepositService() {
		return fixedDepositService;
	}
	
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		logger.info("Setting fixedDepositService property");
		this.fixedDepositService = fixedDepositService;
	}
	
	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 10000, 365, "someemail@something.com"));
	}
	
	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}
