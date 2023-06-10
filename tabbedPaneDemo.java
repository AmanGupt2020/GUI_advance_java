package com.company;

import javax.swing.*;

public class tabbedPaneDemo {
    JFrame f=new JFrame();

    tabbedPaneDemo(){
        JTextArea ta1=new JTextArea(200,200);
        JPanel p1=new JPanel();
        p1.add(ta1);




        JTextArea ta2=new JTextArea(200,200);
        JPanel p2=new JPanel();
        p2.add(ta2);
        JTextArea ta3=new JTextArea(200,200);
        JPanel p3=new JPanel();
        p3.add(ta3);
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("Personal Info",p1);
        tp.add("Qualification",p2);
        tp.add("Area of interest",p3);


        f.add(tp);
        f.setSize(400,400);
        f.setVisible(true);



    }
    public static void main(String[] args){
        new tabbedPaneDemo();
    }
}
