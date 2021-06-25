package com.codewithsouma;


import com.codewithsouma.trie.Trie;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("Careful");
        trie.insert("egg");
        System.out.println(trie.findWords("car"));


    }
}
