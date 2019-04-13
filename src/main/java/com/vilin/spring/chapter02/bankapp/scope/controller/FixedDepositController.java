package com.vilin.spring.chapter02.bankapp.scope.controller;


import com.vilin.spring.chapter02.bankapp.scope.domain.FixedDepositDetails;
import com.vilin.spring.chapter02.bankapp.scope.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit(FixedDepositDetails fixedDepositDetails);

	FixedDepositDetails get();
}
