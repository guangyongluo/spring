package com.vilin.spring.chapter07.bankapp.more.service;

import com.vilin.spring.chapter07.bankapp.more.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
