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
}//circular linked list
