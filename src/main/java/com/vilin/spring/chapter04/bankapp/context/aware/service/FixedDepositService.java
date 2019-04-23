package com.vilin.spring.chapter04.bankapp.context.aware.service;

import com.vilin.spring.chapter04.bankapp.context.aware.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
