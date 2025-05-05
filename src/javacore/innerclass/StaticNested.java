package javacore.innerclass;

public class StaticNested {


    private String name = "Joe";
    private Pair p = new Pair();
    {
        p.first = 4;
        p.second = 5;
        System.out.println(p);
    }

    private void printHello() {
        System.out.println("Hello " + name);
    }

    static class Pair {
        int first;
        int second;

        Pair() {
//            printHello();
        }
        public String toString() {
            return "("+ first + ", " +  second + ")";
        }
    }

    public static void main(String[] args) {
        (new StaticNested()).printHello();
//        new MemberInner();
    }
}
