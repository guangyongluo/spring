package com.vilin.spring.chapter06.bankapp.custom.qualifier.service;

import com.vilin.spring.chapter06.bankapp.custom.qualifier.annotation.BankType;
import com.vilin.spring.chapter06.bankapp.custom.qualifier.annotation.FundTransfer;
import com.vilin.spring.chapter06.bankapp.custom.qualifier.annotation.TransferSpeed;
import com.vilin.spring.chapter06.bankapp.custom.qualifier.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FundTransferProcessor {
	@Autowired
	@FundTransfer(transferSpeed = TransferSpeed.IMMEDIATE, bankType = BankType.SAME)
	private FundTransferService sameBankImmediateFundTransferService;
	
	@Autowired
	@FundTransfer(transferSpeed = TransferSpeed.IMMEDIATE, bankType = BankType.DIFFERENT)
	private FundTransferService diffBankImmediateFundTransferService;

	public void sameBankImmediateFundTransferService() {
		sameBankImmediateFundTransferService.transferFunds(new Account(), new Account());
	}
	
	public void diffBankImmediateFundTransferService() {
		diffBankImmediateFundTransferService.transferFunds(new Account(), new Account());
	}
	
}
