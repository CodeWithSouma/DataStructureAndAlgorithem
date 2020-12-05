package com.codewithsouma;


import com.codewithsouma.hashtable.CharFinder;
import com.codewithsouma.hashtable.HashTable;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(10,"Souma");
        hashTable.put(10,"Soumadip Dey");
        hashTable.put(20,"Babu Dey");
        hashTable.remove(40);
        hashTable.remove(10);
        hashTable.remove(20);
        System.out.println(hashTable);


    }
}
