package com.vilin.spring.chapter06.bankapp.jsr349.validation.service;


import com.vilin.spring.chapter06.bankapp.jsr349.validation.domain.FixedDepositDetails;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
