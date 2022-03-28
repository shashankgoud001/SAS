package com.mycompany.supermarket_auto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

    private String url;
    private String usr;
    private String password;
    Connect(String url,String usr,String password){
        this.url = url;
        this.usr = usr;
        this.password = password;
    }
    public Statement runConnection(){
        try{
            Connection connection = DriverManager.getConnection(url,usr,password);
            Statement statement = connection.createStatement();
            return statement;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void closeConnection(Statement statement) throws SQLException {
        statement.close();
    }
}
