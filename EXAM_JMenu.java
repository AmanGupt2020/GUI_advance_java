package com.company;
import javax.swing.*;

public class EXAM_JMenu extends JFrame{
    EXAM_JMenu(){

        JMenuBar b=new JMenuBar();
        add(b);
        JMenu m1=new JMenu("FILE");
        JMenu m2=new JMenu("OPTION");
        b.add(m1);
        b.add(m2);
        JMenuItem mi1=new JMenuItem("copy");
        JMenuItem mi2=new JMenuItem("pate");
        JMenuItem mi3=new JMenuItem("open");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        setJMenuBar(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args){
        new EXAM_JMenu();
    }
}
