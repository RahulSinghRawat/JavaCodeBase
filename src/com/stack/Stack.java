package com.stack;

public interface Stack {/**
	* Push implements LIFO insertion.
	* @param o the object to be stored.  This becomes the top element of the stack.
	*/
		public void push(Object o);

	/**
	* Pop implements LIFO retrieval.  Pop returns the top element of the stack, and removes it from the stack.
	* @return the top element of the stack, or null if the stack is empty.
	*/
		public Object pop();
	}
