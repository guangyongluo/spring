package com.vilin.spring.chapter06.bankapp.validator.dao;

import com.vilin.spring.chapter06.bankapp.validator.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
