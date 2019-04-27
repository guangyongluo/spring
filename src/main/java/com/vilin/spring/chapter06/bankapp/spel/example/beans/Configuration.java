package com.vilin.spring.chapter06.bankapp.spel.example.beans;

public class Configuration {
	public static String environment = "DEV";

	public String getCountry() {
		return "Some country";
	}

	public String getState() {
		return "Some state";
	}
}
