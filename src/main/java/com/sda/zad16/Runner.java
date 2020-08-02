package com.sda.zad16;

public enum Runner {

    BEGINNER(181L, Long.MAX_VALUE),
    INTERMEDIATE(151L, 180L),
    ADVANCED(120L, 150L);

    private final long minTime;
    private final long maxTime;

    Runner(long minTime, long maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(long runningTime) {
        for (Runner value : Runner.values()) {
            if(runningTime <= value.maxTime && runningTime >= value.minTime) {
                return value;
            }
        }

        return BEGINNER;
    }
}
