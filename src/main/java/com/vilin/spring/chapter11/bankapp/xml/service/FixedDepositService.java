package com.vilin.spring.chapter11.bankapp.xml.service;


import com.vilin.spring.chapter11.bankapp.xml.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
