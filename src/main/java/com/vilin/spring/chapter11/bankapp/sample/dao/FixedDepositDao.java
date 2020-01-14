package com.vilin.spring.chapter11.bankapp.sample.dao;

import com.vilin.spring.chapter11.bankapp.sample.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
