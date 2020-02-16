package definition;

import adt.DoublyADT;

public class DoublyLinkedList<E> implements DoublyADT<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    private Node<E> getNode(int index) {
        Node<E> response = head;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 0; i < size; i++) {
                response = response.getNext();
            }
            return response;
        }
    }

    private void addFirst(E item) {
        Node<E> node = new Node<>(head, tail, item);
        head = node;
        tail = node;
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        if (node.next != null) {
            Node<E> node1 = new Node<>(node.next, node, item);
            node.next.previous = node1;
            node.next = node1;
            size++;
        }
    }

    public void add(int index, E item) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0)
            addFirst(item);
        else
            addAfter(getNode(index - 2), item);
    }

    @Override
    public void add(E item) {
        add(size, item);
    }

    @Override
    public E remove() {
        return null;
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
        private Node<E> next;
        private Node<E> previous;
        private E data;

        private Node(Node<E> next, Node<E> previous, E data) {
            this.next = next;
            this.previous = previous;
            this.data = data;
        }

        private Node<E> getNext() {
            return next;
        }

        private Node<E> getPrevious() {
            return previous;
        }

        private E getData() {
            return data;
        }
    }
}
