package linklist;

public class LinkList {

    private Node head;
    private Node tail;

    public LinkList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public LinkList() {
        this.head = null;
        this.tail = null;
    }

    void addInt(int value) {
        Node n = new Node(value);

        if (head == null){
            head = n;
            tail = n;
        }else {
            tail.next = n;
            tail = n;
        }
    }

    void dispalay() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "=>");
            n = n.next;
        }
    }
}
