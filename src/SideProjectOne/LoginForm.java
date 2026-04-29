package SideProjectOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {

    JPasswordField passwordField;
    JCheckBox showPass;
    char defaultEcho;
    JButton btn;
    JTextField nameField;
    JLabel errorpara;
    private Runnable onLoginSuccess;

    LoginForm(Runnable  onLoginSuccess) {
        this.onLoginSuccess = onLoginSuccess;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Login Form");
        this.setSize(420, 620);

        // Main panel (vertical layout)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.yellow);
        mainPanel.setOpaque(true);

        // Heading
        JLabel heading = new JLabel("Login Form");
        heading.setFont(new Font(null, Font.BOLD, 34));
        heading.setAlignmentX(Component.CENTER_ALIGNMENT);

        //error paragraph
        errorpara = new JLabel("error");
        errorpara.setVisible(false);


        // Name panel (row)
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.setMaximumSize(new Dimension(300, 20));
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(15); // width set here

        namePanel.setBackground(Color.yellow);
        namePanel.setOpaque(true);

        namePanel.add(nameLabel);
        namePanel.add(nameField);

        // Password
        JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        passPanel.setMaximumSize(new Dimension(300,60));
        JLabel passLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(15);

        passPanel.setBackground(Color.yellow);
        passPanel.setOpaque(true);

        defaultEcho = passwordField.getEchoChar();

        showPass = new JCheckBox("Show Password");
        showPass.addActionListener(this);

        showPass.setBackground(Color.yellow);
        showPass.setOpaque(true);

        passPanel.add(passLabel);
        passPanel.add(passwordField);
        passPanel.add(showPass);

        btn = new JButton("Submit");
        btn.addActionListener(this);

        // Add spacing + components
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(heading);
        mainPanel.add(errorpara);
        mainPanel.add(Box.createVerticalStrut(30));
        mainPanel.add(namePanel);
        mainPanel.add(Box.createVerticalStrut(30));
        mainPanel.add(passPanel);
        mainPanel.add(btn);

        this.add(mainPanel);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == showPass ){
            if(showPass.isSelected()){
                    passwordField.setEchoChar((char) 0);
            }else{
                passwordField.setEchoChar(defaultEcho);
            }
        }

        if(e.getSource() == btn){
            if (nameField.getText().isEmpty() || passwordField.getPassword().length == 0) {
                errorpara.setText("All fields are required!");
                errorpara.setVisible(true);
            } else {
                String name = nameField.getText();
                String pass = new String(passwordField.getPassword());

                if (name.equals("admin") && pass.equals("12345")) {
                    errorpara.setText("Logged In!");
                    errorpara.setVisible(true);
                    onLoginSuccess.run(); // notify MainWindow
                    dispose();

                } else {
                    errorpara.setText("Invalid Credentials");
                    errorpara.setVisible(true);
                }
            }
        }
    }



}