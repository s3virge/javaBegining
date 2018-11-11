package exceptions;

public class SimpleException extends Exception {
    private String message;

    SimpleException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
//        return super.toString();
        return message;
    }
}