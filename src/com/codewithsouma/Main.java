package com.codewithsouma;


import com.codewithsouma.hashtable.CharFinder;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //green apple
        CharFinder finder = new CharFinder();
        char ch = finder.firstRepeatedCharacter("green apple");
        System.out.println(ch);
    }


}
