package com.company;

import javax.swing.*;

public class SplitDemo extends JFrame  {
    static JFrame f=new SplitDemo();
    static JTextArea t1,t2;
    public static void main(String[] args){
        SplitDemo s=new SplitDemo();
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        t1=new JTextArea(10,10);
        t2=new JTextArea(10,10);
        t1.setText("first Area");
        t2.setText("second area");
        p1.add(t1);
        p2.add(t2);
        JSplitPane sp=new JSplitPane(SwingConstants.HORIZONTAL,p1,p2);
        f.add(sp);
        f.setSize(300,300);
        f.setVisible(true);
        f.show();

    }
}
