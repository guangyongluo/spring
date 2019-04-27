package com.vilin.spring.chapter06.bankapp.jsr330.dao;

import com.vilin.spring.chapter06.bankapp.jsr330.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(
            CustomerRegistrationDetails customerRegistrationDetails);
}
