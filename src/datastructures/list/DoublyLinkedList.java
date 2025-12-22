package datastructures.list;

public class DoublyLinkedList<T> {
	private static class Node<T> {
		T data;
		Node<T> next;
		Node<T> prev;
		
		Node(T data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}//node
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	//O(1)
	public void addHead(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}
	
	//O(1)
	public void addTail(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	//O(1)
	public T removeHead() {
		if (isEmpty()) {
			return null;
		} 
		T value = head.data;
		
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}
		
		size--;
		return value;
	}
	
	//O(1)
	public T removeTail() {
		if (isEmpty()) {
			return null;
		}
		T value = tail.data;
		
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
		size--;
		return value;
	}
	
	//O(n)
	public boolean contains(T data) {
		Node<T> curr = head;
		
		while (curr != null) {
			if (curr.data.equals(data)) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}//doubly linked list class
