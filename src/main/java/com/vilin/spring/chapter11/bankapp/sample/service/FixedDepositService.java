package com.vilin.spring.chapter11.bankapp.sample.service;

import com.vilin.spring.chapter11.bankapp.sample.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
