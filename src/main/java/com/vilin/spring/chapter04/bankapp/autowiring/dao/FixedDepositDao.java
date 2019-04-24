package com.vilin.spring.chapter04.bankapp.autowiring.dao;

import com.vilin.spring.chapter04.bankapp.autowiring.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
