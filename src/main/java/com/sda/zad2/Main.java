package com.sda.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("Z");
        strings.add("a");
        strings.add("b");
        strings.add("c");

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
        //Collections.sort(sorted, (o1, o2) -> -o1.toLowerCase().compareTo(o2.toLowerCase()));

        //java 8 - comparator
        //Collections.sort(sorted, Comparator.reverseOrder());

        //java 11
        //sorted.sort(String.CASE_INSENSITIVE_ORDER.reversed());

        sorted.sort((o1, o2) -> -o1.compareToIgnoreCase(o2));

        return sorted;
    }

}
