package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
