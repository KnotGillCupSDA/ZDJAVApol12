package com.sda.zad9;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void radiusCalculation() {
        Circle circle = new Circle(new Point2D(0.0, 0.0), new Point2D(1.0, 0.0));
        Assertions.assertEquals(1.0, circle.getRadius());
    }

    @Test
    void radiusAreaCalculation() {
        Circle circle = new Circle(new Point2D(0.0, 0.0), new Point2D(0.99, 0.0));
        //Assertions.assertEquals(Math.PI, circle.getArea());

        org.assertj.core.api.Assertions.assertThat(circle.getArea())
            .isCloseTo(Math.PI, Percentage.withPercentage(10.0));
    }
}