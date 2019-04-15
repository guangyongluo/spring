package com.vilin.spring.chapter03.bankapp.inheritance.dao;

import com.vilin.spring.chapter03.bankapp.inheritance.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
