package com.sda.zad25;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        for (int i = 0; i < 12; i++) {
            try {
                basket.addToBasket();
            } catch (BasketFullException e) {
                e.printStackTrace();
            }
        }

    }
}
