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
import pojo.KhoHang;

/**
 *
 * @author TSOIS
 */
public class KhoHangDAO {
    public static ArrayList<KhoHang>LayDanhSachKhoHang(){
        ArrayList<KhoHang>dsKoH=new ArrayList<KhoHang>();
        String sql = "select * from KHO_HANG";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                KhoHang koh = new KhoHang();
                koh.setMaKho(rs.getString("MAKHO"));
                koh.setTenKho(rs.getString("TENKHO"));
                koh.setDiaChiKho(rs.getString("DIACHI_KHO"));
                koh.setGhiChuKho(rs.getString("GHICHU_KHO"));
                dsKoH.add(koh);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(KhoHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsKoH;
    }
    
    public static boolean themKhoHang(KhoHang koh){
        boolean kq = false;
        String sql = String.format("Insert into KHO_HANG(MAKHO, TENKHO, DIACHI_KHO, GHICHU_KHO) Values('%s', N'%s', N'%s', N'%s')", koh.getMaKho(), koh.getTenKho(), koh.getDiaChiKho(), koh.getGhiChuKho());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean updateKhoHang(KhoHang koh) {
        boolean kq = false;
        String sql = String.format("update KHO_HANG set TENKHO =N'%s', DIACHI_KHO =N'%s', GHICHU_KHO =N'%s' where MAKHO='%s';", koh.getTenKho(), koh.getDiaChiKho(), koh.getGhiChuKho(), koh.getMaKho());
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        int n = sqlsdp.executeUpdate(sql);
        if (n >= 1) {
            kq = true;
        }
        sqlsdp.close();
        return kq;
    }
    
    public static boolean deleteKhoHang(String maKoH) {
        boolean kq = false;
        String sql = String.format("delete KHO_HANG where MAKHO='%s';", maKoH);
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        int n = sqlsdp.executeUpdate(sql);
        if (n >= 1) {
            kq = true;
        }
        sqlsdp.close();
        return kq;
    }
    
    public static boolean CheckMaKho(String maKoH) {
        try {
            String sql = "Select * from KHO_HANG where MAKHO = '" + maKoH + "'";
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ResultSet rs = ds.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
