package javacore.patterns;

public class Singleton {

    static int count=0;
    private static final Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton creteInstance() {
        if (singleton != null){
            count++;
        return singleton;
    }else{
            return null;}
    }
}
