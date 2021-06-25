package com.codewithsouma.trie;

import java.util.*;

public class Trie {
    //private int ALPHABET_IN_ENGLISH = 26;
    private class Node {
        private char value;
        private boolean isEndOfWord = false;
        /*private Node[] children = new Node[ALPHABET_IN_ENGLISH]; // replace array implementation with hashMap
        public boolean hasChild(char ch){
            return children[calculateIndex(ch)] != null;
        }

        public void addChild(char ch){
            children[calculateIndex(ch)] = new Node(ch);
        }

        public Node getChild(char ch) {
            return children[calculateIndex(ch)];
        }

        public Node[] getAllChild(){
            return children;
        }

        private int calculateIndex(char ch) {
            return ch - 'a';
        }*/
        private HashMap<Character, Node> children = new HashMap<>();

        public Node(char value) {
            this.value = value;
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

        public Node[] getAllChild() {
            return children.values().toArray(Node[]::new);
        }

        public boolean hasAnyChildren() {
            return !children.isEmpty();
        }

        public void removeChild(char ch) {
            children.remove(ch);
        }

        private int calculateIndex(char ch) {
            return ch - 'a';
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
    }

    private Node root = new Node(' ');

    // insert operation
    public void insert(String word) {
        if (word == null || word.isEmpty()) throw new IllegalStateException();

        Node current = root;
        for (char ch : word.trim().toLowerCase().toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
        }

        current.isEndOfWord = true;
    }

    //contains operation
    public boolean contains(String word) {
        if (word == null) throw new IllegalStateException();

        Node current = root;
        for (char ch : word.trim().toLowerCase().toCharArray()) {
            if (!current.hasChild(ch)) return false;
            current = current.getChild(ch);
        }

        return current.isEndOfWord;
    }

    public void traverse() {
        postOrderTraverse(root);
    }

    private void postOrderTraverse(Node root) {
        for (Node child : root.getAllChild())
            postOrderTraverse(child);
        System.out.println(root.value);
    }

    private void preOrderTraverse(Node root) {
        System.out.println(root.value);
        for (Node child : root.getAllChild())
            preOrderTraverse(child);
    }

    public void remove(String word) {
        if (word == null || word.isEmpty()) return;
        remove(root, word.toLowerCase(), 0);
    }

    private void remove(Node current, String word, int index) {
        if (index == word.length()) {
            current.isEndOfWord = false;
            return;
        }

        var child = current.getChild(word.charAt(index));
        if (child == null) return;
        remove(child, word, index + 1);

        if (!child.isEndOfWord && !child.hasAnyChildren())
            current.removeChild(child.value);
    }


    public List<String> findWords(String prefix) {
        List<String> words = new ArrayList<>();
        var lastNode = findLastNodeOf(prefix.toLowerCase());
        findWords(lastNode, prefix.toLowerCase(), words);
        return words;
    }

    private Node findLastNodeOf(String prefix) {
        var current = root;
        for (char ch : prefix.toCharArray()) {
            var child = current.getChild(ch);
            if (child == null) return null;
            current = child;
        }
        return current;
    }

    private void findWords(Node root, String prefix, List<String> words) {
        if (root == null) return;
        if (root.isEndOfWord)
            words.add(prefix);
        for (Node child : root.getAllChild())
            findWords(child, prefix + child.value, words);
    }


}
