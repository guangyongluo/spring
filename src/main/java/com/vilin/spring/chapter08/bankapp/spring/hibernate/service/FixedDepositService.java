package com.vilin.spring.chapter08.bankapp.spring.hibernate.service;

import com.vilin.spring.chapter08.bankapp.spring.hibernate.domain.FixedDepositDetails;

public interface FixedDepositService {
	int createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
