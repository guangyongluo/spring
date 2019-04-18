package com.vilin.spring.chapter03.bankapp.modular.controller;

import com.vilin.spring.chapter03.bankapp.modular.domain.FixedDepositDetails;
import com.vilin.spring.chapter03.bankapp.modular.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit();

	FixedDepositDetails get();
}
