package com.vilin.spring.chapter11.bankapp.proxy.service;

import com.vilin.spring.chapter11.bankapp.proxy.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
