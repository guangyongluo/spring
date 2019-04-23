package com.vilin.spring.chapter04.bankapp.lookup.method.dao;


import com.vilin.spring.chapter04.bankapp.lookup.method.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails);
}
