package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.cyan;

public class ColorDemo extends JFrame implements ActionListener {
    JTextArea ta=new JTextArea();
    ColorDemo(){
        JFrame f=new JFrame("Color Demo");
        JButton b1=new JButton("choose color");
        b1.setBounds(50,50,150,30);
        ta.setBounds(50,50,150,30);
        b1.addActionListener(this);
        f.add(b1);
        f.add(ta);
        f.setSize(400,400);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        Color c=JColorChooser.showDialog(this,"choose",cyan);
        ta.setBackground(c);


    }
    public static void main(String[] args){
        new ColorDemo();
    }
}

