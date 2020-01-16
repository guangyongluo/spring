package com.vilin.spring.chapter11.bankapp.xml.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

@SuppressWarnings("unused")
public class SampleAspect {
	private static Logger logger = LogManager.getLogger(SampleAspect.class);

	public void afterReturningAdvice(JoinPoint joinPoint, int aValue) {
		logger.info("Value returned by " + joinPoint.getSignature().getName()
				+ " method is " + aValue);
	}

	public void afterThrowingAdvice(JoinPoint joinPoint, Throwable exception) {
		logger.info("Exception thrown by " + joinPoint.getSignature().getName()
				+ " Exception type is : " + exception);
	}

	public void afterAdvice(JoinPoint joinPoint) {
		logger.info("After advice executed for "
				+ joinPoint.getSignature().getName());
	}

	public Object aroundAdvice(ProceedingJoinPoint pjp) {
		Object obj = null;
		StopWatch watch = new StopWatch();
		watch.start();
		try {
			obj = pjp.proceed();
		} catch (Throwable throwable) {
			// -- perform any action that you want
		}
		watch.stop();
		logger.info(watch.prettyPrint());
		return obj;
	}
}
