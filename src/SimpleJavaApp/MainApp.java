package SimpleJavaApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class MainApp extends JFrame {
    private JButton Login;
    private JPanel panelMain;
    private JPasswordField password;
    private JTextField username;
    private JButton loginButton;
    private JButton exitButton;


    public MainApp() {
        add(panelMain);
        setTitle("Please Log in");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);

        this.setLocationRelativeTo(null);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user, pass;
                user = username.getText();
                pass = password.getText();

                if (user.equals("admin") && pass.equals("123")) {
                    JOptionPane.showMessageDialog(panelMain, "You are successfully logged in.");
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
        username.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (username.getText().trim().toLowerCase().equals("username")) {
                    username.setText("");
                    username.setForeground(Color.black);
                }
                super.focusGained(e);
            }
        });
        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (password.getText().trim().toLowerCase().equals("password")) {
                    password.setText("");
                    password.setForeground(Color.black);
                }
                super.focusGained(e);
            }
        });
    }
}
