package com.vilin.spring.chapter02.bankapp.scope;

import static org.junit.Assert.assertNotSame;

import com.vilin.spring.chapter02.bankapp.scope.domain.FixedDepositDetails;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PrototypeTest {
	private static ApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter02/bankapp/scope/applicationContext.xml");
	}

	@Test
	public void testInstances() {
		FixedDepositDetails fixedDepositDetails1 = (FixedDepositDetails) context.getBean("fixedDepositDetails");
		FixedDepositDetails fixedDepositDetails2 = (FixedDepositDetails) context.getBean("fixedDepositDetails");

		assertNotSame("Same FixedDepositDetails instances", fixedDepositDetails1, fixedDepositDetails2);
	}
}