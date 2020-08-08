package com.sda.zad36;

public class Main {
    public static void main(String[] args) {
        new Thread(new ThreadPlaygroundRunnable("kubek")).start();

        System.out.println("MAIN!!!");

        new Thread(new ThreadPlaygroundRunnable("szklanka")).start();
    }

}
