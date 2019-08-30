package com.pradeep.multithreading;

public class PlainJoin {
    public static void main(String[] args) {
        Runnable lambdaRunnable = () -> {
            System.out.println("Executing - "+Thread.currentThread().getName());
            try {
                String s = Thread.currentThread().getName();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread t1 = new Thread(lambdaRunnable);
        Thread t2 = new Thread(lambdaRunnable);
        Thread t3 = new Thread(lambdaRunnable);
        Thread t4 = new Thread(lambdaRunnable);
        Thread t5 = new Thread(lambdaRunnable);
        Thread t6 = new Thread(lambdaRunnable);
        Thread t7 = new Thread(lambdaRunnable);

        System.out.println("Executing - "+Thread.currentThread().getName());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

        try {
            t1.join();

            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread ended");
    }
}
