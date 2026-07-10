class ThreadOne extends Thread {
    public void run() {
        System.out
                .println("Current Executing Thread ( User Created Thread ) Name : " + Thread.currentThread().getName());
    }
}

public class PrintUserCreatedThreadName {
    public static void main(String[] args) {
        ThreadOne tOne = new ThreadOne();

        tOne.start();
    }
}
