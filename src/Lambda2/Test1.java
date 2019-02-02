package Lambda2;

interface Executable {
    int execute();
}

class Runner {
    public void run(Executable e) {
        int a = e.execute();
        System.out.println(a);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        /* 1 */
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello");
                return 1;
            }
        });

        /* 2 */
        runner.run(() -> {
            System.out.println("Hello");
            return 5;
        });
    }
}
