package com.pradeep.multithreading;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * One writer thread at a time or multiple reader threads at a time.
 */
public class ReadWriteLock {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

    private void readResource(){
        readLock.lock();
        System.out.println("Reading resource");
        readLock.unlock();
    }

    private void writeResource(){
        writeLock.lock();
        System.out.println("Writing resource");
        writeLock.unlock();
    }

    public static void main(String[] args) {
        ReadWriteLock lock = new ReadWriteLock();

        Thread t1 = new Thread(lock::readResource);
        Thread t2 = new Thread(lock::readResource);
        Thread t3 = new Thread(lock::writeResource);
        Thread t4 = new Thread(lock::writeResource);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
