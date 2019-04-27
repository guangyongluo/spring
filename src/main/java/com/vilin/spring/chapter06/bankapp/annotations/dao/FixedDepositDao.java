package com.vilin.spring.chapter06.bankapp.annotations.dao;

import com.vilin.spring.chapter06.bankapp.annotations.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
