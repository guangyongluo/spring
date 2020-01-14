package com.vilin.spring.chapter10.bankapp.service;

import com.vilin.spring.chapter10.bankapp.domain.FixedDepositDetails;

import java.util.List;

public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
	List<FixedDepositDetails> findFixedDepositsByBankAccount(int bankAccountId);
	FixedDepositDetails getFixedDepositFromCache(int fixedDepositId);
}
