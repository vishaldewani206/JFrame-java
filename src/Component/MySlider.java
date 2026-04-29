package Component;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MySlider implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    MySlider(){
        frame = new JFrame("Slider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,0); //min, max, value
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("oC = " + slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("oC = " + slider.getValue());
    }
}
