package com.codewithsouma.hashtable;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    private Map<Character, Integer> map = new HashMap<>();

    public char findFirstNonRepeatingChar(String string) {
        if (string.isEmpty()) throw new IllegalStateException();

        char[] charArray = string.toCharArray();
        createHashTable(charArray);

        return getFirstNoneRepeatedChar(charArray);
    }

    private char getFirstNoneRepeatedChar(char[] charArray) {
        char noneRepeatedChar = ' ';
        for (char ch : charArray) {
            int repeat = map.get(ch);
            if (repeat == 1) {
                noneRepeatedChar = ch;
                break;
            }

        }
        return noneRepeatedChar;
    }

    private void createHashTable(char[] charArray) {
        for (char character : charArray) {
            int count = 0;
            for (char ch : charArray)
                if (character == ch)
                    count++;

            map.put(character, count);
        }
    }
}
