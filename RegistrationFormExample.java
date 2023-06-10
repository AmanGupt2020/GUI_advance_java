package com.company;
import javax.swing.*;
import java.awt.*;


public class RegistrationFormExample {
    RegistrationFormExample(){
        JFrame f= new JFrame("Registration Form Example");
        JLabel j=new JLabel("Registration form for Student");
        j.setFont(new Font("Serif",Font.BOLD,28));
        j.setBounds(20,0,500,80);



        JLabel l1=new JLabel("Name");
        JTextField t1=new JTextField();
        JLabel l2=new JLabel("Gender");
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        JLabel l3=new JLabel("Mobile No");
        JTextField t2=new JTextField();
        JLabel l4=new JLabel("Mobile No");
        JTextField t3=new JTextField();
        l1.setBounds(20,100,80,30);
        t1.setBounds(100,100,100,30);
        l2.setBounds(20,140,80,30);
        r1.setBounds(100,140,80,30);
        r2.setBounds(180,140,80,30);
        l4.setBounds(20,220,80,30);
        t3.setBounds(100,220,100,30);
        f.add(j);
        f.add(l1);
        f.add(t1);
        f.add(l2);

        f.add(r1);
        f.add(r2);
        f.add(l4);
        f.add(t3);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);









    }
    public static void main(String[] args){
        new RegistrationFormExample();
    }
}
