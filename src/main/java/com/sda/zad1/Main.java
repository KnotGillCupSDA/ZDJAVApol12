package com.sda.zad1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Bartosz");
        strings.add("Jakub");
        strings.add("Emma");
        strings.add("Ola");
        strings.add("Tomek");

        List<String> sorted = getSorted(strings);

        System.out.println(strings);
        System.out.println(sorted);
    }

    private static List<String> getSorted(List<String> unsorted) {
        //we should make a copy
        List<String> sorted = new ArrayList<>(unsorted);

        //java before java 8
        /*Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });*/

        //java 8 - lambda
        //Collections.sort(sorted, (o1, o2) -> -o1.compareTo(o2));

        //java 8 - comparator
        //Collections.sort(sorted, Comparator.reverseOrder());

        //java 11
        sorted.sort(Comparator.reverseOrder());

        return sorted;
    }

}
