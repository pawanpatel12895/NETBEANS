/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsytem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pawan
 */
public class LibraryManagementSytem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        initDatabases();
        homeFrame home = new homeFrame();
    }

    private static void initDatabases() 
    {
        String databaseName = "LibraryDatabase";
        String userName = "root";
        String password = "1212";
        String url;
        Connection connection;
        Statement statement = null;
    
        System.out.println("Creating database");
        try {
            url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull&autoReconnect=true&useSSL=false";
            connection = DriverManager.getConnection(url,userName, password);
        
            String sql = "CREATE DATABASE " + databaseName;
        
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            System.out.println("\tdatabase created");
        } catch (SQLException ex) {
            System.out.println("\tDatabase Exists");
        }
    
        try{
            url = "jdbc:mysql://localhost:3306/"+databaseName+"?&autoReconnect=true&useSSL=false";
            connection = DriverManager.getConnection(url,userName,password);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println("Databae Exists but cant be accessed");
            System.exit(-1);
        }
        System.out.println("Creating tables");
        try{
            String sql = "CREATE TABLE BookInventoryDatabase( name varchar(100)"
                                                        + ", author varchar(100)"
                                                        + ", id INT"
                                                        + ", discription varchar(200)"
                                                        + ")";
            statement.executeUpdate(sql);
            statement.close();
            System.out.println("\tTable BookInventoryDatabase Created");
        } catch (SQLException ex) {
            System.out.println("\tTable BookInventoryDatabase Exists");
        }
    }
}