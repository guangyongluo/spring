package com.vilin.spring.chapter09.bankapp.javaconfig.jpa.service;

import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.dao.BankAccountDao;
import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.dao.FixedDepositDao;
import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.domain.FixedDepositDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class FixedDepositServiceImpl implements FixedDepositService {

	@Autowired
	private FixedDepositDao myFixedDepositDao;

	@Autowired
	private BankAccountDao bankAccountDao;

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
