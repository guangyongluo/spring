package com.vilin.spring.chapter03.bankapp.factory.bean.service;

import com.vilin.spring.chapter03.bankapp.factory.bean.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd);
}
