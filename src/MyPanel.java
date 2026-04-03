import javax.swing.*;
import java.awt.*;

public class MyPanel extends JFrame {

    MyPanel(){
        ImageIcon icon = new ImageIcon("user.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0, 250,250);
        redPanel.setLayout(new BorderLayout());
        redPanel.add(label);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);


        this.setTitle("JPanel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750,750);
        this.setLayout(null);
        this.setVisible(true);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
    }
}
