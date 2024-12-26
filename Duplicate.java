package coderpad;

import java.util.*;

public class Duplicate {
    public static int[] filterDuplicates(int[] data) {

        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<data.length; i++){
            if(!set.contains(data[i])){
                set.add(data[i]);
                result.add(data[i]);
            }
        }

        int[] res = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            res[i] = result.get(i);
        }

        return res;

    }

    public static void main(String[] args){
        int[] data = {7,6,4,3,3,4,9};
        int[] result = filterDuplicates(data);
        System.out.println(Arrays.toString(result));
    }
}
