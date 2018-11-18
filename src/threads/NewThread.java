package threads;

public class NewThread implements Runnable {
    Thread thread;
    String name;

    NewThread(String threadname) {
        name = threadname;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        Fibonacci.print(40);
    }
}
