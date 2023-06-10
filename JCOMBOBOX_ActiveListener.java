package com.company;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class JCOMBOBOX_ActiveListener  {

    JFrame f;


    JCOMBOBOX_ActiveListener(){
        f=new JFrame("combo box example");




        final JLabel label= new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);

        JButton b = new JButton(" Show");
        b.setBounds(200,100,75,20);
        String lang[]={"C","C++","Ca","JAVA","PHP"};
        final JComboBox cb=new JComboBox(lang);
        cb.setBounds(50,100,90,20);

        f.add(cb);
        f.add(label);
        f.add(b);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,350);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="Programming language selected";
                cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });

    }
    public static void main(String[] args) {
        new JCOMBOBOX_ActiveListener();
    }
}
