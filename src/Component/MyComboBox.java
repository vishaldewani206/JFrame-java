package Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBox extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyComboBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"Dog", "Cat", "Bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
