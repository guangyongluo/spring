package com.vilin.spring.chapter11.bankapp.pointcut.service;

import com.vilin.spring.chapter11.bankapp.pointcut.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
