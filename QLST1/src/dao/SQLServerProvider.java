/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SQLServerProvider {
    private Connection connection;
    public void open() throws SQLException
    {
        String strServer="LAPTOP-IRLS8GIA\\SQLEXPRESS";
        String strDatabase="QUANLYKHOHANG";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connnectionURL = "jdbc:sqlserver://"+strServer+" "
                +":1433;databaseName="+strDatabase
                +";user=sa;password=123";
            connection = DriverManager.getConnection(connnectionURL);
            if(connection != null){
                    System.out.println("ket noi thanh cong");
                }
                else{
                    System.out.println("ket noi that bai");
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void close()
    {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet executeQuery(String sql)
    {
        ResultSet rs=null;
        try {
            Statement statement=connection.createStatement();
            rs=statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public int executeUpdate(String sql)
    {
        int n=-1;
        Statement statement;
        try {
            statement = connection.createStatement();
            n=statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
   
}
