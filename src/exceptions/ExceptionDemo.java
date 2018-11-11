package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            compute(6);
//            compute(11);
            getException();
        }
        catch (MyException | SimpleException mEx) {
            System.err.println("Catch exception ");
            System.err.println(mEx); //here calls toString method
            mEx.printStackTrace();
        }
    }

    static void compute(int a) throws MyException {
        System.out.println("Was called compute() method");

        if (a > 10) {
            throw new MyException(a);
        }

        System.out.println("compute method was finished normal");
    }

    static void getException() throws SimpleException {
        System.out.println("getException() method was called.");
        throw new SimpleException("Ёли-пали, что-то пошло не так");
    }
}
