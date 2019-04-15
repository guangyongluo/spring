package com.vilin.spring.chapter03.bankapp.inheritance.controller;

import com.vilin.spring.chapter03.bankapp.inheritance.domain.FixedDepositDetails;
import com.vilin.spring.chapter03.bankapp.inheritance.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit(FixedDepositDetails fixedDepositDetails);

	FixedDepositDetails get();
}
