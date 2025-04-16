package javacore.stack;

public class StackImpl {

    public static void main(String[] args) {

        MyStack<String> stack = new MyStack<>();

        stack.push("A");
        stack.push("bac");
        stack.push("Adef");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
