package com.stack.stackusecases;

public class StackImplementation<T> {

	public Node<T> head;
	public int size;
	
	public StackImplementation() {
		this.size=0;
	}

	// push -uc1
	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		size++;
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// pop element -uc2
	public Node<T> pop() {
		if (head == null) {
			System.out.println(" Stack is empty .");
			return null;
		}
		size--;
		Node<T> top=head;
		head = head.next;
		return top;
	}

	// peek element -uc2
	public Node<T> peek() {
		if (head == null) {
			System.out.println(" Stack is empty  ");
			return null;
		}
		Node<T> node = head;
		return node;

	}

	public void printStack() {
		if (head == null) {
			System.out.println("Stack is empty ");
			return;
		}
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println(" ");
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		StackImplementation<Integer> stackImplementation = new StackImplementation<>();
		stackImplementation.push(70);
		stackImplementation.push(30);
		stackImplementation.push(56);
		stackImplementation.printStack(); // 56 -> 30 -> 70 ->

		stackImplementation.pop();
		stackImplementation.printStack(); // 30 -> 70 ->

		System.out.println("Peek element is : " + stackImplementation.peek()); // 30
		System.out.println("Stack size : " + stackImplementation.getSize());
	}
}
