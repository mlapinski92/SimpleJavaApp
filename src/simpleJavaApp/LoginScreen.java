package simpleJavaApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class LoginScreen extends JFrame {

    private JPanel panelMain;
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JButton loginButton;
    private JButton exitButton;


    public LoginScreen() {
        add(panelMain);
        setTitle("Please Log in");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);

        this.setLocationRelativeTo(null);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user, pass;
                user = usernameField.getText();
                pass = passwordField.getText();

                if (user.equals(AccountUtil.USER_NAME) && pass.equals(AccountUtil.PASSWORD)) {
                    JOptionPane.showMessageDialog(panelMain, "You are successfully logged in.");
                    InputScreen inputScreen = new InputScreen();
                    inputScreen.setVisible(true);
                    LoginScreen.super.dispose();

                } else {
                    JOptionPane.showMessageDialog(panelMain, "Login or password incorrect. Try again");
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panelMain, "Goodbye.");
            }
        });
        usernameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usernameField.getText().trim().toLowerCase().equals("username")) {
                    usernameField.setText("");
                    usernameField.setForeground(Color.black);
                }
                super.focusGained(e);
            }
        });
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (passwordField.getText().trim().toLowerCase().equals("password")) {
                    passwordField.setText("");
                    passwordField.setForeground(Color.black);
                }
                super.focusGained(e);
            }
        });
    }
}
