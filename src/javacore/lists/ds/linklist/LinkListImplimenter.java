package javacore.lists.ds.linklist;

public class LinkListImplimenter {

    public static void main(String[] args) {

        NodeLink<String> list = new NodeLink<>();

        // Insert elements at different positions
        list.insert("10ad", 0);
        list.insert("20asdf", 1);
        list.insert("30fas", 1);
        list.insert("40fas", 3);

        // This will throw an exception if uncommented
         list.insert("50asd",4);

        // Traverse and print the list
        list.traverse();
    }
}
