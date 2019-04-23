package com.vilin.spring.chapter04.bankapp.dependencies.dao;

import com.vilin.spring.chapter04.bankapp.dependencies.domain.FixedDepositDetails;

public class FixedDepositDaoImpl implements FixedDepositDao {
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		return true;
	}
}
