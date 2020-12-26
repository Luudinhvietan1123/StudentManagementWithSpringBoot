package com.example.Model.Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExample {
    public void getExampleConnection(){
        Statement statement = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=123123;");
            System.out.println("Connected to database !");
        }
        catch(SQLException sqle) {
            System.out.println("Sql Exception :"+sqle.getMessage());
        }
        catch(ClassNotFoundException e) {
            System.out.println("Class Not Found Exception :" + e.getMessage());
        }
    }
}
