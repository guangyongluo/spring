package com.vilin.spring.chapter06.bankapp.bean.profile.service;

import com.vilin.spring.chapter06.bankapp.bean.profile.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}
