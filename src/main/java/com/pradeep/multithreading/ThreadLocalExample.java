package com.pradeep.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalExample {
    private static ExecutorService executor = Executors.newFixedThreadPool(10);

    // This field will make sure that only 10 SDF objects are ever created for the
    // 10 threads available at any given point of time.
    // withInitial() makes sure when each of the SDF objects are inirialised, it
    // uses this overridden constructor.
    private static ThreadLocal<SimpleDateFormat> threadLocalDateFormatter =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        for (int i = 0; i < 1000 ; i++) {
            count.addAndGet(1);
            int id = i;
            executor.submit(() -> {
                String birthDate = birthDate(id);
                System.out.println(birthDate);
            });
            threadLocalDateFormatter.remove();
        }
    }

    private static String birthDate(int id) {
        Date birthDate = new Date(id*10000000);
        final SimpleDateFormat sdf = threadLocalDateFormatter.get();
        return sdf.format(birthDate);
    }
}
