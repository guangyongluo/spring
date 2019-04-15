package com.vilin.spring.chapter03.bankapp.constructor.args.type.dao;

import com.vilin.spring.chapter03.bankapp.constructor.args.type.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
