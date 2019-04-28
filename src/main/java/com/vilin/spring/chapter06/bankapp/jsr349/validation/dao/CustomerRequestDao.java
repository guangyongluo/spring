package com.vilin.spring.chapter06.bankapp.jsr349.validation.dao;

import com.vilin.spring.chapter06.bankapp.jsr349.validation.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
} 
