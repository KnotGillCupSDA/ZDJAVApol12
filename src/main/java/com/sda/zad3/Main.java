package com.sda.zad3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("C#", 9);
        map.put("Python", 1);
        map.put("JavaScript", 0);
        map.put("PHP", 0);

        print(map);
    }

    private static void print(Map<String, Integer> input) {

        int i = 0;

        //attempt 1
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            if (++i == input.size()) {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
            } else {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
            }
        }
        System.out.println("====");


        //with elvis
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + (++i == input.size() ? "." : ","));
        }
        System.out.println("====");

        //input.forEach((key, value) -> System.out.println("Klucz: " + key + ", Wartość: " + value));

        //with stream and collect
        System.out.println(input.entrySet().stream()
            .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
            .collect(Collectors.joining("," + System.lineSeparator(), "", ".")));
        System.out.println("====");


        //with String.join
        List<String> listOfStrings = input.entrySet().stream()
            .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
            .collect(Collectors.toList());
        System.out.println(String.join(","+System.lineSeparator(), listOfStrings) + ".");
    }
}
