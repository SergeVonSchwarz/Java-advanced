package Lambda1;

public class Test1 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });

        Thread t2 = new Thread(() -> System.out.println("Hello"));
    }
}
