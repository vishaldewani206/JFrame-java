package Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyMenuBar extends JFrame implements ActionListener {

    JMenuItem exitItem;

    MyMenuBar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);

        //keyboard shortcut
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitItem){
            System.exit(0);
        }
    }
}
