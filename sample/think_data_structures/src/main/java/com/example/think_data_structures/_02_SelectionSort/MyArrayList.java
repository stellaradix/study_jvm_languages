package com.example.think_data_structures._02_SelectionSort;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

	int size;
	private T[] array;

	public MyArrayList() {
		this.size = 0;
		this.array = (T[]) new Object[10];
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return new Object[0];
	}

	@Override
	public <T1> T1[] toArray(T1[] a) {
		return null;
	}

	@Override
	public boolean add(T element) {
		if (size >= array.length) {
			// 큰 배열을 만들고 요소들을 복사
			T[] bigger = (T[]) new Object[array.length * 2];
			System.arraycopy(array, 0, bigger, 0, array.length);
			array = bigger;
		}
		array[size] = element;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}

	@Override
	public T set(int index, T element) {
		return null;
	}

	@Override
	public void add(int index, T element) {

	}

	@Override
	public T remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return null;
	}
}
