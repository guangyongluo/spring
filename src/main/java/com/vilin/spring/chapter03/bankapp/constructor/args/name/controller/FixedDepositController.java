package com.vilin.spring.chapter03.bankapp.constructor.args.name.controller;

import com.vilin.spring.chapter03.bankapp.constructor.args.name.domain.FixedDepositDetails;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit(FixedDepositDetails fixedDepositDetails);

	FixedDepositDetails get();
}
