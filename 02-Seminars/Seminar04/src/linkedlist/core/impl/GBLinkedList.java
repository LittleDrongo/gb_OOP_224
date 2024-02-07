package linkedlist.core.impl;

import linkedlist.GBLinkedL;
import list.GBList;

import java.util.LinkedList;

public class GBLinkedList <T> implements GBLinkedL<T> {

    private int size;
    private T[] values;


    public GBLinkedList() {
        this.size = 0;

        try {
            this.values = (T[]) new Object[size + 1];
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void addFirst(T value) {

        

        size++;

        values[size++] = value;

//        final LinkedList.Node<E> f = first;
//        final LinkedList.Node<E> newNode = new LinkedList.Node<>(null, e, f);
//        first = newNode;
//        if (f == null)
//            last = newNode;
//        else
//            f.prev = newNode;
//        size++;
//        modCount++;
    }

    @Override
    public void addLast(T value) {

    }

    @Override
    public void add(int index, T value) {

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
