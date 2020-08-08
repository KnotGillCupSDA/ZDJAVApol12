package com.sda.zad37_appendix;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> list = new CopyOnWriteArrayList<>();

        MyModel myModel = new MyModel();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> myModel.integer.compareAndSet(0, 1));
        executorService.execute(() -> myModel.integer.compareAndSet(1, 0));

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println(myModel.integer);
    }


    private static class MyModel {
        private AtomicInteger integer = new AtomicInteger(0);
    }

}
