package threads;

public class ThreadDemo {
    public static void main(String[] args) {

        new NewThread();
        new NewThread();
        new NewThread();

        for (int c = 0; c < 30; c++) {
            System.out.println("c = " + c);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
