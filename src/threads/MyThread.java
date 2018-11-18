package threads;

public class MyThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int c = 0; c < 35; c++) {
                System.out.print("*");
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            e.getMessage();
        }

        System.out.println();
    }
}
