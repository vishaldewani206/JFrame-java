package Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextField extends JFrame implements ActionListener {
    JButton btn;
    JTextField textField;


    MyTextField(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btn = new JButton("Submit");
        btn.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 32));
        textField.setForeground(new Color(0x00ff00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Username");


        this.add(btn);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            System.out.println("Welcome " + textField.getText());
            btn.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
