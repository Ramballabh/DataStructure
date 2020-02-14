package adt;

public interface SinglyADT<E> {
    void add(E item);

    void remove(E item);

    int search(E item);

    void sort();

    void print();

}
