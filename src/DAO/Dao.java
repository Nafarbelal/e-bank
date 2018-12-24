/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hamza
 */
public class Dao {
    private static String pilote="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost/mysql";
    private static String username="root";
    private static String password="";
    private static Connection connection;
    
    
    public Dao(){
        try {
            System.out.println("connection...");
            Class.forName(pilote);
            connection=DriverManager.getConnection(url, username, password);
            System.out.println("every thing is ok *_* !!! ");
        } catch (ClassNotFoundException ex) {
            System.err.println("problem de pilote "+ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("problem de connection  "+ex.getMessage());
        }
    }
}
