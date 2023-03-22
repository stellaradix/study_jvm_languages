package com.study.creational_singleton;

/**
 * Eager Initialization (이른 초기화)
 * <br>
 * 클래스 로딩 시점에 인스턴스 생성 -> 어플리케이션 초기화 시간이 증가
 * <br>
 * 어플리케이션에서 클래스를 이용하지 않더라도 초기화되어 메모리에 존재
 */
public class SingletonEager {

	private static final SingletonEager INSTANCE;

	static {
		INSTANCE = new SingletonEager();
	}

	private SingletonEager() {
	}

	public static SingletonEager getInstance() {
		return INSTANCE;
	}
}
