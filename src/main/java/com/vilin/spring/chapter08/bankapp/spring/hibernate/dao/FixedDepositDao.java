package com.vilin.spring.chapter08.bankapp.spring.hibernate.dao;

import com.vilin.spring.chapter08.bankapp.spring.hibernate.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
