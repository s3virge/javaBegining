package inheritance.dynamicMethodScheduling;

public class B extends A {
    void print() {
        System.out.println("Method print() from " + getClass().getName() + " class ");
    }
}
