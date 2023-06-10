package com.company;
import javax.swing.*;
/*public class swing1 extends JFrame{
    swing1(){
        JButton b=new JButton("click me");
        b.setBounds(20,80,80,30);
        add(b);
        setSize(300,300);
        setTitle("swing");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new swing1();
    }

}*/
public class  swing1 {
    swing1() {
        JFrame f = new JFrame();
        JLabel l = new JLabel("password");
        JPasswordField p = new JPasswordField();
        f.add(l);
        f.add(p);
        l.setBounds(20, 80, 80, 30);
        p.setBounds(120, 80, 80, 30);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new swing1();
    }
}
