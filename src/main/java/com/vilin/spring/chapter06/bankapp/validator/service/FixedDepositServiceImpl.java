package com.vilin.spring.chapter06.bankapp.validator.service;

import com.vilin.spring.chapter06.bankapp.validator.dao.FixedDepositDao;
import com.vilin.spring.chapter06.bankapp.validator.domain.FixedDepositDetails;
import com.vilin.spring.chapter06.bankapp.validator.validator.FixedDepositValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;

@Service(value = "fixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	@Qualifier(value = "myFixedDepositDao")
	private FixedDepositDao myFixedDepositDao;

	@Override
	public void createFixedDeposit(FixedDepositDetails fixedDepositDetails) throws Exception {
		// -- create fixed deposit
		BeanPropertyBindingResult bindingResult = new BeanPropertyBindingResult(fixedDepositDetails, "Errors");
		FixedDepositValidator validator = new FixedDepositValidator();
		validator.validate(fixedDepositDetails, bindingResult);
		if (bindingResult.getErrorCount() > 0) {
			logger.error("Errors were found while validating FixedDepositDetails instance");
		} else {
			myFixedDepositDao.createFixedDeposit(fixedDepositDetails);
			logger.info("Created fixed deposit");
		}
	}
}