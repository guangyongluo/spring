package com.vilin.spring.chapter05.bankapp.jsr250.service;


import com.vilin.spring.chapter05.bankapp.jsr250.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
