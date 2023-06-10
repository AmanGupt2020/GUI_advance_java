package com.company;
import javax.swing.*;
import java.awt.event.*;
public class Option_Dialog1 extends WindowAdapter{
    JFrame f;
    Option_Dialog1(){
        f=new JFrame();
        f.addWindowListener(this);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
        if(a==JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args){
        new Option_Dialog1();
    }
}
