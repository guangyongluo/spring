package com.vilin.spring.chapter06.bankapp.annotations.service;


import com.vilin.spring.chapter06.bankapp.annotations.domain.FixedDepositDetails;

public interface FixedDepositService extends MyService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
