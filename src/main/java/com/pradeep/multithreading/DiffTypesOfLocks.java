package com.pradeep.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DiffTypesOfLocks {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();

        ReentrantReadWriteLock lock1 = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock1.readLock();
        readLock.lock();
        readLock.unlock();

        BlockingQueue queue = new ArrayBlockingQueue(8);
        queue.take();

        Semaphore semaphore = new Semaphore(1);
        semaphore.acquire();
    }

    /**
     * Lock on the class object.
     */
    public static synchronized void method1(){

    }

    /**
     * Lock on an object instance.
     */
    public synchronized void method2(){

    }
}
