package com.hexaware.connection;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    static Connection con=null;
    static
    {
        try 
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("Driver load...........");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }  
    }
    
    public static Connection getConnection()
    {
        try {
             connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "a");
             System.out.println("Database Connected.........");
          } 
        catch (SQLException e) 
        {
            System.out.println(e);
        } 
        return connect;
    }

}
