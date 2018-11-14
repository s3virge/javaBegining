package interfaces;

import javax.swing.*;

public class InterfaceDemo implements IInterfaceFirst {
    private static String MSG = "Hello from interface implementation";

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void showMessagefromInterface() {
        JOptionPane.showMessageDialog(null, MSG);
    }

    public void printMsg(String msgText){
        JOptionPane.showConfirmDialog(null, msgText, "printMsg method()", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo();

        interfaceDemo.showMessagefromInterface();

        interfaceDemo.showMessage("Another message");

        interfaceDemo.alert("default interface mathod");
        interfaceDemo.showMessage("Interface internal value = " + INTERNALVALUE);

        interfaceDemo.printMsg("Implements printMsg() from IInterFaceSecond interface");
        System.out.println("called interface static method. sqrt(9) = " + IInterfaceFirst.sqrt(9));

//        IInterfaceFirst.INTERNALVALUE = 65876; //value is final
        interfaceDemo.showInterfaceMessage();
    }
}
