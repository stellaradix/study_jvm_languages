package book.doit.algorithm.ch01;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TestQuest01 {

	@Test
	public void testMax4() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int min = Quest01.max4(a, b, c, d);
		System.out.printf("%d, %d, %d, %d 중 최소값 %d", a, b, c, d, min);
	}
}
