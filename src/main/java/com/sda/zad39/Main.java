package com.sda.zad39;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger score = new AtomicInteger();

        int screens = 100;
        ExecutorService screenExecutor = Executors.newFixedThreadPool(screens);
        for (int i = 0; i < screens; i++) {
            screenExecutor.submit(new Screen(score));
        }

        int sensors = 5;
        ExecutorService sensorExecutor = Executors.newFixedThreadPool(sensors);

        for (int i = 0; i < sensors; i++) {
            sensorExecutor.submit(new Sensor(score));
        }

        screenExecutor.shutdown();
        sensorExecutor.shutdown();

        if(!screenExecutor.awaitTermination(20, TimeUnit.SECONDS)) {
            screenExecutor.shutdownNow();
            sensorExecutor.shutdownNow();
        }

    }
}
