package com.string.rahul;

public class Big extends Thread {
    public void TestClass1() {
        TestClass2();

    }
    public static void TestClass2 (){
        synchronized (Big.class){
            Big.class.notifyAll();
            System.out.println("BigB");
        }
    }
    public void run() {
        try {
            synchronized (this){
                wait();
                System.out.println("Small");
            }
        }catch (Exception ex) {
            System.out.println("BigA");
        }
    }

    public static void main(String[] args) {
        Big t1 = new Big();
        t1.start();
        t1.TestClass1();
    }

}
