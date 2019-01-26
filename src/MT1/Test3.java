package MT1;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadSleep mt5 = new MyThreadSleep();
        mt5.start();

        Thread.sleep(1000);

        MyThreadSleep mt6 = new MyThreadSleep();
        mt6.start();
    }
}

class MyThreadSleep extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my thread!" + i);
        }
    }
}