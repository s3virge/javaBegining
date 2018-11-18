package threads;


public class ThreadDemo {
    public static void main(String[] args) {

        //создать объект
        MyThread mt = new MyThread();
        //создать поток на основе объекта
        Thread th0 = new Thread(mt);
        //запустить выполнение нового потока
        th0.start();

        try {
            th0.join(); //просоедениться к главному потоку после завершиня
        }
        catch (Exception e) {
            e.getMessage();
        }

        NewThread th1 = new NewThread("First");
        NewThread th2 = new NewThread("Second");
        NewThread th3 = new NewThread("Third");

        System.out.println("---------------------------");
        System.out.println("Thread " + th1.name + " is running - " + th1.thread.isAlive());
        System.out.println("Thread " + th2.name + " is running - " + th2.thread.isAlive());
        System.out.println("Thread " + th3.name + " is running - " + th3.thread.isAlive());
        System.out.println("---------------------------");

        try {
            System.out.println("Wait for threads finished");

            th1.thread.join();
            th2.thread.join();
            th3.thread.join();

            System.out.println("---------------------------------\n" +
                    " All threads is finished \n" +
                    "-----------------------------------");
        }
        catch (InterruptedException e) {
            e.getMessage();
        }

        for (int c = 0; c < 30; c++) {
            System.out.println("c = " + c);

            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Main thread is interrupted");
            }
        }

        System.out.println("---------------------------");
        System.out.println("Thread " + th1.name + " is running - " + th1.thread.isAlive());
        System.out.println("Thread " + th2.name + " is running - " + th2.thread.isAlive());
        System.out.println("Thread " + th3.name + " is running - " + th3.thread.isAlive());
        System.out.println("---------------------------");

        System.out.println("The main thread is finished");
    }
}
