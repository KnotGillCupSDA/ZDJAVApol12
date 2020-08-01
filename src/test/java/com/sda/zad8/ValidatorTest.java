package com.sda.zad8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ValidatorTest {

    private Validator validator;

    @BeforeEach
    void beforeAll() {
        validator = new ParcelValidatorHubert();
    }

    @Test
    void happyPath() {
        Parcel parcel = new Parcel(10, 10, 10, 1, false);
        Assertions.assertTrue(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenSumOfLengthsIsTooHigh() {
        Parcel parcel = new Parcel(290, 10, 10, 1, false);
        Assertions.assertFalse(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenAnyDimensionTooHigh() {
        List<Parcel> parcels = Arrays.asList(
            new Parcel(31, 1, 1, 1, false),
            new Parcel(1, 34, 1, 1, false),
            new Parcel(1, 1, 35, 1, false));

        for (Parcel parcel : parcels) {
            Assertions.assertFalse(validator.validate(parcel));
        }
    }

    @Test
    void thatIsNotValidWhenTooHeavyNotExpress() {
        Parcel parcel = new Parcel(10, 10, 10, 34, false);
        Assertions.assertFalse(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenTooHeavyExpress() {
        Parcel parcel = new Parcel(10, 10, 10, 17, true);
        Assertions.assertFalse(validator.validate(parcel));
    }
}