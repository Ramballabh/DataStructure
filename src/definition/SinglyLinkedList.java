package definition;

import adt.SinglyADT;

public class SinglyLinkedList<E> implements SinglyADT<E> {

    @Override
    public void add(E item) {

    }

    @Override
    public void remove(E item) {

    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }

    private static class Node<E> {
        private E data;
        private Node<E> next;


    }
}
