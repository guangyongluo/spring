package com.vilin.spring.chapter07.bankapp.configuration.dao;

import com.vilin.spring.chapter07.bankapp.configuration.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
