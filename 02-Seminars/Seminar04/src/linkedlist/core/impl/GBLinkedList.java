package linkedlist.core.impl;

import linkedlist.GBLinkedL;
import list.GBList;

public class GBLinkedList <T> implements GBLinkedL<T> {

    private int size;
    private T[] values;
    private int capacity;


    public GBLinkedList() {
        this.size = 0;
        this.capacity = 2;

        try {
            this.values = (T[]) new Object[capacity];
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addFirst(T value) {

    }

    @Override
    public void addLast(T value) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }
}
