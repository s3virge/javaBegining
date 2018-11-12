package interfaces;

import javax.swing.*;

public class InterfaceDemo implements Alert {
    private static String MSG = "Hello from interface implementation";

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void showMessage() {
        JOptionPane.showMessageDialog(null, MSG);
    }

    public void printMsg(String msgText){
        JOptionPane.showConfirmDialog(null, msgText, "printMsg method()", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo();

        interfaceDemo.showMessage();

        interfaceDemo.showMessage("Another message");

        interfaceDemo.alert("default interface mathod");
        interfaceDemo.showMessage("Interface internal value = " + INTERNALVALUE);

        interfaceDemo.printMsg("Implements printMsg() from Message interface");
        System.out.println("called interface static method. sqrt(9) = " + Alert.sqrt(9));

//        Alert.INTERNALVALUE = 65876; //value is final
    }
}
