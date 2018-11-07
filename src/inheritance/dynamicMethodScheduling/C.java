package inheritance.dynamicMethodScheduling;

public class C extends A {
    void print() {
        System.out.println("Method print() from " + getClass().getName() + " class ");
    }
}
