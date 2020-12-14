package com.codewithsouma.trees;

public class Tree {
    private class Node{
        private int value;
        private Node right;
        private Node left;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value){
        Node newNode = new Node(value);
        if (root == null)
            root = newNode;
        else {
            Node current = root;
            while (true){
                if (value > current.value){
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }
                else if (value < current.value){
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                }
            }

        }
    }


    public boolean find(int value){
        boolean isPresent = false;
        if (root != null) {
            Node current = root;
            while (current != null){
                if (value == current.value){
                    isPresent = true;
                    break;
                }
                else if(value < current.value)
                    current = current.left;
                else
                    current = current.right;

            }
        }

        return isPresent;
    }


}
