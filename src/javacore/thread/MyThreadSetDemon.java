package javacore.thread;

public class MyThreadSetDemon extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello Wold !");
        }
    }

    public static void main(String[] args) {
        MyThreadSetDemon myThread = new MyThreadSetDemon();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("Main done");
    }
}

// demons runs in background