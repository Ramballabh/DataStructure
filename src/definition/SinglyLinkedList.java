package definition;

import adt.SinglyADT;

public class SinglyLinkedList<E> implements SinglyADT<E> {
    private int size = 0;
    private Node<E> head = null;

    private Node<E> getNode(int index) {
        Node<E> response = head;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 0; i < index && head != null; i++) {
                response = response.next;
            }
        }
        return response;
    }

    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        Node<E> node1 = new Node<>(item, node.next);
        node.next = node1;
        size++;
    }

    public void add(int index, E item) {
        if (index == 0) {
            addFirst(item);
        } else {
            addAfter(getNode(index - 1), item);
        }
    }

    @Override
    public void add(E item) {
        add(size, item);

    }

    private void removeFirst() {
        head = head.next;
        size--;
    }

    private void removeAfter(Node<E> node) {
        node.next = node.next.next;
        size--;
    }

    public void remove(int index, E item) {
        if (index == 0)
            throw new IndexOutOfBoundsException(Integer.toString(size));
        else if (index == 1) {
            removeFirst();
        } else
            removeAfter(getNode(index - 1));
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

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
