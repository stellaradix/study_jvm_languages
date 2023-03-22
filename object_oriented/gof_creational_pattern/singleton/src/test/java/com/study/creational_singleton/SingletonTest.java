package com.study.creational_singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {

	@Test
	@DisplayName("Singleton 기본")
	public void testSingletonBasic() {

		SingletonBasic instance1 = SingletonBasic.getInstance();
		SingletonBasic instance2 = SingletonBasic.getInstance();

		assertSame(instance1, instance2);
	}

	@Test
	@DisplayName("Singleton 이른 초기화")
	public void testSingletonEager() {

		SingletonEager instance1 = SingletonEager.getInstance();
		SingletonEager instance2 = SingletonEager.getInstance();

		assertSame(instance1, instance2);
	}

	@Test
	@DisplayName("Singleton 이른 초기화 > 예외처리")
	public void testSingletonEagerException() {

		SingletonEagerException instance1 = SingletonEagerException.getInstance();
		SingletonEagerException instance2 = SingletonEagerException.getInstance();

		assertSame(instance1, instance2);
	}

	@Test
	@DisplayName("Singleton 늦은 초기화")
	public void testSingletonLazy() {

		SingletonLazy instance1 = SingletonLazy.getInstance();
		SingletonLazy instance2 = SingletonLazy.getInstance();

		assertSame(instance1, instance2);
	}

	@Test
	@DisplayName("Singleton 늦은 초기화 > synchronized method")
	public void testSingletonLazyInitSyncMethod() {

		SingletonLazySyncMethod instance1 = SingletonLazySyncMethod.getInstance();
		SingletonLazySyncMethod instance2 = SingletonLazySyncMethod.getInstance();

		assertSame(instance1, instance2);
	}

	@Test
	@DisplayName("Singleton 늦은 초기화 > 더블 체크 락")
	public void testSingletonLazyDoubleCheck() {

		SingletonLazyDoubleCheck instance1 = SingletonLazyDoubleCheck.getInstance();
		SingletonLazyDoubleCheck instance2 = SingletonLazyDoubleCheck.getInstance();

		assertSame(instance1, instance2);
	}

	@Test
	@DisplayName("Singleton 늦은 초기화 > IoDH")
	public void testSingletonLazyHolder() {

		SingletonLazyOnHolder instance1 = SingletonLazyOnHolder.getInstance();
		SingletonLazyOnHolder instance2 = SingletonLazyOnHolder.getInstance();

		assertSame(instance1, instance2);
	}

	@Test
	@DisplayName("Singleton Enum")
	public void testSingletonEnum() {

		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		SingletonEnum instance2 = SingletonEnum.INSTANCE;

		assertSame(instance1, instance2);
	}
}
