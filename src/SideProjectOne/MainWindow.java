package SideProjectOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends MainAbs implements ActionListener  {


    void displaySignIn(JPanel p){
        signBtn = new JButton("Sign In");
         signLabel = new JLabel("Sign In to access the software");
        signBtn.setBounds(530, 300, 120,40);
        signLabel.setBounds(500, 250, 250,30);
        signBtn.addActionListener(this);
        p.add(signBtn);
        p.add(signLabel);
    }


    void displaySideBar(Container c){
        JPanel sidebar = new JPanel();
        JLabel l = new JLabel("something");
        sidebar.add(l);
        sidebar.setBackground(Color.yellow);
        sidebar.setOpaque(true);
        sidebar.setPreferredSize(new Dimension(200, 120));
        c.add(sidebar, BorderLayout.WEST);
    }

    void mainPanelContent(){
        JLabel welcome = new JLabel("Welcome to the Software");
        welcome.setAlignmentX(JFrame.CENTER_ALIGNMENT);
        welcome.setFont(new Font("MV Boli", Font.BOLD, 40));
        mainPanel.add(welcome);
    }

    void afterSignedIn(){
        signedIn = true;
        hideSignIn();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        displaySideBar(c);
        mainPanelContent();
        c.revalidate();
        c.repaint();
    }


    MainWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(new BorderLayout());
        ImageIcon smile = new ImageIcon("logo.png");
        this.setIconImage(smile.getImage());

        mainPanel = new JPanel();

        c.add(mainPanel, BorderLayout.CENTER);

        if(!signedIn){
            mainPanel.setLayout(null);
            displaySignIn(mainPanel);
        }else{
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            displaySideBar(c);
        }

        this.setSize(1200,700);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signBtn){
            System.out.println("working");
            new LoginForm(() -> afterSignedIn());
        }
    }

    static void main() {
        SwingUtilities.invokeLater(() -> new MainWindow());
    }
}
