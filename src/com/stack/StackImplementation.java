package com.stack;

class Node {
	Object data; // object data
	Node next; // pointer to the next node
	
Node(Object o){
	this.data = o;
	this.next = null;
}
};

public class StackImplementation implements Stack {

	private Node top;

	public StackImplementation() {
		this.top = null;
	}

	@Override
	public void push(Object o) {

		Node node = new Node(o);

		if (node == null) {
			System.out.print("\nHeap Overflow"); // 
			return;
		}

		System.out.println("Inserting " + o);

		node.data = o;

		node.next = top;

		top = node;

	}

	@Override
	public Object pop() {

		if (top == null) {
			System.out.print("\nStack Underflow");
			return null;
		}

		System.out.println("Removing " + peek());

		top = (top).next;
		return top;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public Object peek() {

		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}

	}
	
	public static void main(String[] args) {
		StackImplementation stack = new StackImplementation();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Top element is " + stack.peek());

		stack.pop();
		stack.pop();
		stack.pop();
		
	}
}
