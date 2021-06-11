package com.codewithsouma;


import com.codewithsouma.heap.Heap;
import com.codewithsouma.sorting.HeapSort;
import com.codewithsouma.trees.AVLTree;
import com.codewithsouma.trees.Tree;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       int[] numbers = {5,3,10,1,4,2};
        HeapSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
