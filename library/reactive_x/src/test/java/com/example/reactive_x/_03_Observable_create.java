package com.example.reactive_x;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

public class _03_Observable_create {

	@Test
	public void Observable_create_01() {
		Observable<String> source = Observable.create(emitter -> {
			emitter.onNext("Hello");
			emitter.onNext("World");
			emitter.onComplete();
		});

		// Consumer 를 통해 구독
		source.subscribe(System.out::println);
	}

	@Test
	public void Observable_create_02() {
		// onComplete() 이후 구독자는 데이터를 통지 받지 못함.
		Observable<String> source = Observable.create(emitter -> {
			emitter.onNext("Hello");
			emitter.onComplete();
			emitter.onNext("World");
		});

		// Consumer 를 통해 구독
		source.subscribe(System.out::println);
	}

	@Test
	public void Observable_create_03() {
		Observable<String> source = Observable.create(emitter -> {
			emitter.onNext("Hello");
			emitter.onError(new Throwable());
			emitter.onNext("World");
		});

		// Consumer 를 통해 구독
		source.subscribe(System.out::println,
				throwable -> System.out.println("Error!"));
	}
}
