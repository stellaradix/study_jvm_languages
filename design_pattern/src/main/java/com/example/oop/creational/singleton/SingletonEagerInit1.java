package com.example.oop.creational.singleton;

/**
 * <p>
 * 생성 패턴 > Singleton > EagerInitialization<br>
 * - 객체 사용전 초기화 방식: thread-safe<br>
 * </p>
 */
public class SingletonEagerInit1 {

	private SingletonEagerInit1() {
	}

	private static final SingletonEagerInit1 INSTANCE;

	static {
		INSTANCE = new SingletonEagerInit1();
	}

	public static SingletonEagerInit1 getInstance() {
		return INSTANCE;
	}
}
