package com.sda.zad39;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Screen implements Runnable{
    private final AtomicInteger score;

    public Screen(AtomicInteger score) {
        this.score = score;
    }

    @Override
    public void run() {
        while (true) {
            //System.out.println("Value read: " + score.get());
            try {
                Thread.sleep(new Random().nextInt(3000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
