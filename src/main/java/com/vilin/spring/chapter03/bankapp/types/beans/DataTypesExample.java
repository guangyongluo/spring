package com.vilin.spring.chapter03.bankapp.types.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.ConstructorProperties;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DataTypesExample {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@SuppressWarnings("rawtypes")
	@ConstructorProperties({ "byteArrayType", "charType", "charArray",
			"classType", "currencyType", "booleanType", "dateType", "longType",
			"doubleType", "propertiesType", "listType", "mapType", "setType",
			"anotherPropertiesType" })
	public DataTypesExample(byte[] byteArrayType, char charType,
			char[] charArray, Class classType, Currency currencyType,
			boolean booleanType, Date dateType, long longType,
			double doubleType, Properties propertiesType, List<Integer> listType,
			Map mapType, Set setType, Properties anotherPropertiesType) {
		logger.info("byteArrayType " + new String(byteArrayType));
		logger.info("charType " + charType);
		logger.info("charArray " + new String(charArray));
		logger.info("classType " + classType.getName());
		logger.info("currencyType " + currencyType.getSymbol());
		logger.info("booleanType " + booleanType);
		logger.info("dateType " + dateType);
		logger.info("longType " + longType);
		logger.info("doubleType " + doubleType);
		logger.info("propertiesType " + propertiesType);
		logger.info("listType " + listType);
		logger.info("mapType " + mapType);
		logger.info("setType " + setType);
		logger.info("anotherPropertiesType " + anotherPropertiesType);
	}
}
