package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exam_GUI extends JFrame implements ActionListener{
    JTextField tf1,tf2;
    JLabel l1,l2,l3,l4;
    JRadioButton r1,r2;
    JCheckBox ch1,ch2,ch3;
    JButton b;
    Exam_GUI(){
        l1=new JLabel("name");
        tf1=new JTextField("aman");
        l1.setBounds(20,20,80,30);
        tf1.setBounds(140,20,80,30);

        l2=new JLabel("phone number");
        tf2=new JTextField();
        l2.setBounds(20,60,110,30);
        tf2.setBounds(140,60,80,30);

        l3=new JLabel("Gender");
        r1=new JRadioButton("male",true);
        r2=new JRadioButton("female");
        l3.setBounds(20,100,80,30);
        r1.setBounds(50,140,80,30);
        r2.setBounds(140,140,80,30);

        l4=new JLabel("Courses :");
        ch1=new JCheckBox("Java ");
        ch2=new JCheckBox("C++");
        ch3=new JCheckBox("Python");
        l4.setBounds(20,180,80,30);
        ch1.setBounds(20,220,80,30);
        ch2.setBounds(110,220,80,30);
        ch3.setBounds(200,220,80,30);

        b=new JButton("SUBMIT");
        b.setBounds(60,270,80,40);
        b.addActionListener(this);
        add(l1);add(tf1);add(l2);add(tf2);add(l3);add(r1);add(r2);add(l4);add(ch1);add(ch2);add(ch3);add(b);
        setSize(600,600);
        setLayout(null);
        setVisible(true);




    }
    public void actionPerformed(ActionEvent e){
        float credit=0;
        String msg="";
        if(ch1.isSelected()){
            credit+=4;
            msg+="JAVA:-(4)\n";
        }
        if(ch2.isSelected()){
            credit+=4;
            msg+="C++:-(4)\n";

        }
        if(ch3.isSelected()){
            credit+=3;
            msg+="PYTHON:-(3)\n";
        }
        msg+="----------------------\n";
        JOptionPane.showMessageDialog(this,msg+"credits :-"+credit);
    }
    public static void main(String[] args){
        new Exam_GUI();
    }
}
