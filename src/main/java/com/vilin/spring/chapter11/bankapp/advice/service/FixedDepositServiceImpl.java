package com.vilin.spring.chapter11.bankapp.advice.service;

import com.vilin.spring.chapter11.bankapp.advice.dao.FixedDepositDao;
import com.vilin.spring.chapter11.bankapp.advice.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
	private static Logger logger = LogManager.getLogger(FixedDepositServiceImpl.class);

	@Autowired
	private FixedDepositDao fixedDepositDao;

	public void createFixedDeposit(final FixedDepositDetails fdd)
			throws Exception {
		logger.info("createFixedDeposit method invoked");
		fixedDepositDao.createFixedDeposit(new FixedDepositDetails(1, 100, 12, "somedomain@someemail.com"));
	}

	@Override
	public FixedDepositDetails getFixedDeposit(int fixedDepositId) {
		logger.info("getFixedDeposit method invoked with fixedDepositId "
				+ fixedDepositId);
		return fixedDepositDao.getFixedDeposit(fixedDepositId);
	}
}
