package com.vilin.spring.chapter07.bankapp.configs.dao;

import com.vilin.spring.chapter07.bankapp.configs.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
