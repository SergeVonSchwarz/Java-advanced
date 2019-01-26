package MT1;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt3 = new MyThread();
        mt3.start();
        System.out.println("Sleep");
        Thread.sleep(10);
        System.out.println("Awake");

        MyThread mt4 = new MyThread();
        mt4.start();
    }
}
