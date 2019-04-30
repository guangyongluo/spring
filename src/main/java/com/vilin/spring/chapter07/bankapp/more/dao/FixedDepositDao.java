package com.vilin.spring.chapter07.bankapp.more.dao;

import com.vilin.spring.chapter07.bankapp.more.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
