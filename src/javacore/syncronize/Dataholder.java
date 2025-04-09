package javacore.syncronize;

public class Dataholder {

    private final Object object = new Object();
    private int data;

    public int getData() {
        return data;
    }

    public  void increment() {
        synchronized (object){
            this.data++;
        }
    }
}
