package MT2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        mt1.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;    // (valatile) running - no cashing in memory

    public void run() {
        while(running) {
            System.out.println("Hello");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}