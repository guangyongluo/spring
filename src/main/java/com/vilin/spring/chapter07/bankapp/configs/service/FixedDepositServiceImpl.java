package com.vilin.spring.chapter07.bankapp.configs.service;

import com.vilin.spring.chapter07.bankapp.configs.dao.FixedDepositDao;
import com.vilin.spring.chapter07.bankapp.configs.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService {
	private FixedDepositDao fixedDepositDao;

	public FixedDepositServiceImpl(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}

	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		fixedDepositDao.createFixedDeposit(fdd);
	}
}
