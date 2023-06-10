package com.company;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JLabel;
public class Registration_Form_assignment {
    public static void main(String args[]){
        JFrame frame= new JFrame();
        frame.setTitle("Student Register Form");
        frame.setVisible(true);
        frame.setBounds(500,100,500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        JLabel message = new JLabel("Register a new Student");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        frame.add(message);

        JLabel nameLabel=new JLabel("Name");
        JTextField nameField=new JTextField();
        frame.add(nameField);
        frame.add(nameLabel);

        JLabel genderLabel=new JLabel("Gender");
        JRadioButton genderMale=new JRadioButton("Male", true);
        JRadioButton genderFemale=new JRadioButton("Female");
        frame.add(genderLabel);
        frame.add(genderMale);
        frame.add(genderFemale);
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);

        JLabel mobileNoLabel= new JLabel("Mobile No");
        JTextField mobileNoField=new JTextField();
        frame.add(mobileNoField);
        frame.add(mobileNoLabel);

        JLabel passwordLabel=new JLabel("Password");
        JLabel rePasswordLabel=new JLabel("Re Password");
        JPasswordField passwordField=new JPasswordField();
        JPasswordField rePasswordField=new JPasswordField();
        frame.add(passwordField);
        frame.add(passwordLabel);
        frame.add(rePasswordField);
        frame.add(rePasswordLabel);

        JLabel programLabel=new JLabel("Courses");
        JComboBox<String> programList=new JComboBox<String>();
        programList.addItem("ME/M Tect");
        programList.addItem("BE/B Tect");
        programList.addItem("Ph.D.");
        frame.add(programLabel);
        frame.add(programList);

        JLabel branchLabel=new JLabel("Branch");
        JComboBox<String> branchList= new JComboBox<String>();
        branchList.addItem("Computer Science and Engineering");
        branchList.addItem("Electronics and Telecommunications");
        branchList.addItem("Information Technology");
        branchList.addItem("Electrical Engineering");
        branchList.addItem("Electrical and Electronics Engineering");
        branchList.addItem("Civil Engineering");
        frame.add(branchLabel);
        frame.add(branchList);

        JButton registerButton=new JButton("Register");
        frame.add(registerButton);

        message.setBounds(50,10,600,30);
        nameLabel.setBounds(50,60,100,30);
        nameField.setBounds(130,60,200,30);
        genderLabel.setBounds(50,160,100,30);
        genderMale.setBounds(130,160,100,30);
        genderFemale.setBounds(240,160,100,30);
        mobileNoLabel.setBounds(50,260,100,30);
        mobileNoField.setBounds(130,260,200,30);
        passwordLabel.setBounds(50,310,100,30);
        passwordField.setBounds(130,310,200,30);
        rePasswordLabel.setBounds(50,360,100,30);
        rePasswordField.setBounds(130,360,200,30);
        programLabel.setBounds(50,410,100,30);
        programList.setBounds(130,410,200,30);
        branchLabel.setBounds(50,460,100,30);
        branchList.setBounds(130,460,200,30);
        registerButton.setBounds(130,550,200,30);
    }

}
