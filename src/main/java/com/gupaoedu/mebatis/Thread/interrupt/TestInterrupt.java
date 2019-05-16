package com.gupaoedu.mebatis.Thread.interrupt;

public class TestInterrupt {
    public static void main(String[] args) {
        final MyThread myThread = new MyThread();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                myThread.m1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                myThread.m2();
            }
        });
        Thread thread3 = new Thread(new MyThread());

        thread1.start();
        thread2.start();
        /*thread3.start();
        thread2.interrupt();*/



    }
}
