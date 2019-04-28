package com.vilin.spring.chapter06.bankapp.jsr349.validation.service;

import com.vilin.spring.chapter06.bankapp.jsr349.validation.dao.FixedDepositDao;
import com.vilin.spring.chapter06.bankapp.jsr349.validation.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Validator;

@Service(value="fixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private Validator validator;
	
	@Autowired
	@Qualifier(value="myFixedDepositDao")
	private FixedDepositDao myFixedDepositDao;
	
	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		BeanPropertyBindingResult bindingResult = new BeanPropertyBindingResult(fdd, "Errors");
		validator.validate(fdd, bindingResult);
		if(bindingResult.getErrorCount() > 0) {
			logger.error("Errors were found while validating FixedDepositDetails instance");
		} else {
			myFixedDepositDao.createFixedDeposit(fdd);
			logger.info("Created fixed deposit");
		}
	}
}
