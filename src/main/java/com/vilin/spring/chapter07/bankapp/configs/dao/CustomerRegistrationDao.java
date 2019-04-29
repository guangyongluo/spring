package com.vilin.spring.chapter07.bankapp.configs.dao;


import com.vilin.spring.chapter07.bankapp.configs.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails);
}
