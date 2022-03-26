package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerPage extends JFrame implements ActionListener {
    private static JLabel l0;
    private static JButton b1;
    private static JLabel l1;
    private static JButton b2;
    private static JLabel l2;
    private static JButton b3;
    private static JLabel l3;
    private static Icon i1;
    private static Icon i2;
    private static Icon i3;
    private static JButton bl;
    private static JLabel ll;
    private static Icon il;
    ManagerPage(){
//        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("/Users/shashankgoud/Desktop/s3.png")));
//        setLayout(new FlowLayout());
        setTitle("MANAGER 123");
        setSize(1000,800);
        setBounds(400,700,900,900);
        setFont(new Font("Serif", Font.PLAIN,50));
        i1 = new ImageIcon("/Users/shashankgoud/Desktop/icon1.png");
        i2 = new ImageIcon("/Users/shashankgoud/Desktop/icon2.png");
        i3 = new ImageIcon("/Users/shashankgoud/Desktop/icon3.png");
        b1 = new JButton(i1);
        b2 = new JButton(i2);
        b3 = new JButton(i3);
        l0 = new JLabel("Click on the Image");
        l1 = new JLabel("Print Statistics");
        l2 = new JLabel("Print Inventory");
        l3 = new JLabel("Change Price");
        b1.setBounds(100,550,120,100);
        b2.setBounds(350,540,130,120);
        b3.setBounds(600,550,130,120);
        l0.setBounds(100,300,500,100);
        l1.setBounds(100,450,100,100);
        l2.setBounds(350,450,100,100);
        l3.setBounds(600,450,100,100);
        l0.setFont(new Font("Serif", Font.PLAIN,50));

        il = new ImageIcon("/Users/shashankgoud/Desktop/pr1/logout.png");
        bl = new JButton(il);
        ll = new JLabel("Logout");
        bl.setBounds(10,100,50,50);
        ll.setBounds(12,120,100,100);
        bl.addActionListener(this);
        add(bl);
        add(ll);

        add(b1);
        add(l1);
        add(b2);
        add(l2);
        add(b3);
        add(l3);
        add(l0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l0.setVisible(false);
        ll.setVisible(false);
        bl.setVisible(false);
//        setVisible(false);
        JLabel lf = new JLabel("Successfully Logged out");
        lf.setBounds(100,200,3000,200);
        lf.setFont(new Font("Serif", Font.PLAIN,20));
        add(lf);
        lf.setVisible(true);
    }
}
