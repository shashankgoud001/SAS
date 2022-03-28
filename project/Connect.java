package project;

import java.sql.*;

public class Connect {

    private String url;
    private String usr;
    private String password;
    Connect(String url, String usr, String password){
        this.url = url;
        this.usr = usr;
        this.password = password;
    }
    public Statement getStatement(){
        try{
            Connection connection = DriverManager.getConnection(url,usr,password);
            Statement statement = connection.createStatement();
            return statement;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void closeConnection(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url,usr,password);
        return connection;
    }
}
