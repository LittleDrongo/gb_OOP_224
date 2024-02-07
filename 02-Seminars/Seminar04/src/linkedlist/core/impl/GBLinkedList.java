package linkedlist.core.impl;

import linkedlist.GBLinkedL;

public class GBLinkedList <T> implements GBLinkedL<Object> {

    private GBNode head;
    private GBNode tail;
    private int size;
    private T[] values;


    public GBLinkedList() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

     @Override
    public void addFirst(Object value) {

        GBNode temp = new GBNode(value);

        if(isEmpty()){
            tail = temp;
        }
        else{
            head.prev = temp;
        }

        temp.next = head;
        head = temp;
        size++;
//        values[size++] = value;
    }

    public void printList(){
        GBNode temp = head;

        int i = 0;

        while (temp != null){
            System.out.println("индекс: " + i + " элемент: " + temp.item);
            temp = temp.next;
            i++;
        }
    }

    @Override
    public void addLast(Object value) {
        GBNode temp = new GBNode(value);

        if(isEmpty()){
            head = temp;
        } else {
            tail.next = temp;
        }
        temp.prev = tail;
        tail = temp;
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("индекс: " + index + ", размер: " + size);
        }

        GBNode current = head;
        int currentIndex = 0;

        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        return (T) current.item; //Не удалось вернуть элемент, IDE подсказала кастануть.
    }

}
