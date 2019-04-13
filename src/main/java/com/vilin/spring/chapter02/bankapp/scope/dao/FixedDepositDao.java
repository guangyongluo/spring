package com.vilin.spring.chapter02.bankapp.scope.dao;


import com.vilin.spring.chapter02.bankapp.scope.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
