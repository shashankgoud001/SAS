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

public class Temp extends JFrame implements ActionListener {
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    Temp(){
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(1300,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel.setLayout(new BorderLayout());
        frame.setContentPane(new JLabel(new ImageIcon("/Users/shashankgoud/Desktop/s.png")));
        panel.setLayout(new FlowLayout());

        userLabel = new JLabel("USER NAME");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button  = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(this);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.print(user+", "+password);
        if(user.equals("Escanor")&&password.equals("123")){
            success.setText("Login successful!!!");
        }else{
            success.setText("");
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
