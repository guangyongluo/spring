package com.vilin.spring.chapter11.bankapp.advice.dao;

import com.vilin.spring.chapter11.bankapp.advice.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
