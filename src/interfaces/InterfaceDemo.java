package interfaces;

import javax.swing.*;

public class InterfaceDemo implements MyInterface {
    private static String MSG = "Hello from interface implementation";

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void showMessage() {
        JOptionPane.showMessageDialog(null, MSG);
    }

//    @Override
//    public void allert(String allertText) {
//        JOptionPane.showMessageDialog(null, allertText);
//    }

    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo();

        interfaceDemo.showMessage();

        interfaceDemo.showMessage("Another message");

        interfaceDemo.allert("default interface mathod");
    }
}
