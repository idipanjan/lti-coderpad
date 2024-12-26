package coderpad;

import java.util.*;

public class FilterWords {
    public static String[] filterWords(String[] words, String letters) {
        List<String> result = new ArrayList<String>();
        Set<Character> set = new HashSet<Character>();

        for(Character c : letters.toCharArray()){
            set.add(c);
        }

        for(String word : words){
            boolean valid = true;
            for(char c : word.toCharArray()){
                if(!set.contains(c)){
                    valid = false;
                    break;
                }
            }
            if(valid){
                result.add(word);
            }
        }


        return result.toArray(new String[0]);
    }
    public static void main(String[] args){
        String[] words = {"hello", "world", "java", "code"};
        String letters = "oeljwdr";
        System.out.println(Arrays.toString(FilterWords.filterWords(words, letters)));
    }
}
