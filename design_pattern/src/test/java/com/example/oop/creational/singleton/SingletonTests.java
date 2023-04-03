package com.example.oop.creational.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p>
 * OOP > 디자인 패턴 > 생성 패턴 > Singleton<br>
 * - 클래스가 오직 하나의 인스턴스(객체)만 생성<br>
 * - 생성자 함수를 private 으로 만들어 외부 접근 차단<br>
 * - static 메서드를 사용하여 유일한 인스턴스 반환: 접근자 메서드<br>
 * </p>
 * <p>
 * 싱글톤 패턴 장점<br>
 * - 유일한 인스턴스 생성: 메모리 낭비 방지<br>
 * - 전역적 인스턴스: 데이터 공유 용이<br>
 * - 유일한 인스턴스: 데이터 일관성 유지<br>
 * </p>
 * <p>
 * 싱글톤 패턴 단점<br>
 * - 유일한 인스턴스 의존성 높아짐: 의존성 복잡성 증가<br>
 * - 다중 스레드 환경에서 동시에 인스턴스 생성 가능성 존재<br>
 * - 동기화 문제 방지 코드: 성능 저하 가능성<br>
 * </p>
 */
public class SingletonTests {

	@Test
	@DisplayName("Singleton 패턴: 객체 사용전 초기화 1")
	public void testSingletonEagerInit1() {
		SingletonEagerInit1 singleton1 = SingletonEagerInit1.getInstance();
		SingletonEagerInit1 singleton2 = SingletonEagerInit1.getInstance();

		assertEquals(singleton1, singleton2);
	}

	@Test
	@DisplayName("Singleton 패턴: 객체 사용전 초기화 2")
	public void testSingletonEagerInit2() {
		SingletonEagerInit2 singleton1 = SingletonEagerInit2.getInstance();
		SingletonEagerInit2 singleton2 = SingletonEagerInit2.getInstance();

		assertEquals(singleton1, singleton2);
	}

	@Test
	@DisplayName("Singleton 패턴: 객체 필요시 초기화 1")
	public void testSingletonLazyInit1() {
		SingletonLazyInit1 singleton1 = SingletonLazyInit1.getInstance();
		SingletonLazyInit1 singleton2 = SingletonLazyInit1.getInstance();

		assertEquals(singleton1, singleton2);
	}

	@Test
	@DisplayName("Singleton 패턴: 객체 필요시 초기화 2")
	public void testSingletonLazyInit2() {
		SingletonLazyInit2 singleton1 = SingletonLazyInit2.getInstance();
		SingletonLazyInit2 singleton2 = SingletonLazyInit2.getInstance();

		assertEquals(singleton1, singleton2);
	}

	@Test
	@DisplayName("Singleton 패턴: 객체 필요시 초기화 3")
	public void testSingletonLazyInit3() {
		SingletonLazyInit3 singleton1 = SingletonLazyInit3.getInstance();
		SingletonLazyInit3 singleton2 = SingletonLazyInit3.getInstance();

		assertEquals(singleton1, singleton2);
	}

	@Test
	@DisplayName("Singleton 패턴: 객체 필요시 초기화 4")
	public void testSingletonLazyInit4() {
		SingletonLazyInit4 singleton1 = SingletonLazyInit4.getInstance();
		SingletonLazyInit4 singleton2 = SingletonLazyInit4.getInstance();

		assertEquals(singleton1, singleton2);
	}

	@Test
	@DisplayName("Singleton 패턴: Enum 방식")
	public void testSingletonEnum() {
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		SingletonEnum singleton2 = SingletonEnum.INSTANCE;

		assertEquals(singleton1, singleton2);
	}
}
