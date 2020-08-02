package com.sda.zad17.tomek;

public class MeasurementConverter {

    public double convert(double value, ConversionType conversionType) {
        return conversionType.getConverter().apply(value);
    }
}
