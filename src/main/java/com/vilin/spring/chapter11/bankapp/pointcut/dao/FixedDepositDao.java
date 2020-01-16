package com.vilin.spring.chapter11.bankapp.pointcut.dao;

import com.vilin.spring.chapter11.bankapp.pointcut.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
