package datastructures.list;

public class LinkedList<T> {
	private static class Node<T> {
		T data;
		Node<T> next;
		
		Node (T data) {
			this.data = data;
			this.next = null;
		}
	}//node class
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	//O(1)
	public void addHead(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	//O(1)
	public void addTail(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
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
		head = head.next;
		size--;
		
		if (isEmpty()) {
			tail = null;
		}
		return value;
	}
	
	//O(n)
	public T removeTail() {
		if (isEmpty()) {
			return null;
		}
		
		T value = tail.data;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node<T> curr = head;
		
			while (curr.next != tail) {
				curr = curr.next;
			}
			
			curr.next = null;
			tail = curr;
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
			curr = curr.next;
		}
		return false;
	}
	
	//O(1)
	public T peekHead() {
		if (isEmpty()) {
			return null;
		}
		return head.data;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void printList() {
		Node<T> curr = head;
		while (curr != null) {
			System.out.println(curr.data + "");
			curr = curr.next;
		}
		System.out.println("null");
	}
}//list class
