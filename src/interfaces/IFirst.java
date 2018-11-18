package interfaces;

import javax.swing.*;

public interface IFirst extends ISecond {
    int INTERNALVALUE = 6;

    void showMessage(String text);

    default void alert(String alertText) {
        JOptionPane.showMessageDialog(null, alertText);
    }

    static double sqrt(double var) {
        return var * var;
    }
}
