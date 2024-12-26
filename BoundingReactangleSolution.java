package coderpad;

import java.util.Arrays;
import java.util.List;

public class BoundingReactangleSolution {
    public static List<Integer> boundingRectangle(List<List<Integer>> coordinatesPoints) {
        // Initialize min and max values for x and y
       int minX = Integer.MAX_VALUE;
       int minY = Integer.MAX_VALUE;

       int maxX = Integer.MIN_VALUE;
       int maxY = Integer.MIN_VALUE;

        // Iterate through the list of points
        for (List<Integer> point : coordinatesPoints) {
            int x = point.get(0);
            int y = point.get(1);

            // Update the min and max values
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        // Calculate width and height of the rectangle
        int width = maxX - minX;
        int height = maxY - minY;

        // Return the bounding rectangle information
        return Arrays.asList(minX, minY, width, height);
    }
    public static void main(String[] args){
        // Example input
        List<List<Integer>> coordinatesPoints = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(4, 6),
                Arrays.asList(0, 1),
                Arrays.asList(3, 2)
        );

        // Call the method and print the result
        List<Integer> result = boundingRectangle(coordinatesPoints);
        System.out.println(result); // Output: [0, 1, 4, 5]
    }
}
