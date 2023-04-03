package com.example.oop.creational.singleton;

/**
 * <p>
 * 생성 패턴 > Singleton > LazyInitialization<br>
 * - 객체 필요시 초기화 방식: 멀티스레드 환경에서 동기화 문제 가능성 존재<br>
 * </p>
 * <p>
 * 멀티스레드 환경 동기화 처리 방식 4: Initialization On Demand Holder (IoDH)<br>
 * - 싱글톤 객체를 필드로 가지는 내부 클래스를 이용하는 방식<br>
 * - 클래스가 메모리에 로드되고 초기화 될 때 thread-safe 특성 이용<br>
 * </p>
 */
public class SingletonLazyInit4 {

	private SingletonLazyInit4() {
	}

	public static SingletonLazyInit4 getInstance() {
		return Holder.INSTANCE;
	}

	private static class Holder {

		private static final SingletonLazyInit4 INSTANCE;

		static {
			INSTANCE = new SingletonLazyInit4();
		}
	}
}
