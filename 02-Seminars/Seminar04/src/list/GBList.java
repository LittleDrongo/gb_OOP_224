package list;

public interface GBList <T> extends Iterable<T> {

    void add(T item);
    void remove(int index);
    T get(int index);
    int size();

}
