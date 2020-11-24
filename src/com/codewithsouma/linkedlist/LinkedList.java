package com.codewithsouma.linkedlist;

import java.util.Arrays;


public class LinkedList {
    private Node first;
    private Node last;
    private int count;

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (size() <= 0)
            createList(newNode);
        else {
            newNode.setNext(first);
            first = newNode;
            count++;
        }
    }

    private void createList(Node newNode) {
        first = newNode;
        last = newNode;
        count++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (size() <= 0)
            createList(newNode);
        else {
            last.setNext(newNode);
            last = newNode;
            count++;
        }
    }

    public void add(int value) {
        addLast(value);
    }

    public void add(int index, int value){
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException("Index is not valid");
        else if (index == 0) addLast(value);
        else if (index == size()) addLast(value);
        else {
            Node newNode = new Node(value);
            Node current = first;
            Node previous = first;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.getNext();
            }
            newNode.setNext(current);
            previous.setNext(newNode);
            count++;
        }
    }

    public int size() {
        return count;
    }

    public void removeFirst() {
        if (size() <= 0) return;
        else if (size() == 1) {
            first = null;
            last = null;
            count--;
        } else {
            Node current = first;
            first = first.getNext();
            current.setNext(null);
            count--;
        }
    }

    public void removeLast() {
        if (size() <= 0) return;
        else if (size() == 1)
            removeFirst();
        else {
            Node current = first;
            Node previous = current;
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);
            last = previous;
            count--;
        }
    }

    public void remove(int index) {
        if (size() <= 0 || index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Invalid index");
        else if (index == 0)
            removeFirst();
        else if (index == size() -1)
            removeLast();
        else
            removeMiddle(index);
    }

    private void removeMiddle(int index) {
        Node current = first;
        Node previous = first;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(current.getNext());
        current.setNext(null);
        count--;
    }


    public boolean contains(int value) {
        if (size() <= 0) return false;
        Node current = first;
        while (current != null) {
            if (current.getValue() == value) return true;
            current = current.getNext();
        }
        return false;
    }

    public int indexOf(int value) {
        if (size() <= 0) return -1;
        Node current = first;
        for (int i = 0; i < size(); i++) {
            if (current.getValue() == value) return i;
            current = current.getNext();
        }
        return -1;
    }

    @Override
    public String toString() {
        if (size() <= 0) return "[]";
        Node current = first;
        int[] items = new int[size()];
        for (int i = 0; i < size(); i++) {
            items[i] = current.getValue();
            current = current.getNext();
        }
        return Arrays.toString(items);
    }


}
