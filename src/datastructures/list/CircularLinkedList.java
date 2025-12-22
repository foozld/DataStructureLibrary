package datastructures.list;

public class CircularLinkedList<T> {
	private static class Node<T> {
		T data;
		Node<T> next;
		
		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}//node
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public CircularLinkedList() {
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
			tail.next = head;
		} else {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
		size++;
	}
	
	//O(1)
	public void addTail(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
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
			tail.next = head;
		}
		size--;
		return value;
	}
	
	//O(n)
	public T removeTail() {
		if (isEmpty()) {
			return null;
		}
		T value = head.data;
		
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node<T> curr = head;
			while (curr.next != tail) {
				curr = curr.next;
			} 
			
			curr.next = head;
			tail = curr;
		}
		size--;
		return value;
	}
	
	//O(n)
	public boolean contains(T data) {
		Node<T> curr = head;
		
		while (curr.next != head) {
			if (curr.data.equals(data)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
}//circular linked list
