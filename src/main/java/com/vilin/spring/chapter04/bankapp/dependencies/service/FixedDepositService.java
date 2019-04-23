package com.vilin.spring.chapter04.bankapp.dependencies.service;


import com.vilin.spring.chapter04.bankapp.dependencies.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
