package main;

import definition.Stack;

public class MainS {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(9);
        st.push(7);
        st.push(4);
        st.print();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.print();

    }
}
