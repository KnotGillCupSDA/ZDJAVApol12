package com.sda.zad28;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SkipArrayListTest {

    @Test
    void thatSkippingWorks() {
        SkipArrayList<Integer> skipArrayList = new SkipArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assertions.assertThat(skipArrayList.getEveryNthElement(1, 3))
            .containsExactly(1, 5, 9);
    }
}