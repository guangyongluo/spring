package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.BankAccountDao;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.FixedDepositDao;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.domain.FixedDepositDetails;
import org.springframework.transaction.annotation.Transactional;

public class FixedDepositServiceImpl implements FixedDepositService {

	private FixedDepositDao myFixedDepositDao;

	private BankAccountDao bankAccountDao;

	public void setBankAccountDao(BankAccountDao bankAccountDao) {
		this.bankAccountDao = bankAccountDao;
	}
	
	public void setMyFixedDepositDao(FixedDepositDao myFixedDepositDao) {
		this.myFixedDepositDao = myFixedDepositDao;
	}
	
	@Override
	@Transactional
	public int createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		bankAccountDao.subtractFromAccount(fdd.getBankAccountId()
				.getAccountId(), fdd.getFdAmount());
		return myFixedDepositDao.createFixedDeposit(fdd);
	}

	@Override
	@Transactional
	public FixedDepositDetails getFixedDeposit(int fixedDepositId) {
		return myFixedDepositDao.getFixedDeposit(fixedDepositId);
	}
}
