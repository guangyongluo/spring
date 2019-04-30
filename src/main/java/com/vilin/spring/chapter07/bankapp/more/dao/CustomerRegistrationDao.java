package com.vilin.spring.chapter07.bankapp.more.dao;

import com.vilin.spring.chapter07.bankapp.more.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails);
}
