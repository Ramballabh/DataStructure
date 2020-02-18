package main;

import definition.Queue;

public class MainQ {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(5);
        queue.add(6);
        queue.add(10);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);

    }

}
