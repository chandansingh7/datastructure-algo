package javafpp.innerclass;

public class Accessor {



    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
//        System.out.println(innerClass.getMinner().x);
        InnerClass.Minner minner = innerClass.new Minner();
        System.out.println(minner.x);
    }
}


