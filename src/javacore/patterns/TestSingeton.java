package javacore.patterns;

public class TestSingeton {

    public static void main(String[] args) {

        Singleton singleton = Singleton.creteInstance();
        Singleton singleton1 = Singleton.creteInstance();
        System.out.println(Singleton.count);
        Singleton singleton2 = Singleton.creteInstance();
    }
}
