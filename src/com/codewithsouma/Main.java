package com.codewithsouma;


import com.codewithsouma.hashtable.CharFinder;

public class Main {

    public static void main(String[] args) {
        // a green apple
        CharFinder charFinder = new CharFinder();
        char ch = charFinder.findFirstNoneRepeatingChar("a green apple");
        System.out.println(ch);


    }


}
