package com.sda.zad28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SkipArrayList<T> extends ArrayList<T> {

    public SkipArrayList() {
    }

    public SkipArrayList(Collection<? extends T> c) {
        super(c);
    }

    public List<T> getEveryNthElement(int startIndex, int skip) {

        List<T> everyNthElement = new ArrayList<>();

        int currentIndex = startIndex;
        while (currentIndex < size()) {
            everyNthElement.add(get(currentIndex));
            currentIndex += skip + 1;
        }

        return everyNthElement;
    }
}
