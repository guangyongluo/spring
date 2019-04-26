package com.vilin.spring.chapter05.bankapp.beanfactorypostprocessor.service;


import com.vilin.spring.chapter05.bankapp.beanfactorypostprocessor.dao.FixedDepositDao;

public class FixedDepositServiceImpl implements FixedDepositService {
	private FixedDepositDao fixedDepositDao;

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}

	@Override
	public void createFixedDeposit(long id, float depositAmount, int tenure, String email) throws Exception {
		// -- create fixed deposit
		fixedDepositDao.createFixedDeposit(id, depositAmount, tenure, email);
	}
}
