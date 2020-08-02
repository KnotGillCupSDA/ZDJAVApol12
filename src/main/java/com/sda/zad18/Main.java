package com.sda.zad18;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("IntelCore i5", 16, "AMD PowerColor", "Apple", "MacBook");
        Computer computer1 = new Computer("IntelCore i7", 24, "AMD PowerColor", "Asus", "ZenBook");
        Computer computer2 = new Computer("IntelCore i7", 24, "AMD PowerColor", "Asus", "ZenBook");

        System.out.println(computer.toString());
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        System.out.println();
        System.out.println(computer.equals(computer1));
        System.out.println(computer1.equals(computer2));
    }
}
