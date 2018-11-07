package inheritance.dynamicMethodScheduling;

public class dynamicMethodTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A aaa;

        aaa = a;
        aaa.print();

        aaa = b;
        a.print();

        aaa = c;
        a.print();
    }
}
