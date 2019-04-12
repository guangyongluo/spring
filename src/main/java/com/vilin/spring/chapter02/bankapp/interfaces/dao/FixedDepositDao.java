package com.vilin.spring.chapter02.bankapp.interfaces.dao;


import com.vilin.spring.chapter02.bankapp.interfaces.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
