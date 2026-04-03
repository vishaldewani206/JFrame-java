import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JFrame {

    public MyBorderLayout(){


        this.setTitle("BorderLayout");
        this.setSize(500,500);
        this.setLayout(new BorderLayout(10,10));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        JPanel panel51 = new JPanel();
        panel51.setBackground(Color.gray);
        panel51.setPreferredSize(new Dimension(30,30));
        panel5.add(panel51);

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);
        this.add(panel3, BorderLayout.EAST);
        this.add(panel4, BorderLayout.WEST);
        this.add(panel5, BorderLayout.CENTER);

    }
}
