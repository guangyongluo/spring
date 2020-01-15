package com.vilin.spring.chapter11.bankapp.proxy.dao;

import com.vilin.spring.chapter11.bankapp.proxy.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
