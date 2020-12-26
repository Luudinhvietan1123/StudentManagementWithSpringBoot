package com.example.Model.Entities;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlServerConnection {

    //Singleton
    private static Connection instanceConnection;

    private MySqlServerConnection(){}

    public static synchronized Connection getInstanceConnection(){
        if(instanceConnection == null){
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                instanceConnection = DriverManager
                        .getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=123123;");
            }catch (Exception e){
            }
        }
        return instanceConnection;
    }

}
