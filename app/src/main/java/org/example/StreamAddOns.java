package org.example;

import java.util.Arrays;

public class StreamAddOns {
    public int[] evensOnly(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        return Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public int[] oddsOnly(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        return Arrays.stream(nums)
                .filter(n -> n % 2 != 0)
                .toArray();
    }

    public int[] addFive(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        return Arrays.stream(nums)
                .map(n -> n + 5)
                .toArray();
    }

    public int[] squareNumbers(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        return Arrays.stream(nums)
                .map(n -> n * n)
                .toArray();
    }
}