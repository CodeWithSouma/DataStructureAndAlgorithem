package com.codewithsouma;


import com.codewithsouma.heap.Heap;
import com.codewithsouma.trees.AVLTree;
import com.codewithsouma.trees.Tree;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var heap = new Heap(10);
        heap.insert(50);
        heap.insert(40);
        heap.insert(30);
        heap.insert(20);
        heap.insert(10);
        var item = heap.remove();
        System.out.println("Done!"+item);
    }
}
