package datastructures.stack;
import datastructures.list.LinkedList;

public class Stack<T> {
	
	private LinkedList<T> list;
	
	public Stack() {
		list = new LinkedList<>();
	}
	
	public void push(T data) {
		list.addHead(data);
	}
	
	public T pop() {
		return list.removeTail();
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

}//stack