package com.vilin.spring.chapter08.bankapp.jdbc.dao;


import com.vilin.spring.chapter08.bankapp.jdbc.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
