package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testAppOperations() {
        // Test data
        int[] numbers = {5, 2, 9, 1, 7};
        
        // Initialize classes
        ArrayOperationsForLoops forLoopOps = new ArrayOperationsForLoops();
        ArrayOperationsStreams streamOps = new ArrayOperationsStreams();
        StreamAddOns streamAddOns = new StreamAddOns();
        
        // Test for-loop operations
        assertEquals(9, forLoopOps.maximumUsingForLoop(numbers));
        assertEquals(1, forLoopOps.minimumUsingForLoop(numbers));
        assertEquals(24, forLoopOps.sumUsingForLoop(numbers));
        assertEquals(4.8, forLoopOps.averageUsingForLoop(numbers), 0.001);
        
        // Test stream operations
        assertEquals(9, streamOps.maximumUsingStream(numbers));
        assertEquals(1, streamOps.minimumUsingStream(numbers));
        assertEquals(24, streamOps.sumUsingStream(numbers));
        assertEquals(4.8, streamOps.averageUsingStream(numbers), 0.001);
        
        // Test stream add-ons
        assertArrayEquals(new int[]{2}, streamAddOns.evensOnly(numbers));
        assertArrayEquals(new int[]{5, 9, 1, 7}, streamAddOns.oddsOnly(numbers));
        assertArrayEquals(new int[]{10, 7, 14, 6, 12}, streamAddOns.addFive(numbers));
        assertArrayEquals(new int[]{25, 4, 81, 1, 49}, streamAddOns.squareNumbers(numbers));
    }
    
    @Test
    void testAppHasAGreeting() {
        App app = new App();
        assertNotNull(app);
        // Since we've modified App to be more functional, we can test its main method
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}