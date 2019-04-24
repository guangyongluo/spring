package com.vilin.spring.chapter04.bankapp.autowiring.dao;


import com.vilin.spring.chapter04.bankapp.autowiring.domain.FixedDepositDetails;

public class FixedDepositDaoImpl implements FixedDepositDao {
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		return true;
	}
}
