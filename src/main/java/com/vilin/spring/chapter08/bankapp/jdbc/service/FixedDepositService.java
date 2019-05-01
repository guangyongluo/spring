package com.vilin.spring.chapter08.bankapp.jdbc.service;


import com.vilin.spring.chapter08.bankapp.jdbc.domain.FixedDepositDetails;

public interface FixedDepositService {
	int createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
