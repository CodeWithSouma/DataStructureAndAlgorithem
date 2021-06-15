package com.codewithsouma.trie;

import java.util.ArrayList;
import java.util.HashMap;

public class Trie {
    private static final int ALPHABET_SIZE = 26;

    private class Node {
        private char value;
        //        private Node[] children = new Node[ALPHABET_SIZE];
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        private Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }

        public boolean hasChild(char ch) {
            return children.containsKey(ch);
        }

        public void addChild(char ch) {
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch) {
            return children.get(ch);
        }

        public Node[] getAllChildren() {
            return children.values().toArray(new Node[0]);
        }
    }

    private Node root = new Node(' ');

    public void insert(String word) {
        if (word == null) throw new IllegalStateException();
        Node current = root;
        for (char ch : word.toLowerCase().toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String word) {
        if (word == null) throw new IllegalStateException();
        Node current = root;
        for (char ch : word.toLowerCase().toCharArray()) {
            if (!current.hasChild(ch)) return false;
            current = current.getChild(ch);
        }
        return current.isEndOfWord;
    }

    public void traverse() {
        preOrderTraverse(root);
    }

    private void preOrderTraverse(Node root) {
        System.out.println(root.value);
        for (Node child : root.getAllChildren())
            preOrderTraverse(child);
    }

/*
    private int calculateIndex(char ch) {
        return ch - 'a';
    }
*/

}
