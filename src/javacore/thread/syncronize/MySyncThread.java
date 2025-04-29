package javacore.thread.syncronize;

public class MySyncThread extends Thread{

    private Counter counter;

    public MySyncThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
