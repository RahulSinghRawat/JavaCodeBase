package com.stack;

class QNode {
	Object key;
	QNode next;

	// constructor to create a new linked list node
	public QNode(Object key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public String toString() {
		return "QNode [key=" + key +"]";
	}

}

public class QueueImplementation implements Queue {

	QNode front, rear;

	public QueueImplementation() {
		this.front = this.rear = null;
	}

	@Override
	public void add(Object o) {

		QNode temp = new QNode(o);

		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		this.rear.next = temp;
		this.rear = temp;

	}

	@Override
	public Object next() {

		if (this.front == null)
			return null;

		QNode temp = this.front;
		this.front = this.front.next;

		if (this.front == null)
			this.rear = null;
		return temp;
	}

	public static void main(String[] args) {
		QueueImplementation q = new QueueImplementation();
		q.add(10);
		q.add(20);
		System.out.println(q.next());
		System.out.println(q.next());
		q.add(30);
		q.add(40);
		q.add(50);

	
	}

}
