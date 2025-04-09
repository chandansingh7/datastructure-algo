package javacore.volitile;

public class UnsafeClass {
    private volatile boolean done = false;

    public void loop() throws InterruptedException {
        System.out.println("Entering loop method");

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
        }
        System.out.println("Setting done to true");
        done = true;
    }

    public void waitToFinish() {
        System.out.println("waitToFinish Entering...");
        while (!done)
        System.out.println("waitToFinish Exiting...");
    }
}
