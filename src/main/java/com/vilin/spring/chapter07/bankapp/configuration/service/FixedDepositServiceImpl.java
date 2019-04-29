package com.vilin.spring.chapter07.bankapp.configuration.service;

import com.vilin.spring.chapter07.bankapp.configuration.dao.FixedDepositDao;
import com.vilin.spring.chapter07.bankapp.configuration.domain.FixedDepositDetails;
import org.springframework.beans.factory.annotation.Autowired;

public class FixedDepositServiceImpl implements FixedDepositService {
	
	@Autowired
	private FixedDepositDao fixedDepositDao;
	
	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		fixedDepositDao.createFixedDeposit(fdd);
	}
}
