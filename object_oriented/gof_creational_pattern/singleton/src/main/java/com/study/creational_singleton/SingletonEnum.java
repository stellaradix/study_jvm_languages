package com.study.creational_singleton;

// 클래스 정의는 Reflection 을 통해 싱글톤 파괴 가능
// Enum 으로도 Singleton 가능
public enum SingletonEnum {
	INSTANCE;

	public static void doSomething() {
		// 원하는 작업 수행
	}
}
