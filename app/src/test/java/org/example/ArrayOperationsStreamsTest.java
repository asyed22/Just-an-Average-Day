package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsStreamsTest {
    private final ArrayOperationsStreams operations = new ArrayOperationsStreams();

    @Test
    void testMaximumUsingStream() {
        int[] nums = {1, 3, 5, 2, 4};
        assertEquals(5, operations.maximumUsingStream(nums));
    }

    @Test
    void testMinimumUsingStream() {
        int[] nums = {1, 3, 5, 2, 4};
        assertEquals(1, operations.minimumUsingStream(nums));
    }

    @Test
    void testSumUsingStream() {
        int[] nums = {1, 3, 5, 2, 4};
        assertEquals(15, operations.sumUsingStream(nums));
    }

    @Test
    void testAverageUsingStream() {
        int[] nums = {1, 3, 5, 2, 4};
        assertEquals(3.0, operations.averageUsingStream(nums));
    }

    @Test
    void testEmptyArrayForMax() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> operations.maximumUsingStream(nums));
    }

    @Test
    void testNullArrayForSum() {
        assertThrows(IllegalArgumentException.class, () -> operations.sumUsingStream(null));
    }
}