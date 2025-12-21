package datastructures.list;

public class LinkedList<T> {
	private static class Node<T> {
		T data;
		Node<T> next;
		
		Node (T data) {
			this.data = null;
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
	
	public void addHead(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	public void addTail(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
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
	
	public T removeTail() {
		T value = tail.data;
				
		return value;
	}
	
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
