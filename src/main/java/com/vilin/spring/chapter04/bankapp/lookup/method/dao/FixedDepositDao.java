package com.vilin.spring.chapter04.bankapp.lookup.method.dao;


import com.vilin.spring.chapter04.bankapp.lookup.method.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
