package com.pradeep.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DiffWaysToStartThread {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("New task: "+Thread.currentThread().getName());

        // 1
        Thread t1 = new Thread(task);
        t1.start();

        // 2
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(task);

        ScheduledExecutorService sch = Executors.newScheduledThreadPool(5);
        sch.schedule(task, 10, TimeUnit.SECONDS);
    }
}
