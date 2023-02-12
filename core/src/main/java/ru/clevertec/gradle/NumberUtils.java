package ru.clevertec.gradle;

import ru.clevertec.utils.StringUtils;

import java.util.Arrays;

public final class NumberUtils {

    private NumberUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isAllPositiveNumbers(String... numbers){
      return   Arrays.stream(numbers).allMatch(StringUtils::isPositiveNumber);
    }
}
