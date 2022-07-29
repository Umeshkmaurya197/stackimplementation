package com.stack.stackusecases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackMethodsTestCases {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		StackImplementation<Integer> stackImplementation =new StackImplementation<Integer>();
		stackImplementation.push(70);
		stackImplementation.push(30);
		stackImplementation.push(56);
		Node<Integer> peek =stackImplementation.peek();
		Node<Integer> node = new Node<Integer>(56);
		stackImplementation.printStack();
		stackImplementation.peek();
		assertEquals(node.toString(), peek.toString());
	}
	@Test
	public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode() {
		StackImplementation<Integer> stackImplementation =new StackImplementation<Integer>();
		stackImplementation.push(70);
		stackImplementation.push(30);
		stackImplementation.push(56);
		Node<Integer> popedNode=stackImplementation.pop();
		Node<Integer> node = new Node <>(56);
		stackImplementation.printStack();
		assertEquals(node.toString() ,popedNode.toString() );
	}
}

