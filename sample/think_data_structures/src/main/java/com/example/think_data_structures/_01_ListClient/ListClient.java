package com.example.think_data_structures._01_ListClient;

import java.util.ArrayList;
import java.util.List;

public class ListClient {

	/**
	 * <p>
	 * 인터페이스 기반 프로그래밍<br>
	 * </p>
	 * <p>
	 * 인터페이스: 메서드 집합<br>
	 * 인터페이스로 변수 타입 선언: 메서드 내부 동작 방식에 상관없이 이용<br>
	 * 메서드 내부 동작 방식은 주입된 클래스에 맡긴다<br>
	 * </p>
	 */
	private List list;

	/**
	 * List 구현 클래스로 ArrayList, LinkedList 존재<br>
	 * 동작 방식을 바꾸고 싶으면 주입 클래스와 import 부분만 바꾸면 된다<br>
	 */
	public ListClient() {
		// this.list = new LinkedList();
		this.list = new ArrayList();
	}

	public List getList() {
		return list;
	}
}