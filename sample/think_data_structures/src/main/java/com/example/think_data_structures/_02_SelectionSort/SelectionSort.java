package com.example.think_data_structures._02_SelectionSort;

public class SelectionSort {

	/**
	 * i 와 j 의 위치에 있는 값 바꾸기
	 */
	public void swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * 배열의 start index 이상부터 마지막 index 이하에서<br>
	 * 최소값의 위치를 찾고 최소값가지는 index 반환
	 */
	public int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for (int i = start; i < array.length; i++) {
			if (array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	/**
	 * 선택 정렬을 사용하여 요소를 정렬
	 */
	public void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = indexLowest(array, i);
			swapElements(array, i, j);
		}
	}
}