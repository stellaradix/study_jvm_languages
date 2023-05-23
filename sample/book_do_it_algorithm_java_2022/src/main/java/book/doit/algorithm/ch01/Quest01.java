package book.doit.algorithm.ch01;

import java.util.Scanner;

public class Quest01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("네 정수의 최댓값을 구합니다.");

		System.out.print("a의 값: ");
		int a = scanner.nextInt();

		System.out.print("b의 값: ");
		int b = scanner.nextInt();

		System.out.print("c의 값: ");
		int c = scanner.nextInt();

		System.out.print("d의 값: ");
		int d = scanner.nextInt();

		int min = Quest01.max4(a, b, c, d);
		System.out.printf("최대값은 %d 입니다", min);
	}

	// 네 값의 최대값 구하기
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		return max;
	}

	// 세 값의 최소값 구하기
	public static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}

	// 네 값의 최소값 구하기
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		return min;
	}
}
