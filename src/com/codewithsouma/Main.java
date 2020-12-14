package com.codewithsouma;


import com.codewithsouma.trees.Tree;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(20);
        tree.insert(15);
        tree.insert(60);
        System.out.println(tree.find(60));

    }
}
