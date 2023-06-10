package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JtoolBar extends JFrame {
    JFrame f;
    JtoolBar(){
        f=new JFrame("tool bar");
        JToolBar b=new JToolBar();
        f.add(b);
        JButton b1=new JButton("Button");
        b.add(b1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args){
        new JtoolBar();
    }

}
