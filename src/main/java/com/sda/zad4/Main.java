package com.sda.zad4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("smietana", "2");
        storage.addToStorage("jogurt", "3");
        storage.addToStorage("smietana", "3");
        storage.addToStorage("oliwa", "35");

        storage.printValues("smietana");
        storage.printValues("pupa");

        storage.findValues("3");
        storage.findValues("5");
    }

    private static class Storage {

        private final Map<String, List<String>> map;

        private Storage() {
            map = new HashMap<>();
        }

        public Map<String, List<String>> addToStorage(String key, String value) {

            // attempt 1 (Paulina)
            if (map.containsKey(key)) {
                List<String> strings = map.get(key);
                strings.add(value);
                map.put(key, strings);
            } else {
                List<String> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }

            //attempt 2 - without contains
            /*List<String> strings = map.get(key);
            if (strings == null) {
                strings = new ArrayList<>();
                map.put(key, strings);
            }
            strings.add(value);*/

            // with compute
            /*List<String> strings = map.computeIfAbsent(key, k -> new ArrayList<>());
            strings.add(value);*/

            return map;
        }

        public void printValues(String key) {
            System.out.println(Optional
                .ofNullable(map.get(key))
                .orElse(Collections.emptyList()));
        }

        public void findValues(String value) {
            System.out.println("Keys for value \"" + value + "\": ");
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    boolean containsValue = entry.getValue().get(i).equalsIgnoreCase(value);
                    if (containsValue) {
                        System.out.print(entry.getKey() + ", ");
                    }
                }
            }

        }

    }
}
