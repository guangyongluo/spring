package com.vilin.spring.chapter07.bankapp.configuration.dao;


import com.vilin.spring.chapter07.bankapp.configuration.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails);
}
