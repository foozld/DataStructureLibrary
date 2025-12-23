package datastructures.stack;
import datastructures.list.LinkedList;

public class Stack<T> {
	
	private LinkedList<T> list;
	
	public Stack() {
		list = new LinkedList<>();
	}
	
	//O(1)
	public void push(T data) {
		list.addHead(data);
	}
	
	//O(1)
	public T pop() {
		return list.removeTail();
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

}//stack