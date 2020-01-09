package com.vilin.spring.chapter09.bankapp.javaconfig.jpa.dao;


import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
