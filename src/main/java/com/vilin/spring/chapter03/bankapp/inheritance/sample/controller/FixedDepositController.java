package com.vilin.spring.chapter03.bankapp.inheritance.sample.controller;


import com.vilin.spring.chapter03.bankapp.inheritance.sample.domain.FixedDepositDetails;
import com.vilin.spring.chapter03.bankapp.inheritance.sample.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit(FixedDepositDetails fixedDepositDetails);

	FixedDepositDetails get();
}
