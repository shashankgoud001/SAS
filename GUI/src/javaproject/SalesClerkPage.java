package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesClerkPage extends JFrame implements ActionListener {
    private static JLabel l1;
    private static JLabel l2;
    private static JButton b1;
    private static JButton b2;
    private static Icon i1;
    private static Icon i2;
    private static JButton bl;
    private static JLabel ll;
    private static Icon il;
    SalesClerkPage(){
        //        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sales Clerk 123");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("/Users/shashankgoud/Desktop/s3.png")));
        setSize(1000,1000);
        setBounds(100,100,1000,1000);
        i1 = new ImageIcon("/Users/shashankgoud/Desktop/pr1/i1.png");
        i2 = new ImageIcon("/Users/shashankgoud/Desktop/pr1/i2.png");
        b1 = new JButton(i1);
        b2 = new JButton(i2);
        l1 = new JLabel("Print Bill");
        l2 = new JLabel("Sales Transaction");
        b1.setBounds(100,550,120,130);
        b2.setBounds(350,540,130,120);
        l1.setBounds(150,450,100,100);
        l2.setBounds(350,450,200,100);

        il = new ImageIcon("/Users/shashankgoud/Desktop/pr1/logout.png");
        bl = new JButton(il);
        ll = new JLabel("Logout");
        bl.setBounds(10,100,50,50);
        ll.setBounds(12,120,100,100);
        bl.addActionListener(this);
        add(bl);
        add(ll);

        add(b1);
        add(b2);
        add(l1);
        add(l2);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l1.setVisible(false);
        l2.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        ll.setVisible(false);
        bl.setVisible(false);
        JLabel lf = new JLabel("Successfully Logged out");
        lf.setBounds(100,200,3000,200);
        lf.setFont(new Font("Serif", Font.PLAIN,20));
        add(lf);
        lf.setVisible(true);
    }
}
