package com.example.oop.creational.singleton;

/**
 * <p>
 * 생성 패턴 > Singleton > LazyInitialization<br>
 * - 객체 필요시 초기화 방식: 멀티스레드 환경에서 동기화 문제 가능성 존재<br>
 * </p>
 * <p>
 * 멀티스레드 환경 동기화 처리 방식 2: double checked blocking<br>
 * - synchronized 키워드로 객체 생성 부분만 멀티스레드 접근 제한<br>
 * - Java 5 이전 버전에서는 불안정 가능성: 이후 volatile 로 변수의 가시성 보장<br>
 * </p>
 */
public class SingletonLazyInit3 {

	private SingletonLazyInit3() {
	}

	private static volatile SingletonLazyInit3 INSTANCE;

	public static SingletonLazyInit3 getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonLazyInit3.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonLazyInit3();
				}
			}
		}
		return INSTANCE;
	}
}
