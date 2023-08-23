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
import pojo.KhachHang;

/**
 *
 * @author TSOIS
 */
public class KhachHangDAO {
    public static ArrayList<KhachHang>LayDanhSachKhachHang(){
        ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
        String sql = "select * from KHACH_HANG";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMa_KH(rs.getString("MAKH"));
                kh.setTenKH(rs.getString("TEN_KH"));
                kh.setDiaChi(rs.getString("DIACHI_KH"));
                kh.setGioiTinh(rs.getString("GIOITINH_KH"));
                kh.setSDT_KH(rs.getString("SDT_KH"));
                kh.setEmail_KH(rs.getString("EMAIL_KH"));
                dsKH.add(kh);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsKH;
    }
    
    public static boolean themKhachHang(KhachHang kh){
        boolean kq = false;
        String sql = String.format("Insert into KHACH_HANG(MAKH, TEN_KH, DIACHI_KH, GIOITINH_KH, SDT_KH, EMAIL_KH) Values('%s', N'%s', N'%s',  N'%s', '%s', N'%s')", kh.getMa_KH(), kh.getTenKH(), kh.getDiaChi(), kh.getGioiTinh(), kh.getSDT_KH(), kh.getEmail_KH());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean updateKhachHang(KhachHang kh) {
        boolean kq = false;
        String sql = String.format("update KHACH_HANG set TEN_KH=N'%s', DIACHI_KH=N'%s', GIOITINH_KH=N'%s', SDT_KH='%s', EMAIL_KH=N'%s' where MAKH='%s';", kh.getTenKH(), kh.getDiaChi(), kh.getGioiTinh(), kh.getSDT_KH(), kh.getEmail_KH(), kh.getMa_KH());
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        int n = sqlsdp.executeUpdate(sql);
        if (n >= 1) {
            kq = true;
        }
        sqlsdp.close();
        return kq;
    }
    
    public static boolean deleteKhachHang(String maKH) {
        boolean kq = false;
        String sql = String.format("delete KHACH_HANG where MAKH='%s';", maKH);
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        int n = sqlsdp.executeUpdate(sql);
        if (n >= 1) {
            kq = true;
        }
        sqlsdp.close();
        return kq;
    }
    
    public static ArrayList<KhachHang> findKhachHangTheoMa(String maKH) {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        String sql = String.format("select * from KHACH_HANG where MAKH='%s'", maKH);
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        ResultSet resultSet = sqlsdp.executeQuery(sql);
        try {
            while (resultSet.next()) {
                KhachHang kh = new KhachHang();
                kh.setMa_KH(resultSet.getString("MaKH"));
                kh.setTenKH(resultSet.getString("TEN_KH"));
                kh.setDiaChi(resultSet.getString("DIACHI_KH"));
                kh.setGioiTinh(resultSet.getString("GIOITINH_KH"));
                kh.setSDT_KH(resultSet.getString("SDT_KH"));
                kh.setEmail_KH(resultSet.getString("EMAIL_KH"));
                dsKH.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        sqlsdp.close();
        return dsKH;
    }
    
    public static ArrayList<KhachHang> findKhachHangTheoTen(String tenKH) {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        String sql = "select * from KHACH_HANG where TEN_KH like N'%" + tenKH + "%'";
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        ResultSet resultSet = sqlsdp.executeQuery(sql);
        try {
            while (resultSet.next()) {
                KhachHang kh = new KhachHang();
                kh.setMa_KH(resultSet.getString("MaKH"));
                kh.setTenKH(resultSet.getString("TEN_KH"));
                kh.setDiaChi(resultSet.getString("DIACHI_KH"));
                kh.setGioiTinh(resultSet.getString("GIOITINH_KH"));
                kh.setSDT_KH(resultSet.getString("SDT_KH"));
                kh.setEmail_KH(resultSet.getString("EMAIL_KH"));
                dsKH.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        sqlsdp.close();
        return dsKH;
    }
    
    public static boolean CheckMaKH(String maKH) {
        try {
            String sql = "Select * from KHACH_HANG where MAKH = '" + maKH + "'";
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ResultSet rs = ds.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
