package com.study.creational_singleton;

public class SingletonLazySyncMethod {

	private static SingletonLazySyncMethod INSTANCE;

	private SingletonLazySyncMethod() {
	}

	// 동시성 이슈 해결하기 위해 synchronized method 이용 성능저하 발생 가능
	// synchronized 키워드 비용이 크기 때문에 Double checked Locking 이 고안
	public static synchronized SingletonLazySyncMethod getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonLazySyncMethod();
		}
		return INSTANCE;
	}
}
