package com.study.creational_singleton;

/**
 * Initialization On Demand Holder (IoDH)
 * <br>
 * 실제 인스턴스가 필요할 때 생성 -> 어플리케이션 초기화 시간이 빠르다
 * <br>
 * Holder 클래스가 로딩될 때, Singleton 인스턴스가 생성되므로,
 * 동시성 이슈가 없다
 */
public class SingletonLazyOnHolder {

	private SingletonLazyOnHolder() {
	}

	/**
	 * getInstance() 호출시 Holder 클래스가 초기화 되고
	 * 클래스 초기화 시에 Thread safe 되는 원자적 특성을 이용해
	 * 동시성 이슈가 발생하지 않도록 프로그래밍
	 */
	public static SingletonLazyOnHolder getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder {

		private static final SingletonLazyOnHolder INSTANCE;

		static {
			INSTANCE = new SingletonLazyOnHolder();
		}
	}
}
