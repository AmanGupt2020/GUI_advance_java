package com.company;

import javax.swing.*;
import java.awt.event.*;

class DialogBoxDemo extends JFrame implements ActionListener{
    static JFrame f;
    public static void main(String[] args){
        f=new JFrame("Dialog Example");
        DialogBoxDemo s= new DialogBoxDemo();
        JLabel l=new JLabel("Enter Name:");
        l.setBounds(50,80,80,30);
        JTextField t=new JTextField();
        t.setBounds(150,80,80,30);
        t.setToolTipText("Enter your name");

        JButton b=new JButton("SUBMIT");
        b.setBounds(60,120,80,30);
        b.addActionListener(s);
        f.add(l);

        f.add(t);
        f.add(b);
        f.setSize(600,600);
        f.show();
        f.setLayout(null);

        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        if(s.equals("SUBMIT")){
            JDialog d=new JDialog(f,"Dialog Box");
            JLabel l=new JLabel("Welcome! Aman");
            l.setBounds(20,80,100,30);
            JButton b=new JButton("OK");
            b.setBounds(20,60,80,30);
            d.add(l);
            d.add(b);
            d.setSize(400,400);

            d.setVisible(true);
        }
    }
}
