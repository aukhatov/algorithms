package art.aukhatov.algorithms.ds;

import java.util.NoSuchElementException;

public class Queue<ItemType> {

	private int size = 0;
	private Node<ItemType> head;
	private Node<ItemType> tail;

	private static class Node<ItemType> {
		ItemType data;
		Node<ItemType> previous;
		Node<ItemType> next;

		public Node(ItemType data, Node<ItemType> previous, Node<ItemType> next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}
	}

	public void add(ItemType item) {
		if (isEmpty()) {
			head = tail = new Node<>(item, null, null);
		} else {
			tail.next = new Node<>(item, tail, null);
			tail = tail.next;
		}
		size++;
	}

	public ItemType take() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}

		ItemType item = head.data;
		head = head.next != null ? head.next : null;
		size--;
		return item;
	}

	public ItemType peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}

		return head.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean notEmpty() {
		return size() > 0;
	}
}
