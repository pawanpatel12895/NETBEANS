/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqltest;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pawan
 */
public class MysqlTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {   
        
            String databaseName = "dbName";
            String userName = "root";
            String password = "1212";
            String url;
            Connection connection;
            Statement statement;
        System.out.println("Creating database");
        try {
            url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull&autoReconnect=true&useSSL=false";
            connection = DriverManager.getConnection(url,userName, password);
            
            String sql = "CREATE DATABASE " + databaseName;
            
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            System.out.println("\tdone");
        } catch (SQLException ex) {
            System.out.println("Database Exists");
        }
     
        System.out.println("Creating table");
        try{
            url = "jdbc:mysql://localhost:3306/"+databaseName+"?&autoReconnect=true&useSSL=false";
            connection = DriverManager.getConnection(url,userName,password);
            statement = connection.createStatement();
            
            String sql = "CREATE TABLE dummyTable( RANK  INT,NAME VARCHAR(50))";
            statement.executeUpdate(sql);
            statement.close();
            System.out.println("\t done");
        } catch (SQLException ex) {
            System.out.println("Table Exists");
        } 
         
    }
}
