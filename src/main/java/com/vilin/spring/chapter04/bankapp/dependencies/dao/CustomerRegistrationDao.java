package com.vilin.spring.chapter04.bankapp.dependencies.dao;

import com.vilin.spring.chapter04.bankapp.dependencies.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(
            CustomerRegistrationDetails customerRegistrationDetails);
}
