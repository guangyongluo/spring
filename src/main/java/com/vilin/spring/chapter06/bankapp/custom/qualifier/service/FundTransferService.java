package com.vilin.spring.chapter06.bankapp.custom.qualifier.service;

import com.vilin.spring.chapter06.bankapp.custom.qualifier.domain.Account;

public interface FundTransferService {
	void transferFunds(Account sender, Account receiver);
}
