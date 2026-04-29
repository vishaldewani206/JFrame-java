package Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JFrame implements ActionListener {

    JButton button;
    JButton button2;
    JLabel label;
    Boolean isVisible = false;
    MyButton(){
        ImageIcon icon = new ImageIcon("user.png");

        label = new JLabel("is it visible?");
        label.setBounds(300, 400, 100,100);
        label.setVisible(isVisible);

        button2 = new JButton("click me 2");
        button2.setBounds(100,300, 200, 100 );
        button2.addActionListener(this);

        button = new JButton("Click me");
        button.setBounds(200,100, 300, 100);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createBevelBorder(14));

        this.setTitle("JButton");
        this.setSize(750,750);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("poo");
            isVisible = !isVisible;
            label.setVisible(isVisible);

        }
        if(e.getSource() == button2){
            System.out.println("poo 2");
        }
    }
}
