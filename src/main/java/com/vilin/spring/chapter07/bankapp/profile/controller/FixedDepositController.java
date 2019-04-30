package com.vilin.spring.chapter07.bankapp.profile.controller;

import com.vilin.spring.chapter07.bankapp.profile.domain.FixedDepositDetails;

public interface FixedDepositController {
	boolean submit();

	FixedDepositDetails get();
}
