package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsForLoopsTest {
    private final ArrayOperationsForLoops operations = new ArrayOperationsForLoops();

    @Test
    void testMaximumUsingForLoop() {
        int[] nums = {1, 3, 5, 2, 4};
        assertEquals(5, operations.maximumUsingForLoop(nums));
    }

    @Test
    void testMinimumUsingForLoop() {
        int[] nums = {1, 3, 5, 2, 4};
        assertEquals(1, operations.minimumUsingForLoop(nums));
    }

    @Test
    void testSumUsingForLoop() {
        int[] nums = {1, 3, 5, 2, 4};
        assertEquals(15, operations.sumUsingForLoop(nums));
    }

    @Test
    void testAverageUsingForLoop() {
        int[] nums = {1, 3, 5, 2, 4};
        assertEquals(3.0, operations.averageUsingForLoop(nums));
    }

    @Test
    void testEmptyArrayForMax() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> operations.maximumUsingForLoop(nums));
    }

    @Test
    void testNullArrayForSum() {
        assertThrows(IllegalArgumentException.class, () -> operations.sumUsingForLoop(null));
    }
}