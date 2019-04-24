package com.vilin.spring.chapter04.bankapp.autowiring.service;

import com.vilin.spring.chapter04.bankapp.autowiring.dao.FixedDepositDao;
import com.vilin.spring.chapter04.bankapp.autowiring.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService {
	private FixedDepositDao myFixedDepositDao;

	public void setMyFixedDepositDao(FixedDepositDao myFixedDepositDao) {
		this.myFixedDepositDao = myFixedDepositDao;
	}

	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		myFixedDepositDao.createFixedDeposit(fdd);
	}
}
