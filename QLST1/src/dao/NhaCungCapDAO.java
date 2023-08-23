/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.NhaCungCap;
/**
 *
 * @author TSOIS
 */
public class NhaCungCapDAO {
    public static ArrayList<NhaCungCap>LayDanhSachNhaCungCap(){
        ArrayList<NhaCungCap>dsNCC=new ArrayList<NhaCungCap>();
        String sql = "select * from NHA_CUNG_CAP";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMaNhaCungCap(rs.getString("MA_NCC"));
                ncc.setTenNhaCungCap(rs.getString("TEN_NCC"));
                ncc.setDiaChiNhaCungCap(rs.getString("DIACHI_NCC"));
                dsNCC.add(ncc);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNCC;
    }
    
    public static boolean themNhaCungCap(NhaCungCap ncc){
        boolean kq = false;
        String sql = String.format("Insert into NHA_CUNG_CAP(MA_NCC, TEN_NCC, DIACHI_NCC) Values('%s', N'%s', N'%s')", ncc.getMaNhaCungCap(), ncc.getTenNhaCungCap(), ncc.getDiaChiNhaCungCap());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    
    
    public static ArrayList<NhaCungCap> findNhaCungCapTheoTenNCC(String tenNCC) {
        ArrayList<NhaCungCap> dsNCC = new ArrayList<NhaCungCap>();
        String sql = "select * from NHA_CUNG_CAP where TEN_NCC like N'%" + tenNCC + "%'";
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        ResultSet resultSet = sqlsdp.executeQuery(sql);
        try {
            while (resultSet.next()) {
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMaNhaCungCap(resultSet.getString("MA_NCC"));
                ncc.setTenNhaCungCap(resultSet.getString("TEN_NCC"));
                ncc.setDiaChiNhaCungCap(resultSet.getString("DIACHI_NCC"));
                dsNCC.add(ncc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        sqlsdp.close();
        return dsNCC;
    }
    
    public static boolean updateNhaCungCap(NhaCungCap ncc) {
        boolean kq = false;
        String sql = String.format("update NHA_CUNG_CAP set TEN_NCC=N'%s', DIACHI_NCC=N'%s' where MA_NCC='%s';", ncc.getTenNhaCungCap(), ncc.getDiaChiNhaCungCap(), ncc.getMaNhaCungCap());
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        int n = sqlsdp.executeUpdate(sql);
        if (n >= 1) {
            kq = true;
        }
        sqlsdp.close();
        return kq;
    }
    
   public static boolean deleteNhaCungCap(String maNCC) {
        boolean kq = false;
        String sql = String.format("delete NHA_CUNG_CAP where MA_NCC='%s';", maNCC);
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        int n = sqlsdp.executeUpdate(sql);
        if (n >= 1) {
            kq = true;
        }
        sqlsdp.close();
        return kq;
    }
   
   public static boolean CheckMaNCC(String maNCC) {
        try {
            String sql = "Select * from NHA_CUNG_CAP where MA_NCC = '" + maNCC + "'";
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ResultSet rs = ds.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
