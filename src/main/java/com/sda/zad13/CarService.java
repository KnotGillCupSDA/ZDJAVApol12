package com.sda.zad13;

import com.sda.zad12.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public enum SortOrder {
        ASCENDING,
        DESCENDING
    }

    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType() == Car.EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsYoungerThan1999() {
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()))
                .orElse(null);
    }

    public Car getCheapest() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }

    public Car getCarWithAtLeast3Manufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .findFirst()
                .orElse(null);
    }

    public List<Car> getSortedCars(SortOrder sortOrder) {
        return cars.stream()

                .filter(car -> car.getProductionYear() < 1999)
                .collect(Collectors.toList());
    }
}
