package com.stack.stackusecases;

public class StackImplementation<T> {

	Node<T> head;
	// push -uc1
	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
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

	public static void main(String[] args) {
		StackImplementation<Integer> stackImplementation = new StackImplementation<>();
		stackImplementation.push(70);
		stackImplementation.push(30);
		stackImplementation.push(56);
		stackImplementation.printStack();
	}

}
