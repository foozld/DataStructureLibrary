package datastructures.queue;
import datastructures.list.LinkedList;


public class Queue<T> {
	private LinkedList<T> list;
	
	public Queue() {
		list = new LinkedList<>();
	}
	
	//O(1)
	public void enqueue(T data) {
		list.addTail(data);
	}
	
	//O(1)
	public T dequeue() {
		return list.removeHead();
	}
	
	//O(1)
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
