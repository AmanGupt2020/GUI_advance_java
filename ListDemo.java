package com.company;

import javax.swing.*;
public class ListDemo extends JFrame {
    public static void main(String[] args){
        JFrame f=new JFrame("List Demo");
        ListDemo s=new ListDemo();
        JPanel p=new JPanel();
        JLabel lb=new JLabel("Day");
        String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JList l=new JList(day);
        lb.setBounds(20,20,50,50);
        l.setSelectedIndex(0);
        p.add(lb);
        p.add(l);
        f.add(p);


        JLabel lb2=new JLabel("month");
        lb2.setBounds(80,20,50,50);
        String month[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
        JList l2=new JList(month);
        l2.setSelectedIndex(0);
        p.add(lb2);
        p.add(l2);



        JLabel lb3=new JLabel("Year");
        lb3.setBounds(150,20,50,50);
        String year[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
        JList l3=new JList(year);
        l3.setSelectedIndex(0);
        p.add(lb3);
        p.add(l3);
        p.setBounds(0,0,200,700);
        JPanel p2=new JPanel();
        p2.setBounds(250,0,200,200);
        JLabel l4=new JLabel("Value :");
        l4.setBounds(260,0,50,30);
        JTextField tf=new JTextField();
        tf.setBounds(320,0,50,30);

        p2.add(l4);
        p2.add(tf);
        f.add(p2);

        f.setSize(800,900);
        f.show();
    }
}
