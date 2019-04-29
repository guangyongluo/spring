package com.vilin.spring.chapter07.bankapp.configuration.service;

import com.vilin.spring.chapter07.bankapp.configuration.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
