package javaproject;

//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Temp2 extends JFrame implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
//    private static JLabel welcome;
//    private static JLabel to;
    private static JLabel heading;
    Temp2(){
        setTitle("LOGIN PAGE");
        setSize(1300,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("/Users/shashankgoud/Desktop/s.png")));
        setLayout(new FlowLayout());
        setLayout(null);

//        welcome = new JLabel("WELCOME");
//        welcome.setBounds(100,40,300,200);
//        welcome.setFont(new Font("Serif",Font.PLAIN,50));
//        add(welcome);
//
//        to = new JLabel("TO");
//        to.setBounds(200,100,300,200);
//        to.setFont(new Font("Serif",Font.PLAIN,50));
//        add(to);


        heading = new JLabel("LOGIN PAGE");
        heading.setBounds(100,270,300,200);
        heading.setFont(new Font("Serif",Font.PLAIN,50));
        add(heading);


        userLabel = new JLabel("USER NAME");
        userLabel.setBounds(100,420,80,25);
        add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(200,420,165,25);
        add(userText);

        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBounds(100,450,80,25);
        add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(200,450,165,25);
        add(passwordText);

        button  = new JButton("Login");
        button.setBounds(100,480,80,25);
        button.addActionListener(this);
        add(button);

        success = new JLabel("");
        success.setBounds(200,510,300,25);
        add(success);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
//        System.out.print(user+", "+password);
        if(user.equals("m")&&password.equals("1")){
            success.setText("Login successful!!!");
            ManagerPage mPage = new ManagerPage();
            SalesClerkPage sPage = new SalesClerkPage();
            InventoryManagementOfficer iPage = new InventoryManagementOfficer();
            setVisible(false);
            mPage.setVisible(true);
//            WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
//            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);//closes all windows

            JLabel wLabel = new JLabel("WELCOME"+" MANAGER");
            mPage.getContentPane().add(wLabel);
        }else{
            success.setText("Incorrect Credentials");
        }
    }
}
//package javaproject;
//
//        import javax.swing.JFrame;
//        import javax.swing.JPanel;
//        import javax.swing.JLabel;
//        import javax.swing.JTextField;
//        import javax.swing.JPasswordField;
//        import javax.swing.JButton;
//        import java.awt.event.ActionEvent;
//        import java.awt.event.ActionListener;
//
//public class Login implements ActionListener {
//
//    private static JPanel panel;
//    private static JFrame frame;
//    private static JLabel userLabel;
//    private static JTextField userText;
//    private static JLabel passwordLabel;
//    private static JPasswordField passwordText;
//    private static JButton button;
//    private static JLabel success;
//
//    Login(){
//        panel = new JPanel();
//        frame = new JFrame();
//        frame.setSize(500,500);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(panel);
//
//        panel.setLayout(null);
//
//        userLabel = new JLabel("USER NAME");
//        userLabel.setBounds(10,20,80,25);
//        panel.add(userLabel);
//
//        userText = new JTextField(20);
//        userText.setBounds(100,20,165,25);
//        panel.add(userText);
//
//        passwordLabel = new JLabel("PASSWORD");
//        passwordLabel.setBounds(10,50,80,25);
//        panel.add(passwordLabel);
//
//        passwordText = new JPasswordField();
//        passwordText.setBounds(100,50,165,25);
//        panel.add(passwordText);
//
//        button  = new JButton("Login");
//        button.setBounds(10,80,80,25);
//        button.addActionListener(new Login());
//        panel.add(button);
//
//        success = new JLabel("");
//        success.setBounds(10,110,300,25);
//        panel.add(success);
//
//        frame.setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String user = userText.getText();
//        String password = passwordText.getText();
//        System.out.print(user+", "+password);
//        if(user.equals("Escanor")&&password.equals("123")){
//            success.setText("Login successful!!!");
//        }else{
//            success.setText("");
//        }
//    }
//}
