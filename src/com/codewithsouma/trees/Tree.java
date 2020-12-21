package com.codewithsouma.trees;

public class Tree {
    private class Node {
        private int value;
        private Node rightChild;
        private Node leftChild;

        private Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    private Node root;

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    public boolean find(int value) {
        boolean isPresent = false;
        if (root != null) {
            Node current = root;
            while (current != null) {
                if (value == current.value) {
                    isPresent = true;
                    break;
                } else if (value < current.value)
                    current = current.leftChild;
                else
                    current = current.rightChild;

            }
        }

        return isPresent;
    }

    public void  traversePreOrder(){
        traversePreOrder(root);
    }
    public void traversePreOrder(Node root){
        if (root == null) return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }


}
