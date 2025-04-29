package javacore.thread;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread("t1");
        MyThread thread1 = new MyThread("t2");

        thread.start();
        thread1.start();
    }
}
