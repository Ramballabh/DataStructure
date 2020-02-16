package main;

import definition.DoublyLinkedList;

public class MainD {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(4);
        list.add(6);
        list.add(2);
        list.print();
        list.remove();
        list.print();
        System.out.println(list.search(6));
    }
}
