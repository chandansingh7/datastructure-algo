package javacore.syncronize;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SyncImplement {

    private static final int NUM_THREADS = 10;
    private static final int NUM_ITERS = 100_000;

    public static void main(String[] args) {

        final var data = new Dataholder();
        final var executer = Executors.newFixedThreadPool(NUM_THREADS);
        try {
            for (int i = 0; i < NUM_THREADS; i++) {
                executer.submit(() -> {
                    for (int j = 0; j < NUM_ITERS; j++) {
                        data.increment();
                    }
                });
            }

        } finally {
            executer.shutdown(); // Prevents new tasks from being submitted
            try {
                executer.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); // Wait for all threads to complete
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Expected: " + (NUM_THREADS * NUM_ITERS) + ", Actual: " + data.getData());
    }
}
