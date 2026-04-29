import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener extends JFrame implements KeyListener {

    JLabel label;

    MyKeyListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("working");
        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX() - 10, label.getY());
            break;
            case 'd': label.setLocation(label.getX() +10, label.getY());
            break;
            case 's': label.setLocation(label.getX() , label.getY()+10);
            break;
            case 'w': label.setLocation(label.getX() , label.getY()-10);
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released:" + e.getKeyChar());
    }
}
