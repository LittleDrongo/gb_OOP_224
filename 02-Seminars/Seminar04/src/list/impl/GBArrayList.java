package list.impl;

import list.ArrayIterator;
import list.GBList;

import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {
    private int size;
    private T[] values;
    private int capacity;

    @SuppressWarnings("unchecked")
    public GBArrayList() {
        this.size = 0;
        this.capacity = 2;
        try {
            this.values = (T[]) new Object[capacity];
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    private void addCapacity() {
        try {
            capacity = capacity * 2;
            T[] temp = (T[]) new Object[capacity];
            System.arraycopy(values, 0, temp, 0, values.length);
            values = temp;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(T item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
}
