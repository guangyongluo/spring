package com.vilin.spring.chapter06.bankapp.jsr330.service;


import com.vilin.spring.chapter06.bankapp.jsr330.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
