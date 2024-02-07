package linkedlist.core.impl;

//Для установки ссылок на предыдущий и следующий элементы LinkedList использует объекты своего вложенного класса Node:
public class GBNode<E> {
    E item;
    GBNode<E> next;
    GBNode<E> prev;


    public GBNode(E item, GBNode<E> next, GBNode<E> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
