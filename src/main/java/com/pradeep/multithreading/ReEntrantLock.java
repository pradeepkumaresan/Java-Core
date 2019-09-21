package com.pradeep.multithreading;

import java.util.concurrent.locks.ReentrantLock;

/**
 * One thread at a time.
 */
public class ReEntrantLock {

    private static ReentrantLock lock = new ReentrantLock();

    private static void resource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName());
        }
        finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> resource());
        Thread t2 = new Thread(() -> resource());
        Thread t3 = new Thread(ReEntrantLock::resource);
        Thread t4 = new Thread(ReEntrantLock::resource);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
