package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BalancedWordsCounter {
    public static Integer count(String word) {
        if (word == null || !word.matches("[a-zA-Z]+")) {
            throw new RuntimeException("input param is null");
        }
        String[] words = word.split("");
        HashMap<String, Integer> map = new HashMap<>();

        //find number of occurrences every letter
        for (int i = 0; i <= words.length - 1; i++) {
            if (map.containsKey(words[i])) {
                Integer counter = map.get(words[i]);
                map.put(words[i], counter + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        Integer value = 0;
        Set<Integer> setOfInt = new HashSet<>();

        // add to Set found numbers and checking is this number of occurrences is equal
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            value = entry.getValue();
            setOfInt.add(value);
        }

        //return 1 if input word consist only balanced letters and 0 if not
        return setOfInt.size() < 2 ? 1 : 0;
    }
}
