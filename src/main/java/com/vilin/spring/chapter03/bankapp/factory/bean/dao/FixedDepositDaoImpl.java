package com.vilin.spring.chapter03.bankapp.factory.bean.dao;

import com.vilin.spring.chapter03.bankapp.factory.bean.domain.FixedDepositDetails;

public class FixedDepositDaoImpl implements FixedDepositDao {
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		return true;
	}
}
