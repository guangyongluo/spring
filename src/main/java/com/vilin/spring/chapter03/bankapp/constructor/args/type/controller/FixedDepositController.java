package com.vilin.spring.chapter03.bankapp.constructor.args.type.controller;


import com.vilin.spring.chapter03.bankapp.constructor.args.type.domain.FixedDepositDetails;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit(FixedDepositDetails fixedDepositDetails);

	FixedDepositDetails get();
}
