public class Solution {

    public static int closestToZero(int[] ints) {
        // Check if the array is null or empty
        if (ints == null || ints.length == 0) {
            return 0;
        }

        // Initialize the closest number as the first element in the array
        int closest = ints[0];

        // Iterate through the array to find the closest number to zero
        for (int num : ints) {
            // If the current number is closer to zero, or if it's equally close but positive
            if (Math.abs(num) < Math.abs(closest) || (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(closestToZero(new int[]{-5, 2, 5, -3}));  // Output: 2
        System.out.println(closestToZero(new int[]{-7, 7}));  // Output: 7
        System.out.println(closestToZero(new int[]{-1, -2, -3, 1, 2, 3}));  // Output: 1
        System.out.println(closestToZero(new int[]{-10, 10}));  // Output: 10
        System.out.println(closestToZero(null));  // Output: 0
        System.out.println(closestToZero(new int[]{}));  // Output: 0
    }
}
