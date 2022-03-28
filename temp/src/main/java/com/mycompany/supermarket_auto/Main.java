package com.mycompany.supermarket_auto;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sol";
        String usr = "root";
        String password = "password";
        Connect c = new Connect(url,usr,password);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login l = new Login(c);
                l.setVisible(true);
            }
        });
    }
}
