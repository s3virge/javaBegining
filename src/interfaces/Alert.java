package interfaces;

import javax.swing.*;

public interface Alert extends Message{
    int INTERNALVALUE = 6;

    void showMessage(String text);

    default void alert(String alertText) {
        JOptionPane.showMessageDialog(null, alertText);
    }
}
