package interfaces;

import static interfaces.IFirst.INTERNALVALUE;

public class InterfaceDemo {
    private static String MSG = "Hello from interface implementation";

    public static void main(String[] args) {
        FirstrImpl first = new FirstrImpl();
        SecondImpl second = new SecondImpl();

        second.defaultInterfaceMethod();

        first.showMessage("Another message");

        first.alert("default interface mathod");
        first.showMessage("Interface internal value = " + INTERNALVALUE);

        second.printMsg("Implements printMsg() from ISecond interface");
        System.out.println("called interface static method. sqrt(9) = " + IFirst.sqrt(9));

//        IFirst.INTERNALVALUE = 65876; //value is final

        FirstrImpl f = new FirstrImpl();
        f.printMsg("собщение из printMsg");
        f.showMessage("message from showMessage");
    }
}
