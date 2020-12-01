package com.codewithsouma;


import com.codewithsouma.hashtable.CharFinder;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        String str = "a green apple";
        CharFinder charFinder = new CharFinder();
        var ch = charFinder.findFirstNonRepeatingChar(str);
        System.out.println(ch);



    }


}
