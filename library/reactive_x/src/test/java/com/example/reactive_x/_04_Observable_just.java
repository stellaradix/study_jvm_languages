package com.example.reactive_x;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

public class _04_Observable_just {

	@Test
	public void Observable_just_01() {
		Observable<String> source = Observable.just("Hello", "World");
		source.subscribe(System.out::println);
	}
}
