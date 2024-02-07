package linkedlist.core.impl;

import org.w3c.dom.Node;

//Для установки ссылок на предыдущий и следующий элементы LinkedList использует объекты своего вложенного класса Node:
public class GBNode<E> {
    E item;
    GBNode<E> next;
    GBNode<E> prev;

    public GBNode(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public GBNode<E> getNext() {
        return next;
    }

    public void setNext(GBNode<E> next) {
        this.next = next;
    }

    public GBNode<E> getPrev() {
        return prev;
    }

    public void setPrev(GBNode<E> prev) {
        this.prev = prev;
    }
}
