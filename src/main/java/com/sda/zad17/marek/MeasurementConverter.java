package com.sda.zad17.marek;

public class MeasurementConverter {
    public static double convert(double value, ConversionType conversionType) {
        return value * conversionType.converter;
    }
}
