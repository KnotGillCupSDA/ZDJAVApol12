package com.sda.zad39;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Sensor implements Runnable {

    private final AtomicInteger score;
    private Random random;

    public Sensor(AtomicInteger score) {
        this.score = score;
        random = new Random();
    }

    @Override
    public void run() {

        int lastKnownValue = score.get();
        while (true) {
            int newValue = random.nextInt(Integer.SIZE - 1);
            if (score.compareAndSet(lastKnownValue, newValue)) {
                lastKnownValue = newValue;
                System.out.println("New value set to: " + lastKnownValue);
            } else {
                System.out.println("The value is outdated!!!!!!!");
                lastKnownValue = score.get();
            }
            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

    }
}
