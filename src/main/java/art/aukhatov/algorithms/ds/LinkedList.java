package art.aukhatov.algorithms.ds;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T> {
	private int size = 0;
	private Node<T> head = null;
	private Node<T> tail = null;

	private static class Node<T> {
		private T data;
		private Node<T> previous;
		private Node<T> next;

		Node(T data, Node<T> previous, Node<T> next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void add(T data) {
		addLast(data);
	}

	public void addLast(T data) {
		if (isEmpty()) {
			head = tail = new Node<>(data, null, null);
		} else {
			tail.next = new Node<>(data, tail, null);
			tail = tail.next;
		}
		size++;
	}

	public void addFirst(T data) {
		if (isEmpty()) {
			head = tail = new Node<>(data, null, null);
		} else {
			head.previous = new Node<>(data, null, head);
			head = head.previous;
		}
		size++;
	}

	public T removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("List is empty");
		}

		T item = head.data;
		head = head.next;
		size--;
		return item;
	}



	public boolean remove(T data) {
		Node<T> point = head;

		while (point != null) {
			if (data.equals(point.data)) {
				point.next.previous = point.previous;
				point.previous.next = point.next;
				--size;
				point.data = null;
				point = point.previous = point.next = null;
				return true;
			}
			point = point.next;
		}

		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<T> {

		private Node<T> point = head;

		@Override
		public boolean hasNext() {
			return point != null;
		}

		@Override
		public T next() {
			T data = point.data;
			point = point.next;
			return data;
		}
	}

	@Override
	public void forEach(Consumer<? super T> action) {
		throw new UnsupportedOperationException("Not implement");
	}

	@Override
	public Spliterator<T> spliterator() {
		throw new UnsupportedOperationException("Not implement");
	}

	public LinkedList<T> reverse() {
		LinkedList<T> reversedList = new LinkedList<>();
		reversedList.tail = head;

		Node<T> point = head;
		Node<T> prev = null;

		while (point != null) {
			Node<T> next = point.next;
			point.next = prev;
			prev = point;
			point = next;
		}

		reversedList.head = prev;

		return reversedList;
	}
}
