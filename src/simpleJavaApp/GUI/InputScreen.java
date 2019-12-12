package simpleJavaApp.GUI;

import simpleJavaApp.dataBase.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputScreen extends JFrame {

    private JPanel inputScreen;
    private JComboBox comboBox1;
    private JButton saveButton;
    private JButton showListButton;
    private JTextField nameTextField;
    private JTextField addressTextField;
    private JTextField yoeTextField;
    private JTextField codeTextField;
    private JTextField workplaceTextField;
    private JLabel nameLabel;
    private JLabel addressLabel;
    private JLabel yearsOfExperienceLabel;
    private JLabel codeLabel;
    private JLabel workplaceLabel;


    public InputScreen() {
        add(inputScreen);
        setTitle("");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);

        this.setLocationRelativeTo(null);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int selection = comboBox1.getSelectedIndex();

                String text = yoeTextField.getText();
                int parseInt = Integer.parseInt(text);
                int salaryTeacher = parseInt * 1000;
                int salarySoftwareEngineer = parseInt * 2000;
                int salaryDoctor = parseInt * 3000;

                switch (selection) {
                    case 0:
                        Teacher teacher = new Teacher(Employee.getId(), nameTextField.getText(), addressTextField.getText(),
                                parseInt, salaryTeacher, workplaceTextField.getText());
                        EmployeeList.dataBaseList.add(teacher);
                    case 1:
                        SoftwareEngineer softwareEngineer = new SoftwareEngineer(Employee.getId(), nameTextField.getText(), addressTextField.getText(),
                                parseInt, salarySoftwareEngineer, workplaceTextField.getText());
                        EmployeeList.dataBaseList.add(softwareEngineer);
                    case 2:
                        Doctor doctor = new Doctor(Employee.getId(), nameTextField.getText(), addressTextField.getText(),
                                parseInt, salaryDoctor, workplaceTextField.getText());
                        EmployeeList.dataBaseList.add(doctor);
                }
            }
        });
    }

}
