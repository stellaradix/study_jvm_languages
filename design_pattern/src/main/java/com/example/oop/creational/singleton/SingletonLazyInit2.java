package com.example.oop.creational.singleton;

/**
 * <p>
 * 생성 패턴 > Singleton > LazyInitialization<br>
 * - 객체 필요시 초기화 방식: 멀티스레드 환경에서 동기화 문제 가능성 존재<br>
 * </p>
 * <p>
 * 멀티스레드 환경 동기화 처리 방식 1<br>
 * - synchronized 키워드로 객체 호출 메서드 멀티스레드 접근 제한<br>
 * </p>
 */
public class SingletonLazyInit2 {

	private SingletonLazyInit2() {
	}

	private static SingletonLazyInit2 INSTANCE;

	public static synchronized SingletonLazyInit2 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonLazyInit2();
		}
		return INSTANCE;
	}
}
