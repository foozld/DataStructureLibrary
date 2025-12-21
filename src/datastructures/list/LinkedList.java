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
	
	
}//list class
