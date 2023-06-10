package com.company;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class treeDemo extends JFrame {
    JTree tree;
    public treeDemo(){
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode left=new DefaultMutableTreeNode("Left");
        DefaultMutableTreeNode right=new DefaultMutableTreeNode("Right");
        DefaultMutableTreeNode item1=new DefaultMutableTreeNode("item1");
        DefaultMutableTreeNode item2=new DefaultMutableTreeNode("item2");
        DefaultMutableTreeNode item3=new DefaultMutableTreeNode("item3");
        left.add(item1);
        left.add(item2);
        left.add(item3);
        root.add(left);
        root.add(right);
        tree=new JTree(root);
        add(tree);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500,600);
        setVisible(true);

    }
    public static void main(String[] args){
        new treeDemo();
    }
}
