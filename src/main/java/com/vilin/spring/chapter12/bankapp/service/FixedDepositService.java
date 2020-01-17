package com.vilin.spring.chapter12.bankapp.service;


import com.vilin.spring.chapter12.bankapp.domain.FixedDepositDetails;

import java.util.List;

public interface FixedDepositService {
	List<FixedDepositDetails> getFixedDeposits();

	void saveFixedDeposit(FixedDepositDetails fixedDepositDetails);

	void closeFixedDeposit(int fixedDepositId);

	FixedDepositDetails getFixedDeposit(int fixedDepositId);
	
	void editFixedDeposit(FixedDepositDetails fixedDepositDetails);
}
