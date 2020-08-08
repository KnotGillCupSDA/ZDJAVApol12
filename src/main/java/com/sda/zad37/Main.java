package com.sda.zad37;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new ThreadPlaygroundRunnable("nazwa_" + i));
        }

        executorService.shutdown();
        /*Thread.sleep(500);
        List<Runnable> runnables = executorService.shutdownNow();
        System.out.println(runnables);*/

        if(executorService.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("graceful shutdown");
        }

        System.exit(0);
    }
}
