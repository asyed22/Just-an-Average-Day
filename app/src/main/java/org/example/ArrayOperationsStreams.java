package org.example;

import java.util.Arrays;

public class ArrayOperationsStreams {
    public int maximumUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        return Arrays.stream(nums).max().getAsInt();
    }

    public int minimumUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        return Arrays.stream(nums).min().getAsInt();
    }

    public int sumUsingStream(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        return Arrays.stream(nums).sum();
    }

    public double averageUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        return Arrays.stream(nums).average().getAsDouble();
    }
}