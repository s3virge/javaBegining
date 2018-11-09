package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            compute(6);
            compute(11);
        }
        catch (MyException mEx) {
            System.out.println("Catch exception " + mEx);
        }
    }

    static void compute(int a) throws MyException {
        System.out.println("Was called compute() method");

        if (a > 10) {
            throw new MyException(a);
        }

        System.out.println("Normal finish");
    }
}
