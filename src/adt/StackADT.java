package adt;

public interface StackADT<E> {
    public boolean isEmpty();

    public void push(E item);

    public E peek();

    public void pop();

    public void print();

}
