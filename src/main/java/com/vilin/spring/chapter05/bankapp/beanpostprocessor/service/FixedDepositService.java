package com.vilin.spring.chapter05.bankapp.beanpostprocessor.service;

import com.vilin.spring.chapter05.bankapp.beanpostprocessor.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
