package javacore.thread.syncronize;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MySyncThread t1 = new MySyncThread(counter);
        MySyncThread t2 = new MySyncThread(counter);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count is : " + counter.getCount());
    }
}
