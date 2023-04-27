package com.example.reactive_x;

import io.reactivex.rxjava3.core.Flowable;
import org.junit.jupiter.api.Test;

public class _01_Start_Reactive {

	@Test
	public void hello_world() {
		Flowable.just("Hello world")
				.subscribe(System.out::println);
	}

	@Test
	public void hello_list() {
		hello("Ben", "George");
	}

	private void hello(String... args) {
		Flowable.fromArray(args)
				.subscribe(item -> {
					System.out.println("Hello " + item + "!");
				});
	}
}