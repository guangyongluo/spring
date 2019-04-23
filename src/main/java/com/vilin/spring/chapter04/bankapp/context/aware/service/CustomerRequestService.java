package com.vilin.spring.chapter04.bankapp.context.aware.service;

public interface CustomerRequestService {
	void submitRequest(String requestType, String requestDescription);
}
