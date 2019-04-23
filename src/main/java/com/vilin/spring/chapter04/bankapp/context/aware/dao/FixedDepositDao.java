package com.vilin.spring.chapter04.bankapp.context.aware.dao;

import com.vilin.spring.chapter04.bankapp.context.aware.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
