package com.example.oop.creational.singleton;

/**
 * <p>
 * 생성 패턴 > Singleton > EagerInitialization<br>
 * - 객체 사용전 초기화 방식: thread-safe<br>
 * </p>
 * <p>
 * 생성자에 RuntimeException 관리 추가
 * </p>
 */
public class SingletonEagerInit2 {

	private SingletonEagerInit2() {
	}

	private static final SingletonEagerInit2 INSTANCE;

	static {
		try {
			INSTANCE = new SingletonEagerInit2();
		} catch (Exception e) {
			throw new RuntimeException("싱글톤 객체 생성 중 Exception 발생");
		}
	}

	public static SingletonEagerInit2 getInstance() {
		return INSTANCE;
	}
}
