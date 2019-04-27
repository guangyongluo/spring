package com.vilin.spring.chapter06.bankapp.jsr330.dao;

import com.vilin.spring.chapter06.bankapp.jsr330.domain.FixedDepositDetails;

import javax.inject.Named;

@Named(value="myFixedDepositDao")
public class FixedDepositDaoImpl implements FixedDepositDao {
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		return true;
	}
}
