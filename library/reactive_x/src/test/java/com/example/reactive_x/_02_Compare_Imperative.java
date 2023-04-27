package com.example.reactive_x;

import io.reactivex.rxjava3.subjects.PublishSubject;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class _02_Compare_Imperative {

	/**
	 * <p>
	 * 명령형 프로그래밍
	 * </p>
	 * <p>
	 * 1. 리스트 생성<br>
	 * 2. 리스트에 아이템 추가<br>
	 * 3. 리스트 순회하며 주어진 명령 실행<br>
	 * 4. 리스트에 아이템 추가<br>
	 * </p>
	 * <p>
	 * : 명령 이전 추가된 아이템에 대해서 명령 수행
	 * </p>
	 */
	@Test
	public void imperative_programming() {
		ArrayList<Integer> items = new ArrayList<>();

		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);

		// 짝수만 출력
		for (Integer item : items) {
			if (item % 2 == 0) {
				System.out.println(item);
			}
		}

		items.add(5);
		items.add(6);
		items.add(7);
		items.add(8);
	}

	/**
	 * <p>
	 * 반응형 프로그래밍
	 * </p>
	 * <p>
	 * 1. 데이터 스트림 생성<br>
	 * 2. 데이터 스트림에 아이템 추가<br>
	 * 3. 데이터 스트림을 명령을 수행하는 데이터 스트림으로 변형 후 구독<br>
	 * 4. 데이터 스트림에 아이템 추가<br>
	 * </p>
	 * <p>
	 * : 구독 이후 추가된 아이템에 대해서 명령 수행
	 * </p>
	 */
	@Test
	public void reactive_programming() {
		PublishSubject<Integer> items = PublishSubject.create();

		items.onNext(1);
		items.onNext(2);
		items.onNext(3);
		items.onNext(4);

		// 짝수만 출력
		items.filter(item -> item % 2 == 0)
				.subscribe(System.out::println);

		items.onNext(5);
		items.onNext(6);
		items.onNext(7);
		items.onNext(8);
	}
}