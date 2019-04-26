package com.vilin.spring.chapter05.bankapp.beanfactorypostprocessor.common;


public interface DependencyResolver {
	void resolveDependency(MyApplicationContext myApplicationContext);
}
