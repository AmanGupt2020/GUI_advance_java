package com.company;
import java.awt.*;
import  javax.swing.*;
public class Menu_Example {
    Menu_Example(){
        JFrame f=new JFrame("menu example");
        f.setLayout(new GridLayout(5,1));
        JMenuBar mb=new JMenuBar();
        f.setJMenuBar(mb);
        JMenu menufile=new JMenu("file");
        mb.add(menufile);
        JMenuItem itemNew=new JMenuItem("New");
        JMenuItem itemOpen=new JMenuItem("open");
        JMenuItem itemSave=new JMenuItem("Save");
        JMenuItem itemExit=new JMenuItem("Exit");
        menufile.add(itemNew);
        menufile.add(itemOpen);
        menufile.add(itemSave);
        menufile.add(itemExit);
        JMenu menufile2=new JMenu("Edit");
        mb.add(menufile2);
        JRadioButton itemCut=new JRadioButton("Cut");
        JRadioButton itemCopy=new JRadioButton("Copy");
        JRadioButton itemPaste=new JRadioButton("Paste");
        menufile2.add(itemCut);
        menufile2.add(itemCopy);
        menufile2.add(itemPaste);
        JMenu menufile3=new JMenu("View");
        mb.add(menufile3);
        //JMenuItem itemImage=new JMenuItem("Image");
        //menufile3.add(itemImage);
        JCheckBoxMenuItem Option1=new JCheckBoxMenuItem("Option 1");
        menufile3.add(Option1);
        JCheckBoxMenuItem Option2=new JCheckBoxMenuItem("Option 1");
        menufile3.add(Option2);

        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new Menu_Example();
    }


}
