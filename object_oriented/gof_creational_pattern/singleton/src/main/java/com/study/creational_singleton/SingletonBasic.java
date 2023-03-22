package com.study.creational_singleton;

// Singleton 패턴 기본형
public class SingletonBasic {

	private static final SingletonBasic INSTANCE;

	static {
		INSTANCE = new SingletonBasic();
	}

	private SingletonBasic() {}

	public static SingletonBasic getInstance() {
		return INSTANCE;
	}
}

/* Singleton 패턴

장점
- 객체를 여러 번 생성하지 않기 때문에 메모리를 절약할 수 있다
- 하나의 인스턴스를 사용하기 때문에, 객체 간의 데이터 공유가 용이하다
- 인스턴스를 여러 곳에서 사용하는 경우, 중복 생성을 방지하고 안정적으로 사용된다

단점
- 전역적으로 접근 가능하기 때문에 다른 객체에 의해 인스턴스가 변경 가능하다
- 멀티스레딩 환경에서 동시에 인스턴스를 생성하면, 여러 개 생성될 수 있다
- Singleton 패턴이 필요하지 않은 경우에도 적용하면 코드 복잡도가 증가할 수 있다

*/
