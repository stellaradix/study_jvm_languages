package com.example.lambda;

import org.junit.jupiter.api.Test;

public class _01_Lambda_comcept {

	@Test
	public void exFunctionalTest() {
		InterfaceEx ie = (int x, int y) -> x + y;
		System.out.println(ie.sum(1, 2));
	}
}