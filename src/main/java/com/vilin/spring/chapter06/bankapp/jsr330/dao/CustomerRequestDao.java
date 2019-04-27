package com.vilin.spring.chapter06.bankapp.jsr330.dao;

import com.vilin.spring.chapter06.bankapp.jsr330.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}
