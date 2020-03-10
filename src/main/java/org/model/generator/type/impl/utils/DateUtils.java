package org.model.generator.type.impl.utils;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public final class DateUtils {

    private static LocalDate endDate;
    private static LocalDate startDate;
    private static long randomEpochTime;

    private DateUtils() {
    }

    public static LocalDate getRandomFutureDate() {
        startDate = LocalDate.now();
        endDate = LocalDate.now().plusYears(3);
        randomEpochTime =
                ThreadLocalRandom.current().longs(startDate.toEpochDay(), endDate.toEpochDay()).findAny().getAsLong();
        return LocalDate.ofEpochDay(randomEpochTime);
    }

    public static LocalDate getRandomPastDate() {
        startDate = LocalDate.of(1990, 1, 1);
        endDate = LocalDate.now();
        randomEpochTime =
                ThreadLocalRandom.current().longs(startDate.toEpochDay(), endDate.toEpochDay()).findAny().getAsLong();
        return LocalDate.ofEpochDay(randomEpochTime);
    }

    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}