package com.vilin.spring.chapter05.bankapp.beanfactorypostprocessor.service;


import com.vilin.spring.chapter05.bankapp.beanfactorypostprocessor.dao.FixedDepositDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositServiceImpl implements FixedDepositService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	private FixedDepositDao fixedDepositDao;

	public FixedDepositServiceImpl(){logger.info("FixedDepositServiceImpl's constructor invoked");}

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}

	@Override
	public void createFixedDeposit(long id, float depositAmount, int tenure, String email) throws Exception {
		// -- create fixed deposit
		fixedDepositDao.createFixedDeposit(id, depositAmount, tenure, email);
	}
}
