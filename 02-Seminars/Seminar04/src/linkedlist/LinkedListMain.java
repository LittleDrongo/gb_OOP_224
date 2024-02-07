package linkedlist;

import linkedlist.core.impl.GBLinkedList;
import list.GBList;

import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<>();
        GBLinkedList<Integer> list = new GBLinkedList<>();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(3);

        list.print();

        System.out.println("Size is: " + list.size());

    }

}
