package com.codewithsouma.hashtable;


import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char findFirstNoneRepeatingChar(String string) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = string.toCharArray();
        for (var ch : chars) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars)
            if (map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;

    }

}
