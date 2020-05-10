package art.aukhatov.algorithms.ds;

import java.util.NoSuchElementException;

public class Stack<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	private static class Node<E> {
		E data;
		Node<E> previous;
		Node<E> next;

		public Node(E data, Node<E> previous, Node<E> next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}
	}

	public void push(E element) {
		if (head == null) {
			head = tail = new Node<>(element, null, null);
		} else {
			tail.next = new Node<>(element, tail, null);
			tail = tail.next;
		}

		size++;
	}

	public E peek() {
		return tail.data;
	}

	public E pop() {
		if (size == 0) {
			throw new NoSuchElementException("Stack is empty");
		}
		E element = tail.data;
		tail = tail.previous;
		if (tail != null)
			tail.next = null;
		size--;
		return element;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return size;
	}
}
