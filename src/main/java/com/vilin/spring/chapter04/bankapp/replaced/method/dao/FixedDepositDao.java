package com.vilin.spring.chapter04.bankapp.replaced.method.dao;

import com.vilin.spring.chapter04.bankapp.replaced.method.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
