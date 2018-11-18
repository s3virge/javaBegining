package threads;

public class NewThread implements Runnable {

    NewThread() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        Fibonacci.print(40);
    }
}
