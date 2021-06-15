package com.codewithsouma;


import com.codewithsouma.heap.Heap;
import com.codewithsouma.heap.MaxHeap;
import com.codewithsouma.practice.Matrix;
import com.codewithsouma.sorting.HeapSort;
import com.codewithsouma.trees.AVLTree;
import com.codewithsouma.trees.Tree;
import com.codewithsouma.trie.Trie;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Trie trie =  new Trie();
        trie.insert("Can");
        trie.insert("Cat");
        trie.traverse();*/
        Matrix matrix = new Matrix(3,3);
        matrix.inputMatrix();
        matrix.printMatrix();
        System.out.println();
    }
}
