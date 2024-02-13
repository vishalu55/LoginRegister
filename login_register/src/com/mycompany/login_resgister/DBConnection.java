/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login_resgister;
import java.sql.*;
/**
 *
 * @author visha
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connectDB(){
    Connection conn = null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);
    return conn;
    }
    catch(Exception ex){
        System.out.println("Error while connecting to database.");
        return null;
    }
    }
    
}
