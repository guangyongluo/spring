package com.vilin.spring.chapter03.bankapp.modular.dao;

import com.vilin.spring.chapter03.bankapp.modular.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
