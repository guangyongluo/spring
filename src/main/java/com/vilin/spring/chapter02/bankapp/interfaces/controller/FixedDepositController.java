package com.vilin.spring.chapter02.bankapp.interfaces.controller;


import com.vilin.spring.chapter02.bankapp.interfaces.domain.FixedDepositDetails;
import com.vilin.spring.chapter02.bankapp.interfaces.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit();

	FixedDepositDetails get();
}
