package Lambda1;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e){
        e.execute();
    }
}

class ExecutableImplementation implements Executable {

    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        /* 1 */
        runner.run(new ExecutableImplementation());

        /* 2 */
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });

        /* 3 */
        runner.run(() -> System.out.println("Hello"));
    }
}
