package MT1;

public class Test4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner());
        thread1.start();

        Thread thread2 = new Thread(new Runner());
        thread2.start();

        System.out.println("Hello from main");
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Hello from my thread!" + i);
        }
    }
}