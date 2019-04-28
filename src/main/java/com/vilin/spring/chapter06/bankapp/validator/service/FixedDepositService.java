package com.vilin.spring.chapter06.bankapp.validator.service;


import com.vilin.spring.chapter06.bankapp.validator.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
