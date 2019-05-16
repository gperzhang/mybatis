package com.gupaoedu.mebatis.Thread.interrupt;

public class MyThread implements Runnable{

    public void  m1(){
        synchronized (this){
            try {
                Thread.sleep(2000);
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("m1响应中断");
                    Thread.interrupted();
                    System.out.println("中断复位后的值："+Thread.currentThread().isInterrupted());
                }
                System.out.println("m1正常执行");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void  m2(){
        synchronized (this){
            boolean interrupted = Thread.interrupted();
            System.out.println(interrupted);
            System.out.println(Thread.interrupted());
            System.out.println(Thread.interrupted());
            if (interrupted){
                System.out.println("m2响应中断");
            }
            System.out.println("m2正常执行");
        }
    }

    public void run() {
        m1();
    }
}
