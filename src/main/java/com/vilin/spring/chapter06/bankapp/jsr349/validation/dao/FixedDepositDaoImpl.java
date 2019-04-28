package com.vilin.spring.chapter06.bankapp.jsr349.validation.dao;

import com.vilin.spring.chapter06.bankapp.jsr349.validation.domain.FixedDepositDetails;
import org.springframework.stereotype.Repository;

@Repository(value="myFixedDepositDao")
public class FixedDepositDaoImpl implements FixedDepositDao {
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		return true;
	}
}
