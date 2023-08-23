/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import pojo.NhanVien;
/**
 *
 * @author Administrator
 */
public class SQLServerDataProvider {
    ArrayList<NhanVien>dsNV=new ArrayList<NhanVien>();
    private Connection connection = null;
    public void open(){
        String strServer="LAPTOP-IRLS8GIA\\SQLEXPRESS";
        String strDatabase="QUANLYKHOHANG";
        String strUser="sa";
        String strPassWord="123";
        try {
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driver);
            String connnectionURL = "jdbc:sqlserver://"+strServer
                +":1433;databaseName="+strDatabase
                +";user="+strUser
                +";password="+strPassWord;
            connection = DriverManager.getConnection(connnectionURL);
            if(connection != null){
                    System.out.println("Kết nối thành công");
                }
                else{
                    System.out.println("Thất bại rồi nha");
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void close(){
        try {
            this.connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ResultSet executeQuery(String sql){
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
        }
        return resultSet;
    }
    public int executeUpdate(String sql){
        int n = -1;
        try {
            Statement sm = connection.createStatement();
            n = sm.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
}
