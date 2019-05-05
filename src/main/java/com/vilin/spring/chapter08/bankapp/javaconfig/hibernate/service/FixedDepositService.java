package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.domain.FixedDepositDetails;

public interface FixedDepositService {
	int createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
