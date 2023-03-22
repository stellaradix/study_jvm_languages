package com.study.creational_singleton;

// Eager Initialization 에 Exception Handling 부분 추가
public class SingletonEagerException {

	private static final SingletonEagerException INSTANCE;

	private SingletonEagerException() {
	}

	static {
		try {
			INSTANCE = new SingletonEagerException();
		} catch (Exception e) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}

	public static SingletonEagerException getInstance() {
		return INSTANCE;
	}
}
