package SideProjectOne;

import javax.swing.*;
import java.awt.*;

abstract class MainAbs extends JFrame {
    boolean signedIn = false;
    JButton signBtn;
    JPanel mainPanel;
    JLabel signLabel;
    Container c;

    abstract void displaySignIn(JPanel p);
    abstract void mainPanelContent();
    void hideSignIn(){
        signBtn.setVisible(false);
        signLabel.setVisible(false);
    }

}
