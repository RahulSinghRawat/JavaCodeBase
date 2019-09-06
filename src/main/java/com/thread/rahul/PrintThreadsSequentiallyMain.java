package com.thread.rahul;
/*We will use concept of remainder here.

If number%3==1 then T1 will print the number and increment it else will go in the wait state.
If number%3==2 then T2 will print the number and increment it else will go in the wait state.
If number%3==0 then T3 will print the number and increment it else will go in the wait state.*/

class PrintThreadsSequentially implements Runnable{
	 
	public int PRINT_NUMBERS_UPTO=10;
	static int  number=1;
	int remainder;
	static Object lock=new Object();
 
	PrintThreadsSequentially(int remainder)
	{
		this.remainder=remainder;
	}
 
	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO-1) {
			synchronized (lock) {
				while (number % 3 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}
 

 
public class PrintThreadsSequentiallyMain {
 
	public static void main(String[] args) {
		
		PrintThreadsSequentially runnable1=new PrintThreadsSequentially(1);
		PrintThreadsSequentially runnable2=new PrintThreadsSequentially(2);
		PrintThreadsSequentially runnable3=new PrintThreadsSequentially(0);
		
		Thread t1=new Thread(runnable1,"T1");
		Thread t2=new Thread(runnable2,"T2");
		Thread t3=new Thread(runnable3,"T3");
		
		t1.start();
		t2.start();
		t3.start();	  
	}
}