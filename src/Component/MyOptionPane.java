package Component;

import javax.swing.*;

public class MyOptionPane {

    MyOptionPane(){
//        JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.ERROR_MESSAGE);
//        int i = JOptionPane.showConfirmDialog(null, "is this ok?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println(i);
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name);

        String[] response = {"No, you are awesome", "thank you", "blush"}; //optional

        ImageIcon icon = new ImageIcon("smile.png"); //optional
        int answer = JOptionPane.showOptionDialog(null, "you are awesome", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,icon,response, 0);
    }

}
