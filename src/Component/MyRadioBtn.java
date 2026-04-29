package Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioBtn extends JFrame implements ActionListener {

    JRadioButton pizzaBtn;
    JRadioButton hamburgerBtn;
    JRadioButton hotdogBtn;

    MyRadioBtn(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaBtn = new JRadioButton("Pizza");
        hamburgerBtn = new JRadioButton("Hamburger");
        hotdogBtn = new JRadioButton("Hot Dog");

        pizzaBtn.addActionListener(this);
        hamburgerBtn.addActionListener(this);
        hotdogBtn.addActionListener(this);

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(pizzaBtn);
        btnGroup.add(hamburgerBtn);
        btnGroup.add(hotdogBtn);

        this.add(pizzaBtn);
        this.add(hamburgerBtn);
        this.add(hotdogBtn);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaBtn ){
            System.out.println("You ordered Pizza!");
        }else if(e.getSource() == hamburgerBtn){
            System.out.println("You ordered Hamburger");
        }else{
            System.out.println("You ordered hot dog");
        }
    }
}
