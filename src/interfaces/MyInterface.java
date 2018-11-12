package interfaces;

import javax.swing.*;

interface MyInterface {
    void showMessage(String text);

    default void allert(String allertText) {
        JOptionPane.showMessageDialog(null, allertText);
    }
}
