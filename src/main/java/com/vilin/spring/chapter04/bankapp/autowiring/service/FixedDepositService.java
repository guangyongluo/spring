package com.vilin.spring.chapter04.bankapp.autowiring.service;


import com.vilin.spring.chapter04.bankapp.autowiring.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
