package coderpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateString {
    public static void main(String[] args) {
        String s = "hello this is fun hello";
        Map<String, Integer> map = new HashMap<>();
        String[] lst = s.split(" ");

        for(String word : lst) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }

        System.out.println(list);
    }
}
