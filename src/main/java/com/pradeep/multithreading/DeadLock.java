package com.pradeep.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Runnable thisProcess = () -> {
            lock1.lock();
            lock2.lock();

            System.out.println("thisprocess");

            lock1.unlock();
            lock2.unlock();
        };

        Runnable thatProcess = () -> {
            lock2.lock();
            lock1.lock();

            System.out.println("thatprocess");

            lock2.unlock();
            lock1.unlock();
        };

        new Thread(thisProcess).start();
        new Thread(thatProcess).start();
    }
}
