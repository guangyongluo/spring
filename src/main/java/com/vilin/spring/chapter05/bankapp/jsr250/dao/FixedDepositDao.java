package com.vilin.spring.chapter05.bankapp.jsr250.dao;

import com.vilin.spring.chapter05.bankapp.jsr250.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
