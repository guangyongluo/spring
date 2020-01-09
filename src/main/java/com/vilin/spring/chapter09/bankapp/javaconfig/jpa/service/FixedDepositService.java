package com.vilin.spring.chapter09.bankapp.javaconfig.jpa.service;

import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.domain.FixedDepositDetails;

public interface FixedDepositService {
	int createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
