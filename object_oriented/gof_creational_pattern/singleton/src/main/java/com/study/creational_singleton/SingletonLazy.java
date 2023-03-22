package com.study.creational_singleton;

/**
 * Lazy Initialization (늦은 초기화)
 * <br>
 * 실제 인스턴스가 필요할 때 생성 -> 어플리케이션 초기화 시간이 빠르다
 * <br>
 * 멀티스레딩 환경에서 동시 접근할 때, 동시성 이슈 발생 가능
 */
public class SingletonLazy {

	private static SingletonLazy INSTANCE;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonLazy();
		}
		return INSTANCE;
	}
}
