package com.codewithsouma.trees;

public class AVLTree {

    private class AVLNode {
        private int value;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "AVLNode{" +
                    "data=" + value +
                    '}';
        }
    }

    private AVLNode root;

    public void insert(int value) {
        //insertNodeUsingIterativeMethod(value);
        root = insert(root, value);

    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null) return new AVLNode(value);

        if (root.value > value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);

        setHeight(root);

        return balance(root);
    }

    private void setHeight(AVLNode node) {
        node.height = height(node);
    }

    private AVLNode balance(AVLNode root) {
        if (isLeftHeavy(root)) {
            if (balanceFactor(root.leftChild) < 0)
                leftRotate(root.leftChild);
          return rightRotate(root);
        } else if (isRightHeavy(root)) {
            if (balanceFactor(root.rightChild) > 0)
                rightRotate(root.rightChild);
            return leftRotate(root);
        }

        return root;
    }

    private AVLNode leftRotate(AVLNode root){
        AVLNode newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(newRoot);
        setHeight(root);
        return newRoot;
    }

    private AVLNode rightRotate(AVLNode root){
        AVLNode newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        setHeight(newRoot);
        setHeight(root);
        return newRoot;

    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private int balanceFactor(AVLNode node) {
        return node == null ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    public int height() {
        return height(root);
    }

    private int height(AVLNode node) {
        if (node == null) return -1;
        if (isLeafNode(node)) return 0;
        return 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

    private boolean isLeafNode(AVLNode node) {
        return node.rightChild == null && node.leftChild == null;
    }

    private void insertNodeUsingIterativeMethod(int value) {
        var newNode = new AVLNode(value);
        if (root == null) root = newNode;
        else {
            var node = whereToPlace(value);
            if (node.value > value) node.leftChild = newNode;
            else node.rightChild = newNode;
        }
    }

    private AVLNode whereToPlace(int value) {
        var currentNode = root;
        while (true) {
            if (currentNode.value > value) {
                if (currentNode.leftChild == null) return currentNode;
                currentNode = currentNode.leftChild;
            } else if (currentNode.value < value) {
                if (currentNode.rightChild == null) return currentNode;
                currentNode = currentNode.rightChild;
            }
        }
    }

}
