package coderpad;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumPairFinder {

    // Method to find a pair that sums to the target value
    public static List<Integer> findSumPair(List<Integer> numbers, int target) {
        // Map to store numbers and their indices
        Map<Integer, Integer> seen = new HashMap<>();

        // Iterate through the numbers
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            int complement = target - num;

            // Check if the complement is already in the map
            if (seen.containsKey(complement)) {
                // If found, return the indices of the pair
                return List.of(seen.get(complement), i);
            }

            // Otherwise, store the number with its index
            seen.put(num, i);
        }

        // If no pair is found, return a list with -1, -1 to represent no pair found
        return List.of(-1, -1);
    }

    public static void main(String[] args) {
        // Example List of integers
        List<Integer> numbers = List.of(2, 7, 11, 15);
        int target = 9;

        // Call the method and get the result
        List<Integer> result = findSumPair(numbers, target);

        // Print the result
        System.out.println("Result: " + result);
    }
}
