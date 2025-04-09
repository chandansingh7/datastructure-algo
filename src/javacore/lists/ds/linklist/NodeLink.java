package javacore.lists.ds.linklist;

public class NodeLink<T> {
    private Node<T> head;
    Node<T> newNode = new Node<>();
    void insert(T data, int position) {
        newNode.setData(data);

        if (position==0) {
            newNode.next = head;
            head = newNode;
            return ;
        }

        Node<T> previous = head;
        int index = 0;

        while (previous != null && index < position - 1) {
            previous = previous.next;
            index++;
        }

        if (previous == null) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }

        newNode.next = previous.next;
        previous.next = newNode;

    }

    void traverse() {
        Node<T> traverser = head;

        while (traverser != null) {
            System.out.println(traverser.data);
            traverser = traverser.next;
        }
    }
}
