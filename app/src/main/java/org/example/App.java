package org.example;

public class App {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        
        // Initialize our operation classes
        ArrayOperationsForLoops forLoopOps = new ArrayOperationsForLoops();
        ArrayOperationsStreams streamOps = new ArrayOperationsStreams();
        StreamAddOns streamAddOns = new StreamAddOns();
        
        System.out.println("Array Operations Demo");
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));
        System.out.println();
        
        // For-loop operations
        System.out.println("Using For Loops:");
        System.out.println("Maximum: " + forLoopOps.maximumUsingForLoop(numbers));
        System.out.println("Minimum: " + forLoopOps.minimumUsingForLoop(numbers));
        System.out.println("Sum: " + forLoopOps.sumUsingForLoop(numbers));
        System.out.println("Average: " + forLoopOps.averageUsingForLoop(numbers));
        System.out.println();
        
        // Stream operations
        System.out.println("Using Streams:");
        System.out.println("Maximum: " + streamOps.maximumUsingStream(numbers));
        System.out.println("Minimum: " + streamOps.minimumUsingStream(numbers));
        System.out.println("Sum: " + streamOps.sumUsingStream(numbers));
        System.out.println("Average: " + streamOps.averageUsingStream(numbers));
        System.out.println();
        
        // Stream add-ons
        System.out.println("Stream Add-Ons:");
        System.out.println("Evens only: " + java.util.Arrays.toString(streamAddOns.evensOnly(numbers)));
        System.out.println("Odds only: " + java.util.Arrays.toString(streamAddOns.oddsOnly(numbers)));
        System.out.println("Add five: " + java.util.Arrays.toString(streamAddOns.addFive(numbers)));
        System.out.println("Squared: " + java.util.Arrays.toString(streamAddOns.squareNumbers(numbers)));
    }
}