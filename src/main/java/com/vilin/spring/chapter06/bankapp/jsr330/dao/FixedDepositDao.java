package com.vilin.spring.chapter06.bankapp.jsr330.dao;

import com.vilin.spring.chapter06.bankapp.jsr330.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
