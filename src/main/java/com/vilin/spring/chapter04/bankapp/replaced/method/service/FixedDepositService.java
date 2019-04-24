package com.vilin.spring.chapter04.bankapp.replaced.method.service;

import com.vilin.spring.chapter04.bankapp.replaced.method.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
