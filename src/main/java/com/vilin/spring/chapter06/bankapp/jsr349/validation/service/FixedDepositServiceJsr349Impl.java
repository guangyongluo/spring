package com.vilin.spring.chapter06.bankapp.jsr349.validation.service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import com.vilin.spring.chapter06.bankapp.jsr349.validation.dao.FixedDepositDao;
import com.vilin.spring.chapter06.bankapp.jsr349.validation.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Set;

@Service(value = "fixedDepositServiceJsr349")
public class FixedDepositServiceJsr349Impl implements FixedDepositService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private Validator validator;

	@Autowired
	@Qualifier(value = "myFixedDepositDao")
	private FixedDepositDao myFixedDepositDao;

	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		Set<ConstraintViolation<FixedDepositDetails>> violations = validator.validate(fdd);
		Iterator<ConstraintViolation<FixedDepositDetails>> itr = violations.iterator();
		if (itr.hasNext()) {
			logger.error("Errors were found while validating FixedDepositDetails instance");
		} else {
			myFixedDepositDao.createFixedDeposit(fdd);
			logger.info("Created fixed deposit");
		}
	}
}
