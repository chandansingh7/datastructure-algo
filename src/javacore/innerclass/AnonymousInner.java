package javacore.innerclass;

public class AnonymousInner {
    interface Ipair {
        public void printHello();
    };

    private String name = "Joe";

    public void printPair(int x, int y) {
        (new Ipair() {
            int first;
            int second;
            public String toString() {
                return "("+ first + ", " +  second + ")";
            }

            public void printHello() {
                name = "Tom";

                System.out.println("Hello " + name + "\n" + this);
            }

        }).printHello();
    }

    public static void main(String[] args) {
        (new AnonymousInner()).printPair(11, 3);
    }
}
