package com.vilin.spring.chapter04.bankapp.lookup.method.service;


import com.vilin.spring.chapter04.bankapp.lookup.method.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
