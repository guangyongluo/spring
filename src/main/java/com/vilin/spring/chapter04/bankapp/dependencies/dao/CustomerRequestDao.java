package com.vilin.spring.chapter04.bankapp.dependencies.dao;

import com.vilin.spring.chapter04.bankapp.dependencies.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}
