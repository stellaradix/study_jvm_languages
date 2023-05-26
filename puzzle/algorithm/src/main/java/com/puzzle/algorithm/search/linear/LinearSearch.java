package com.puzzle.algorithm.search.linear;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] array, int n, int target) {
		int i = 0;

		while (true) {
			if (i == n) return -1; // 검색 실패
			if (array[i] == target) return i; // 검색 성공 (인덱스 반환)
			i++;
		}
	}

	public static int sequenceSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) return i; // 검색 성공 (인덱스 반환)
		}
		return -1; // 검색 실패
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("요솟수: ");
		int num = input.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("x[%d]: ", i);
			x[i] = input.nextInt();
		}

		System.out.print("검색할 값: ");
		int key = input.nextInt();

		int index = linearSearch(x, num, key);

		if (index == -1)
			System.out.println("그 값의 요소가 없습니다");
		else
			System.out.printf("그 값은 x[%d]에 있습니다", index);
	}
}
