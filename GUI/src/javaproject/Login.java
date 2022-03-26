package javaproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

public class Login extends JFrame implements ActionListener  {
    JButton b1;
    JPanel newPanel;
    JLabel userLabel,passwordLabel;
    final JTextField textField1, textField2;

    Login(){
        userLabel = new JLabel();
        userLabel.setText("User Name");

        textField1 = new JTextField(15);

        passwordLabel = new JLabel();
        passwordLabel.setText("Password");

        textField2 = new JPasswordField(15);

        b1 = new JButton("SUBMIT");

        newPanel = new JPanel(new GridLayout(3,1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passwordLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

        add(newPanel, BorderLayout.CENTER);
        b1.addActionListener(this);
        setTitle("Login form");
    }
    public void actionPerformed(ActionEvent e){
        String userValue = textField1.getText();
        String passwordValue = textField2.getText();

        if(userValue.equals("abc@gmail.com")&&passwordValue.equals("abc")){
            NewPage page = new NewPage();
            page.setVisible(true);

            JLabel wel_label = new JLabel("Welcome"+userValue);
            page.getContentPane().add(wel_label);
        }else{
            System.out.println("Please enter correct Username and Password");
        }
    }
}
