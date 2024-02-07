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
        list.addLast(999);

        list.printList();

        System.out.println("Размер: " + list.size());

        System.out.println(list.get(3));

    }

}
