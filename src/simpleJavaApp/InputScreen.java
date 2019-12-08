package simpleJavaApp;

import javax.swing.*;

public class InputScreen extends JFrame {

    private JPanel inputScreen;
    private JComboBox comboBox1;
    private JButton saveButton;
    private JButton showListButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel addressLabel;
    private JLabel yearsOfExperienceLabel;
    private JLabel codeLabel;
    private JLabel salaryLabel;
    private JLabel workplaceLabel;

    public InputScreen() {
        add(inputScreen);
        setTitle("");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);

        this.setLocationRelativeTo(null);
    }
}
