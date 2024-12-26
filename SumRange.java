package coderpad;

public class SumRange {
    public static int sumRange(int[] ints) {
        int sum = 0;

        for (int num : ints) {
            if (num >= 10 && num <= 100) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints1 = {1, 20, 3, 10, -2, 100};
        System.out.println(sumRange(ints1));  // Output: 138

        int[] ints2 = {30, 4, 9, 12, 98, 10, 10};
        System.out.println(sumRange(ints2));  // Output: 150
    }
}
