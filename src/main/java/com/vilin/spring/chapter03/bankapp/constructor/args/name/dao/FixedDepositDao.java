package com.vilin.spring.chapter03.bankapp.constructor.args.name.dao;

import com.vilin.spring.chapter03.bankapp.constructor.args.name.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
