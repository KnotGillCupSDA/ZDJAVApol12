package com.sda.zad37;

import java.util.Random;
import java.util.concurrent.*;

public class SubmitTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(new MyCallable());

        System.out.println("test1");
        System.out.println("test2");
        System.out.println("test3");

        System.out.println(future.get());

        executorService.shutdown();
        if(!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
            executorService.shutdownNow();
        }
    }

    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return new Random().nextInt(100);
        }
    }
}
