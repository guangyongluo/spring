package com.vilin.spring.chapter07.bankapp.more.service;

public interface CustomerRegistrationService {
	void setAccountNumber(String accountNumber);
	void setAddress(String address);
	void setDebitCardNumber(String cardNumber);
	void register();
}
