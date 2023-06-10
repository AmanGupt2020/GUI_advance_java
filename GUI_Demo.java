package com.company;
import java.awt.*;
//gui through inheritance
/* public class GUI_Demo extends Frame{
    GUI_Demo(){
        Button b=new Button("Click");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("AWT");
        setVisible(true);


    }
    public static void main(String args[]){
        GUI_Demo g=new GUI_Demo();
    }




}*/
// gui through frame
public class GUI_Demo{
    GUI_Demo(){
        Frame f=new Frame();
        Label l=new Label("raam navami");
        Button b=new Button("SUBMIT");
        TextField t= new TextField();
        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);
        f.add(b);
        f.add(l);
        f.add(t);
        f.setSize(300,300);
        f.setTitle("emp info");
        f.setVisible(true);

    }
    public static void main(String args[]){
        GUI_Demo g=new GUI_Demo();
    }
}
