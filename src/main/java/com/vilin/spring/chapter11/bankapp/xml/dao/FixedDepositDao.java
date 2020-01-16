package com.vilin.spring.chapter11.bankapp.xml.dao;

import com.vilin.spring.chapter11.bankapp.xml.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
