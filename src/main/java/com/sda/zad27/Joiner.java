package com.sda.zad27;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... values) {
        StringBuilder text = new StringBuilder(values[0].toString());
        for (int i = 1; i < values.length; i++) {
            text.append(separator);
            text.append(values[i].toString());
        }
        return text.toString();
    }
}