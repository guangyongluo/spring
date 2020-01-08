package com.vilin.spring.chapter08.bankapp.tx.dao;


import com.vilin.spring.chapter08.bankapp.tx.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
