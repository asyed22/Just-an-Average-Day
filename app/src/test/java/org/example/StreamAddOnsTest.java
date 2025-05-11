package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StreamAddOnsTest {
    private final StreamAddOns addOns = new StreamAddOns();

    @Test
    void testEvensOnly() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, addOns.evensOnly(nums));
    }

    @Test
    void testOddsOnly() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, addOns.oddsOnly(nums));
    }

    @Test
    void testAddFive() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {6, 7, 8, 9, 10};
        assertArrayEquals(expected, addOns.addFive(nums));
    }

    @Test
    void testSquareNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, addOns.squareNumbers(nums));
    }

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> addOns.evensOnly(null));
        assertThrows(IllegalArgumentException.class, () -> addOns.oddsOnly(null));
        assertThrows(IllegalArgumentException.class, () -> addOns.addFive(null));
        assertThrows(IllegalArgumentException.class, () -> addOns.squareNumbers(null));
    }
}