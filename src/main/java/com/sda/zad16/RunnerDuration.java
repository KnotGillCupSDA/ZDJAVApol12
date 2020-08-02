package com.sda.zad16;

import java.time.Duration;

public enum RunnerDuration {

    BEGINNER(181L, 360),
    INTERMEDIATE(151L, 180L),
    ADVANCED(131L, 150L),
    PROFESSIONAL(0, 130);

    private final Duration minTime;
    private final Duration maxTime;

    RunnerDuration(long minTime, long maxTime) {
        this.minTime = Duration.ofMinutes(minTime);
        this.maxTime = Duration.ofMinutes(maxTime);
    }

    public static RunnerDuration getFitnessLevel(long runningTime) {
        for (RunnerDuration value : RunnerDuration.values()) {
            if (runningTime <= value.maxTime.toMinutes() && runningTime >= value.minTime.toMinutes()) {
                return value;
            }
        }
        return BEGINNER;
    }

    public static RunnerDuration getFitnessLevel(Duration runningTime) {
        for (RunnerDuration value : RunnerDuration.values()) {
            if (runningTime.compareTo(value.minTime) > 0 &&
                runningTime.compareTo(value.maxTime) <= 0) {
                return value;
            }
        }
        return BEGINNER;
    }
}
