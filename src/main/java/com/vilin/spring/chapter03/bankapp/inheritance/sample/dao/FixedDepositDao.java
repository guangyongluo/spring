package com.vilin.spring.chapter03.bankapp.inheritance.sample.dao;

import com.vilin.spring.chapter03.bankapp.inheritance.sample.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
