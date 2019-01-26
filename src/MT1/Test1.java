package MT1;

public class Test1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        System.out.println("Hello from main thread");

        MyThread mt2 = new MyThread();
        mt2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Hello from my thread!" + i);
        }
    }
}