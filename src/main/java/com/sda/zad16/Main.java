package com.sda.zad16;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        System.out.println(Runner.getFitnessLevel(115));
        System.out.println(Runner.getFitnessLevel(150));
        System.out.println(Runner.getFitnessLevel(135));
        System.out.println(Runner.getFitnessLevel(290));


        Instant start = Instant.now();
        System.out.println(RunnerDuration.getFitnessLevel(Duration.ofMinutes(115)));
        System.out.println(RunnerDuration.getFitnessLevel(Duration.ofMinutes(150)));
        System.out.println(RunnerDuration.getFitnessLevel(Duration.ofMinutes(135)));
        System.out.println(RunnerDuration.getFitnessLevel(Duration.ofMinutes(290)));
        System.out.println(Duration.between(start, Instant.now()));


    }
}
