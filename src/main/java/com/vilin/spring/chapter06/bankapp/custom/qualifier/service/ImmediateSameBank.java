package com.vilin.spring.chapter06.bankapp.custom.qualifier.service;

import com.vilin.spring.chapter06.bankapp.custom.qualifier.annotation.BankType;
import com.vilin.spring.chapter06.bankapp.custom.qualifier.annotation.FundTransfer;
import com.vilin.spring.chapter06.bankapp.custom.qualifier.annotation.TransferSpeed;
import com.vilin.spring.chapter06.bankapp.custom.qualifier.domain.Account;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@FundTransfer(transferSpeed = TransferSpeed.IMMEDIATE, bankType= BankType.SAME)
@Service
public class ImmediateSameBank implements FundTransferService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Override
	public void transferFunds(Account sender, Account receiver) {
		logger.info("ImmediateSameBank --> Transfering funds");
	}
}
