package com.thread.rahul;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueMain {
	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();

	}
}

class Producer implements Runnable {

	private final BlockingQueue<Integer> queue;

	@Override
	public void run() {

		try {
			process();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

	private void process() throws InterruptedException {

		// Put 20 ints into Queue
		for (int i = 0; i < 20; i++) {
			System.out.println("[Producer] Put : " + i);
			queue.put(i);
			System.out.println("[Producer] Queue remainingCapacity : " + queue.remainingCapacity());
			Thread.sleep(100);
		}

	}

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

}

class Consumer implements Runnable {

	private final BlockingQueue<Integer> queue;

	@Override
	public void run() {

		try {
			while (true) {
				Integer take = queue.take();
				process(take);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

	private void process(Integer take) throws InterruptedException {
		System.out.println("[Consumer] Take : " + take);
		Thread.sleep(500);
	}

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
}
