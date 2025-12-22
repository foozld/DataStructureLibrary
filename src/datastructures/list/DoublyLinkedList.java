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
	
	
}//doubly linked list class
