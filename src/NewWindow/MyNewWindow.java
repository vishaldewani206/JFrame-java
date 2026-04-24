package NewWindow;

import javax.swing.*;
import java.awt.*;

public class MyNewWindow {

    JFrame frame = new JFrame();
    JLabel myLabel = new JLabel("Hello");



    MyNewWindow(){

        myLabel.setBounds(0,0,100,50);
        myLabel.setFont(new Font(null, Font.PLAIN,25));
        frame.add(myLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
