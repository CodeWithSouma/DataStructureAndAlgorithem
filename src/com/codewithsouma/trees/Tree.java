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

    public  void  traversePostOrder(){
        traversePostOrder(root);
    }

    public void  traversePostOrder(Node root){
        if (root == null) return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public  void  traverseInOrder(){
        traverseInOrder(root);
    }

    public void  traverseInOrder(Node root){
        if (root == null) return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public int height(){
        return height(root);
    }
    private int height(Node root){
        if (root == null) return -1;
        if (root.leftChild == null || root.rightChild == null) return 0;
        return 1 +Math.max(height(root.leftChild),height(root.rightChild));
    }


}
