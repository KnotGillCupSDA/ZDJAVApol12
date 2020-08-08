package com.sda.zad35;

public class Main {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();

        //with lambda
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

}
