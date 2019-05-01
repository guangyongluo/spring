package com.vilin.spring.chapter08.bankapp.tx.service;


import com.vilin.spring.chapter08.bankapp.tx.domain.FixedDepositDetails;

public interface FixedDepositService {
	int createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
