package Component;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JFrame{

    MyLabel(){
        //LABEL
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");

        ImageIcon image = new ImageIcon("user.png"); //creating image
        Border border = BorderFactory.createLineBorder(Color.green, 3); //creating border
        label.setIcon(image); //set icon of the label
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER or RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER or BOTTOM of imageicon
        label.setForeground(new Color(0,0,255)); //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of text
        label.setIconTextGap(100); //set gap of text to image
        label.setBackground(Color.gray); //set background color of label
        label.setOpaque(true); // show the background
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //vertical alignment
        label.setHorizontalAlignment(JLabel.CENTER); //horizontal alignment

//        this.setSize(420,420);
        this.setTitle("This is the title for jframe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(label);
        this.pack(); //set the size of window to the size of the component

        ImageIcon icon = new ImageIcon("logo.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(62, 237, 135));

    }
}
