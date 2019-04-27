package com.vilin.spring.chapter06.bankapp.annotations.service;

public interface CustomerRequestService extends MyService {
	void submitRequest(String requestType, String requestDescription);
}
