package com.vilin.spring.chapter07.bankapp.profile.service;


import com.vilin.spring.chapter07.bankapp.profile.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}
