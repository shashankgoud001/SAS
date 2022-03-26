package javaproject;

import javax.swing.*;
import java.awt.*;

public class BackgroundImage extends JFrame {
    private static JButton b1,b2;
    private static JLabel l1,l2;
    BackgroundImage(){
//        setTitle("Background Color");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("/Users/shashankgoud/Desktop/s.png")));
        setLayout(new FlowLayout());
        l1 = new JLabel("Here is a button");
        b1 = new JButton("Click");
        add(l1);
        add(b1);
        l2 = new JLabel("Second button");
        b2 = new JButton("HALO");
        add(l2);
        add(b2);
        setSize(1300,720);
        setVisible(true);
    }
}

/*
package javaproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
//import javax.swing.JButton;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Main extends JFrame{

    JButton b1;
    JLabel l1;

    public Main(){
        setTitle("Background Color");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        setContentPane(new JLabel(new ImageIcon("/Users/shashankgoud/Desktop/s.png")));
        setLayout(new FlowLayout());
        l1 = new JLabel("Here is a button");
        b1 = new JButton("Click");
        add(l1);
        add(b1);
        setSize(1300,720);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }


}

 */