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
import pojo.LoaiSanPham;

/**
 *
 * @author TSOIS
 */
public class LoaiSanPhamDAO {
    public static ArrayList<LoaiSanPham>LayDanhSachLoaiSanPham(){
        ArrayList<LoaiSanPham>dsLSP=new ArrayList<LoaiSanPham>();
        String sql = "select * from LOAISP";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham();
                lsp.setMaLoai(rs.getString("MALOAI"));
                lsp.setTenLoai(rs.getString("TENLOAI"));
                dsLSP.add(lsp);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsLSP;
    }
    
    public static boolean themLoaiSanPham(LoaiSanPham lsp){
        boolean kq = false;
        String sql = String.format("Insert into LOAISP(MALOAI, TENLOAI) Values('%s', N'%s')", lsp.getMaLoai(), lsp.getTenLoai());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean updateLoaiSanPham(LoaiSanPham lsp) {
        boolean kq = false;
        String sql = String.format("update LOAISP set TENLOAI =N'%s' where MALOAI='%s';", lsp.getTenLoai(), lsp.getMaLoai());
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        int n = sqlsdp.executeUpdate(sql);
        if (n >= 1) {
            kq = true;
        }
        sqlsdp.close();
        return kq;
    }
    
    public static boolean deleteLoaiSanPham(String maLSP) {
        boolean kq = false;
        String sql = String.format("delete LOAISP where MALOAI='%s';", maLSP);
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        int n = sqlsdp.executeUpdate(sql);
        if (n >= 1) {
            kq = true;
        }
        sqlsdp.close();
        return kq;
    }
    
    public static boolean CheckMaLoai(String maLSP) {
        try {
            String sql = "Select * from LOAISP where MALOAI = '" + maLSP + "'";
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ResultSet rs = ds.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
