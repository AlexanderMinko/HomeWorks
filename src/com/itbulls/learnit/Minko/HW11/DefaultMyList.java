package com.itbulls.learnit.Minko.HW11;

import java.util.Arrays;
import java.util.Iterator;

public class DefaultMyList implements MyList {
	private final int INIT_CAPACITY = 10;
	private Object[] array = new Object[INIT_CAPACITY];
	private int count;

	public DefaultMyList() {
		// array = new Object[INIT_CAPACITY];
	}

	public DefaultMyList(int capacity) {
		array = new Object[capacity];
	}

	@Override
	public void add(Object o) {
		if (count == array.length) {
			Object[] tempArray = Arrays.copyOf(array, array.length * 2);
			array = tempArray;
		}
		array[count++] = o;
	}

	@Override
	public Object get(int index) {
		return array[index];
	}

	@Override
	public void clear() {
		Object[] temp = array;
		count = 0;
		for (int i = count, j = 0; j < i; j++) {
			temp[j] = null;
		}
	}

	@Override
	public boolean remove(Object o) {
		Object[] temp1 = Arrays.copyOf(array, indexOf(o));
		Object[] temp2 = Arrays.copyOfRange(array, indexOf(o) + 1, array.length);
		Object[] temp3 = new Object[array.length - 1];
		for (int i = 0; i < temp1.length; i++) {
			temp3[i] = temp1[i];
		}
		for (int i = 0; i < temp2.length; i++) {
			temp3[i + temp1.length] = temp2[i];
		}
		array = temp3;
		count = count - 1;
		return true;
	}

	@Override
	public Object[] toArray() {
		Object[] arr = array;
		return arr;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}

	private int indexOf(Object o) {
		Object[] temp = array;
		if (o == null) {
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < temp.length; i++) {
				if (o.equals(temp[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public boolean containsAll(MyList list) {
		for (Object e : list) {
			if (!contains(e)) // Invokes safe contains() above
				return false;
		}
		return true;
	}

	@Override
	public Iterator<Object> iterator() {
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator<Object> {
		int index = 0;

		public boolean hasNext() { // returns true if the iteration has more elements
			if (index < array.length)
				return true;
			return false;
		}

		public Object next() { // returns the next element in the iteration
//			if(index == count) {
//			return array[index] = null;
//			}
			return array[index++];
		}

		public void remove() { // removes from the underlying collection the last element returned by this
			DefaultMyList.this.remove(array[index--]); // iterator
		}
	}

}