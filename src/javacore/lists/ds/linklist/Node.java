package javacore.lists.ds.linklist;

public class Node<T> {

    T data;
    Node next;
    public T getData() {
        return data;
    }

    public Node() {
    }

    public void setData(T data) {
        this.data = data;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
