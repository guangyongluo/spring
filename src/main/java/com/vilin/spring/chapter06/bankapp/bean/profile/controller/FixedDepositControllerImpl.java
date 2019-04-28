package com.vilin.spring.chapter06.bankapp.bean.profile.controller;

import com.vilin.spring.chapter06.bankapp.bean.profile.domain.FixedDepositDetails;
import com.vilin.spring.chapter06.bankapp.bean.profile.service.FixedDepositService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FixedDepositControllerImpl implements FixedDepositController {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	 
	@Autowired
	private FixedDepositService fixedDepositService;
	
	public FixedDepositControllerImpl() {
		logger.info("initializing");
	}
	
	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 10000, 365, "someemail@something.com"));
	}
	
	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}
