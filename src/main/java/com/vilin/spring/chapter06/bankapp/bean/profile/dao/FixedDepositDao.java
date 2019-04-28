package com.vilin.spring.chapter06.bankapp.bean.profile.dao;


import com.vilin.spring.chapter06.bankapp.bean.profile.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
