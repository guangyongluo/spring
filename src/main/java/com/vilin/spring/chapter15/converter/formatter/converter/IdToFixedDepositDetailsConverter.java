package com.vilin.spring.chapter15.converter.formatter.converter;

import com.vilin.spring.chapter15.converter.formatter.domain.FixedDepositDetails;
import com.vilin.spring.chapter15.converter.formatter.service.FixedDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class IdToFixedDepositDetailsConverter implements
		Converter<String, FixedDepositDetails> {

	@Autowired
	private FixedDepositService fixedDepositService;

	@Override
	public FixedDepositDetails convert(String source) {
		return fixedDepositService.getFixedDeposit(Integer.parseInt(source));
	}
}