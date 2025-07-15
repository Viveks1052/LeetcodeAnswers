package com.leetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class ContainerWithMostWater {

    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {

        OptionalInt value = Arrays.stream(height)
                .distinct()
                .sorted() // Sort in descending order
                .skip(1) // Skip the largest element
                .findFirst(); // Get the second largest element

        // If a value is found, return value * value, otherwise return -1
        return value.isPresent() ? value.getAsInt() * value.getAsInt() : -1;

    }

}
