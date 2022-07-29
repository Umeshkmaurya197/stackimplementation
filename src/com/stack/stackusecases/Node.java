package com.stack.stackusecases;

public class Node<T> {
	
	T data;
	Node<T> next;
	
	public Node(T data) {
		super();
		this.data = data;
		
	}
	@Override
	public String toString() {
		return ""+data;
	}
}
