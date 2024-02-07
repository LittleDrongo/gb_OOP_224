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
