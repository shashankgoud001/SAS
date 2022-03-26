package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryManagementOfficer extends JFrame implements ActionListener {
    private static JButton b1;
    private static JLabel l1;
    private static Icon i1;
    private static JButton bl;
    private static JLabel ll;
    private static Icon il;
    InventoryManagementOfficer(){
        //        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Inventory Management Officer 123");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("/Users/shashankgoud/Desktop/s3.png")));
        setSize(1000,1000);
        setBounds(100,100,1000,1000);
        il = new ImageIcon("/Users/shashankgoud/Desktop/pr1/logout.png");
        bl = new JButton(il);
        ll = new JLabel("Logout");
        bl.setBounds(10,100,50,50);
        ll.setBounds(12,120,100,100);
        add(bl);
        add(ll);
        i1 = new ImageIcon("/Users/shashankgoud/Desktop/icon2.png");
        b1 = new JButton(i1);
        l1 = new JLabel("Update Inventory");
        b1.setBounds(100,550,120,130);
        l1.setBounds(150,450,150,100);
        bl.addActionListener(this);
        add(b1);
        add(l1);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b1.setVisible(false);
        l1.setVisible(false);
        bl.setVisible(false);
        ll.setVisible(false);
        JLabel lf = new JLabel("Successfully Logged out");
        lf.setBounds(100,200,3000,200);
        lf.setFont(new Font("Serif", Font.PLAIN,20));
        add(lf);
        lf.setVisible(true);
    }
}
