package art.aukhatov.algorithms.ds;

import java.util.NoSuchElementException;

public class Stack<E> {

	private Node<E> head;
	private int size;

	private static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}

	public void push(E element) {
		head = new Node<>(element, head);
		size++;
	}

	public E peek() {
		return head.data;
	}

	public E pop() {
		if (size == 0) {
			throw new NoSuchElementException("Stack is empty");
		}

		E element = head.data;
		head = head.next;
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
