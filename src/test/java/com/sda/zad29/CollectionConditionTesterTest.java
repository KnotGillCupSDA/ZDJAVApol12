package com.sda.zad29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CollectionConditionTesterTest {

    @Test
    void happyPath() {

        double partOf = CollectionConditionTester.partOf(List.of("aa", "abc", "d", "ef"), s -> s.length() == 2);
        Assertions.assertEquals(50.0, partOf);

        partOf = CollectionConditionTester.partOf(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), integer -> integer % 2 == 0);
        Assertions.assertEquals(50.0, partOf);
    }


}