package com.vilin.spring.chapter07.bankapp.more.service;

import com.vilin.spring.chapter07.bankapp.more.dao.FixedDepositDao;
import com.vilin.spring.chapter07.bankapp.more.domain.FixedDepositDetails;

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
