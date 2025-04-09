package javacore.volitile;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Volitile {

    private static volatile int myInt = 2;

    public static void main(String[] args) {
        UnsafeClass myClass = new UnsafeClass();
        final int numThreads = 2;
        final var executorService = Executors.newFixedThreadPool(numThreads);

        try {
            executorService.submit(() -> {
                try {
                    myClass.loop();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Preserve the interrupted status
                    throw new RuntimeException(e);
                }
            });

            executorService.submit(myClass::waitToFinish);
        } finally {
             // Prevents new tasks from being submitted
            try {
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); // Wait for all threads to complete
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
