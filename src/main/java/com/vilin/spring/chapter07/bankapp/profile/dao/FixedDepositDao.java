package com.vilin.spring.chapter07.bankapp.profile.dao;


import com.vilin.spring.chapter07.bankapp.profile.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
