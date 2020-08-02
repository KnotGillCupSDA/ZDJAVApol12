package com.sda.zad17;

import com.sda.zad17.tomek.ConversionType;
import com.sda.zad17.tomek.MeasurementConverter;

public class Main {

    public static void main(String[] args) {
        MeasurementConverter converterT = new MeasurementConverter();
        System.out.println(converterT.convert(2.53, ConversionType.CENTIMETERS_TO_INCHES));

        MeasurementConverter converterM = new MeasurementConverter();
        System.out.println(converterM.convert(2.53, ConversionType.CENTIMETERS_TO_INCHES));
    }
}
