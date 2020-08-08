package com.sda.zad36;

import com.sda.zad27.Joiner;

import java.util.Random;

class ThreadPlaygroundRunnable implements Runnable {

    private final String name;

    ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Joiner<String> stringJoiner = new Joiner<>(":");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(stringJoiner.join(Thread.currentThread().getName(), name, String.valueOf(i)));
            /*try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
