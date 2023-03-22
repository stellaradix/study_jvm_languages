package com.study.creational_singleton;

/**
 * Double Checked Locking (이중 검사 락)
 * <br>
 * 실제 인스턴스가 필요할 때 생성 -> 어플리케이션 초기화 시간이 빠르다
 * <br>
 * 멀티스레딩 환경에서 synchronized 블록을 사용하므로,
 * 성능상의 오버헤드 발생 가능
 */
public class SingletonLazyDoubleCheck {

	private volatile static SingletonLazyDoubleCheck INSTANCE;

	private SingletonLazyDoubleCheck() {
	}

	/**
	 * method 수준에서 lock 을 걸지 않고,
	 * INSTANCE 가 null 일 경우만 synchronized 가 동작
	 * 성능 저하 부분을 줄여준다
	 */
	public static SingletonLazyDoubleCheck getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonLazyDoubleCheck.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonLazyDoubleCheck();
				}
			}
		}
		return INSTANCE;
	}
}
