package MT2;

public class Test2 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test2 test = new Test2();
        test.doWork();
    }

    public synchronized void increment() {  // synchronized threads, syntax only for methods
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    //counter++;
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    //counter++;
                    increment();
                }
            }
        });

        // race condition
        t1.start();
        t2.start();

        t1.join();  // wait to end
        t2.join();  // wait to end

        System.out.println(counter);
    }
}
