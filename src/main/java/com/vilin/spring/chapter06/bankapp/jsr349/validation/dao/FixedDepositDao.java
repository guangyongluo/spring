package com.vilin.spring.chapter06.bankapp.jsr349.validation.dao;

import com.vilin.spring.chapter06.bankapp.jsr349.validation.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
