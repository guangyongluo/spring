package com.vilin.spring.chapter06.bankapp.validator.validator;

import com.vilin.spring.chapter06.bankapp.validator.domain.FixedDepositDetails;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FixedDepositValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return FixedDepositDetails.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		FixedDepositDetails fdd = (FixedDepositDetails) target;
		if (fdd.getDepositAmount() == 0) {
			errors.reject("zeroDepositAmount");
		}
	}
}
