package linkedlist;

public interface GBLinkedL<T> {

    void addFirst(T value);
    void addLast(T value);
    void add(int index, T value);
    int size();
    T get(int index);
}
