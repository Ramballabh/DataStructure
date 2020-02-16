package definition;

import adt.StackADT;

public class Stack<E> implements StackADT<E> {
    private Node<E> top = null;
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(E item) {
        Node<E> node = new Node<>(top, item);
        top = node;
        size++;
    }

    @Override
    public E peek() {
        return top.getData();
    }

    @Override
    public void pop() {
        top = top.getNext();
        size--;
    }

    @Override
    public void print() {
        Node<E> response = top;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            E data = response.getData();
            System.out.print(data + (i < size - 1 ? "," : ""));
            response = response.getNext();
        }
        System.out.println("]");

    }

    private static class Node<E> {
        private Node<E> next;
        private E data;

        private Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }

        private Node(E data) {
            this.data = data;
        }

        private Node<E> getNext() {
            return next;
        }

        private E getData() {
            return data;
        }
    }
}
