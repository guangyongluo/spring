package com.vilin.spring.chapter07.bankapp.configs.service;


import com.vilin.spring.chapter07.bankapp.configs.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
