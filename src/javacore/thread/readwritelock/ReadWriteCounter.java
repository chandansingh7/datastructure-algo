package javacore.thread.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {

    private int counter = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            counter++;
        }
        finally {
            writeLock.unlock();
        }
    }

    public int getCounter(){
        readLock.lock();
        try {
            return counter;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) {

    }
}
