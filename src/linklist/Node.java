package linklist;

public class Node {

    Node next;
    int data;

    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }

    public Node(int value) {
        this.data = value;
    }
}
