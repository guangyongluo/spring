package com.vilin.spring.chapter04.bankapp.context.aware.dao;

import com.vilin.spring.chapter04.bankapp.context.aware.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(
            CustomerRegistrationDetails customerRegistrationDetails);
}
