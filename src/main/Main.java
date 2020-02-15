package main;

import definition.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(11);
        list.add(3);
        list.print();
        list.remove();
        System.out.println(list.search(11));
        list.print();
    }
}
