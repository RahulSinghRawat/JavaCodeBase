package com.string.rahul;

class Myclass implements Runnable {
    Thread thrd;
    Myclass() {
        thrd = new Thread (this);
        thrd.setDaemon(true);
        thrd.start();
    }
    public boolean isDaemon() {
        return thrd.isDaemon();
    }
    public void run() {
        try {
            while(true) {
                Thread.sleep(100);
            }
        }catch(Exception ex){
            System.out.println("Data");
        }
    }
}

public class First2 {
    public static void main(String[] args) throws Exception {
        Myclass dt = new Myclass();
        if (dt.isDaemon()) {
            System.out.println("Testing");
        }
        Thread.sleep(1000);
        System.out.println("Subject");
    }

}
