package threads;

public class FirstTread implements Runnable {
    @Override
    public void run() {
        System.out.println("FirstTread.run");
    }
}
