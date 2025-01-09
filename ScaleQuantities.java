package coderpad;

import java.util.Arrays;

public class ScaleQuantities {

    public static String[] updateQuantity(String[] arr, int person) {
        String[] result = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            String[] parts = arr[i].split("", 2);

            int unit = Integer.parseInt(parts[0])*person;
            result[i] = unit +parts[1];
        }

        return result;

    }
    public static void main(String[] args) {
        String[] arr = {"4 kg of rice", "2 liter of 5 bottles"};
        int person = 10;

        String[] result = updateQuantity(arr, person);

        // Print the result
        for (String s : result) {
            System.out.println(s);
        }
    }
}
