package datastructures.queue;
import datastructures.list.LinkedList;


public class Queue<T> {
	private LinkedList<T> list;
	
	public Queue() {
		list = new LinkedList<>();
	}
	
	public void enqueue(T data) {
		list.addTail(data);
	}
	
	public T dequeue() {
		return list.removeHead();
	}
	
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		return list.peekHead();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int size() {
		return list.size();
	}
	
	
}//queue
