package com.vilin.spring.chapter06.bankapp.bean.profile.controller;


import com.vilin.spring.chapter06.bankapp.bean.profile.domain.FixedDepositDetails;

public interface FixedDepositController {
	boolean submit();

	FixedDepositDetails get();
}
