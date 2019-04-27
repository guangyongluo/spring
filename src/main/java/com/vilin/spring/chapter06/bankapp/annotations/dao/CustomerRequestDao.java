package com.vilin.spring.chapter06.bankapp.annotations.dao;

import com.vilin.spring.chapter06.bankapp.annotations.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}
