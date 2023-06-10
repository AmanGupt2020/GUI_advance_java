package com.company;

import javax.swing.*;

public class POPUP_DEM0 extends JFrame {
    JPopupMenu pm=new JPopupMenu();
    public POPUP_DEM0(){
        pm.add(new JMenuItem("cut"));
        pm.addSeparator();
        pm.add(new JMenuItem("copy"));
        pm.addSeparator();
        pm.add(new JMenuItem("paste"));
        pm.addSeparator();
        add(pm);
        setTitle("Popup menu");
        setSize(300,300);
        setVisible(true);
        pm.show(this,100,100);



    }
    public static void main(String[] args){
        POPUP_DEM0 JFrame=new POPUP_DEM0();
    }
}

