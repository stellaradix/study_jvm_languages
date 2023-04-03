package com.example.oop.creational.singleton;

/**
 * <p>
 * 생성 패턴 > Singleton > LazyInitialization<br>
 * - 객체 필요시 초기화 방식: 멀티스레드 환경에서 동기화 문제 가능성 존재<br>
 * </p>
 */
public class SingletonLazyInit1 {

	private SingletonLazyInit1() {
	}

	private static SingletonLazyInit1 INSTANCE;

	public static SingletonLazyInit1 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonLazyInit1();
		}
		return INSTANCE;
	}
}
