package com.pradeep.multithreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AvoidDeadLock {

    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Runnable thisProcess = () -> {
            try {
                lock1.tryLock(2, TimeUnit.SECONDS);
                lock2.tryLock(2, TimeUnit.SECONDS);

                System.out.println("thisprocess");

                if(lock1.isLocked())
                    lock1.unlock();
                if(lock2.isLocked())
                    lock2.unlock();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable thatProcess = () -> {
            try {
                lock2.tryLock(2, TimeUnit.SECONDS);
                lock1.tryLock(2, TimeUnit.SECONDS);

                System.out.println("thatprocess");

                if(lock2.isLocked())
                    lock2.unlock();
                if(lock1.isLocked())
                    lock1.unlock();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(thisProcess).start();
        new Thread(thatProcess).start();

        Thread.sleep(1000);

    }
}
