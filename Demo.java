package com.company;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo(){
        CustomDesktopPane dp=new CustomDesktopPane();
        Container cp=getContentPane();
        cp.add(dp,BorderLayout.CENTER);
        dp.display(dp);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args){
        new Demo();
    }
}
class CustomDesktopPane extends JDesktopPane{
   int  n=5;
   int x=40;int y=40;
   public void display(CustomDesktopPane dp){
       for(int i=0;i<n;i++){
           JInternalFrame jf=new JInternalFrame("JInternal Frame no:"+i,true,true,true,true);
           jf.setBounds(x,y,250,60);
           Container cnt=jf.getContentPane();
           cnt.add(new JLabel("Welcome"));
           dp.add(jf);
           jf.setVisible(true);
           y+=85;
       }
   }

}
