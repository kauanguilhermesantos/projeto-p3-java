import javax.swing.*;

import src.ui.Gui;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Gui().setVisible(true));
    }
}
