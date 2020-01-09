package com.vilin.spring.chapter09.bankapp.springdata.jpa.exceptions;

public class NoFixedDepositFoundException extends RuntimeException {

	private static final long serialVersionUID = 437902588438864637L;

	public NoFixedDepositFoundException(String msg) {
		super(msg);
	}
}
