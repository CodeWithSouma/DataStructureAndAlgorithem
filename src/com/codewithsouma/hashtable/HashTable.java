package com.codewithsouma.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    LinkedList<Entry>[] hashTable = new LinkedList[10];

    public void put(int key, String value) {
        Entry item = new Entry(key, value);
        int index = getHashValue(key);
        if (currentIndexIsEmpty(index))
            createLinkedListAndAddIntoHashTable(item, index);
        else
            handleCollisionsAndAddItem(key, item, hashTable[index]);
    }

    public String get(int key) {
        var index = getHashValue(key);
        if (!currentIndexIsEmpty(index))
            return getValue(key, hashTable[index]);

        return null;
    }

    public void remove(int key){
        var index = getHashValue(key);
        if (!currentIndexIsEmpty(index)){
            var linkedList = hashTable[index];
            linkedList.removeIf(item -> item.key == key);
        }
    }

    private void createLinkedListAndAddIntoHashTable(Entry item, int index) {
        var linkedList = createLinkedList(item);
        hashTable[index] = linkedList;
    }

    private void handleCollisionsAndAddItem(int key, Entry item, LinkedList<Entry> linkedList1) {
        var linkedList = linkedList1;
        int indexOfNewKey = getIndexOfNewKey(linkedList, key);
        if (indexOfNewKey != -1) linkedList.set(indexOfNewKey, item);
        else linkedList.add(item);
    }

    private String getValue(int key, LinkedList<Entry> linkedList1) {
        for (var item : linkedList1)
            if (item.key == key) return item.value;
        return null;
    }

    private int getIndexOfNewKey(LinkedList<Entry> linkedList, int key) {
        for (var item : linkedList)
            if (item.key == key)
                return linkedList.indexOf(item);
        return -1;
    }

    private LinkedList<Entry> createLinkedList(Entry item) {
        LinkedList<Entry> linkedList = new LinkedList<>();
        linkedList.add(item);
        return linkedList;
    }

    private boolean currentIndexIsEmpty(int index) {
        return hashTable[index] == null;
    }

    private int getHashValue(int key) {
        return key % hashTable.length;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(hashTable);
    }
}
