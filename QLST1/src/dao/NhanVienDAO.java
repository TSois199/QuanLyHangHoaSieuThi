/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.NhanVien;
import GUI.NhanVien_GUI;
/**
 *
 * @author TSOIS
 */
public class NhanVienDAO {
    public static ArrayList<NhanVien>LayDanhSachNhanVien(){
        ArrayList<NhanVien>dsNV=new ArrayList<NhanVien>();
        String sql = "select * from NHAN_VIEN";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNV"));
                nv.setTenNhanVien(rs.getString("TEN_NV"));
                nv.setEmailNhanVien(rs.getString("EMAIL_NV"));
                nv.setGioiTinh(rs.getString("GIOITINH_NV"));
                nv.setSDT(rs.getString("SDT_NV"));
                /*nv.setAnhNV(rs.getString("CHUCVU_NV"));*/
                //nv.setAnhNV(rs.getString("CHUCVU_NV"));
                nv.setDiaChi(rs.getString("DIACHI_NV"));
                dsNV.add(nv);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNV;
    }
    /*public static ArrayList<NhanVien> TimKiemNVTheoTen(String tenNV){
        ArrayList<NhanVien>dsPB=new ArrayList<NhanVien>();
        String sql = "select * from NhanVien where TenNV like '%"+tenNV+"%'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNV"));
                nv.setTenNhanVien(rs.getString("TenNV"));
                nv.setGioiTinh(rs.getString("GTinh"));
                nv.setSDT(rs.getInt("SoDienThoai"));
                nv.setCCCD(rs.getInt("So_CCCD"));
                nv.setDiaChi(rs.getString("DiaChiNha"));
                nv.setChucVu(rs.getString("Cvu_CongViec"));
                nv.setMatKhau(rs.getString("MatKhau_Login"));
                dsPB.add(nv);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPB;
    }*/
    
    public static boolean themNhanVien(NhanVien nv){
        boolean kq = false;
        String sql = String.format("Insert into NHAN_VIEN(MANV, TEN_NV, EMAIL_NV, GIOITINH_NV, SDT_NV, DIACHI_NV) Values('%s', N'%s', N'%s', N'%s', '%s', N'%s')", nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getEmailNhanVien(), nv.getGioiTinh(), nv.getSDT(), nv.getDiaChi());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean xoaNhanVien(String maNV){
        boolean kq = false;
        String sql = String.format("Delete from NHAN_VIEN where MANV='%s'",maNV);
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean capNhatNhanVien(NhanVien nv){
        boolean kq = false;
        String sql = String.format("Update NHAN_VIEN set TEN_NV =N'%s', EMAIL_NV='%s', GIOITINH_NV=N'%s', SDT_NV = '%s', DIACHI_NV =N'%s'"
                + "where MANV='%s'", nv.getTenNhanVien(),nv.getEmailNhanVien(),nv.getGioiTinh(),nv.getSDT(),nv.getDiaChi(),nv.getMaNhanVien());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    /*public static NhanVien layNhanVien(String maNV){
       NhanVien nv= null;
        try {
            String sql = "Select * from NhanVien where MaNhanVien = "+maNV;
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet rs   = provider.executeQuery(sql);
            if(rs.next()){
                nv =new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNV"));
                nv.setTenNhanVien(rs.getString("TenNV"));
                nv.setGioiTinh(rs.getString("GTinh"));
                nv.setSDT(rs.getInt("SoDienThoai"));
                nv.setCCCD(rs.getInt("So_CCCD"));
                nv.setDiaChi(rs.getString("DiaChiNha"));
                nv.setChucVu(rs.getString("Cvu_CongViec"));
                nv.setMatKhau(rs.getString("MatKhau_Login"));
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }*/
    
    public static boolean CheckMaNhanVien(String maNV) {
        try {
            String sql = "Select * from NHAN_VIEN where MANV = '" + maNV + "'";
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ResultSet rs = ds.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
