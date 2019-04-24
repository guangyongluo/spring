package com.vilin.spring.chapter05.bankapp.customization.service;


import com.vilin.spring.chapter05.bankapp.customization.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
