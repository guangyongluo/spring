package com.vilin.spring.chapter07.bankapp.profile.service;

import com.vilin.spring.chapter07.bankapp.profile.dao.FixedDepositDao;
import com.vilin.spring.chapter07.bankapp.profile.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositServiceImpl implements FixedDepositService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	private FixedDepositDao fixedDepositDao;

	public FixedDepositServiceImpl() {
		logger.info("initializing");
	}

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDepositDao.getFixedDepositDetails(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		return fixedDepositDao.createFixedDeposit(fdd);
	}
}
