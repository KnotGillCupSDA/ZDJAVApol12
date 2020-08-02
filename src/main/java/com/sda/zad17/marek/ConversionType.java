package com.sda.zad17.marek;

import java.util.concurrent.TimeUnit;

public enum ConversionType {
    METERS_TO_YARDS(1.0936133),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_INCHES(0.39370079),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621371192),
    MILES_TO_KILOMETERS(1.609344);

    public final double converter;

    ConversionType(double converter) {
        this.converter = converter;
    }


}
