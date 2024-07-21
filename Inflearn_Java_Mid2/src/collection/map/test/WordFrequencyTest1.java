package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] words = text.split(" ");
        Map<String,Integer> result = new HashMap<>();

        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.put(word,result.get(word)+1);
            }
        }
        System.out.println(result);
    }
}
