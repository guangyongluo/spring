package com.vilin.spring.chapter06.bankapp.jsr330.service;

import com.vilin.spring.chapter06.bankapp.jsr330.dao.FixedDepositDao;
import com.vilin.spring.chapter06.bankapp.jsr330.domain.FixedDepositDetails;

import javax.inject.Inject;
import javax.inject.Named;

@Named(value="fixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
	
	@Inject
	@Named(value="myFixedDepositDao")
	private FixedDepositDao myFixedDepositDao;
	
	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		myFixedDepositDao.createFixedDeposit(fdd);
	}
}
