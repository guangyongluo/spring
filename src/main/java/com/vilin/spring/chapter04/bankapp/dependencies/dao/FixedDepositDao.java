package com.vilin.spring.chapter04.bankapp.dependencies.dao;

import com.vilin.spring.chapter04.bankapp.dependencies.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
