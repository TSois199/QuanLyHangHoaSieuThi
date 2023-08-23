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
import pojo.KhachHang;
import pojo.SanPham;

/**
 *
 * @author TSOIS
 */
public class SanPhamDAO {
    public static ArrayList<SanPham>LayDanhSachSanPham(){
        ArrayList<SanPham>dsSP=new ArrayList<SanPham>();
        String sql = "select * from SAN_PHAM";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MA_SP"));
                sp.setMaNhaCungCap(rs.getString("MA_NCC"));
                sp.setTenSP(rs.getString("TEN_SP"));
                sp.setNgaySX(rs.getString("NGAYSX"));
                sp.sethSD(rs.getString("HSD"));
                sp.setSoLuongSP(rs.getString("SOLUONG_SP"));
                sp.setMaLoai(rs.getString("MALOAI"));
                sp.setGiaSP(rs.getString("GIA"));
                sp.setGhiChuSP(rs.getString("GHICHU_SP"));
                sp.setMaKho(rs.getString("MAKHO"));
                sp.setAnhSP(rs.getString("ANH"));
                dsSP.add(sp);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsSP;
    }
    
    public static boolean themSanPham(SanPham sp){
        boolean kq = false;
        String sql = String.format("Insert into SAN_PHAM(MA_SP, MA_NCC, TEN_SP, NGAYSX, HSD, SOLUONG_SP, MALOAI, GIA, GHICHU_SP, MAKHO) Values('%s', '%s', N'%s', '%s', '%s', '%s', '%s', '%s', N'%s', '%s')", sp.getMaSP(), sp.getMaNhaCungCap(), sp.getTenSP(), sp.getNgaySX(), sp.gethSD(), sp.getSoLuongSP(), sp.getMaLoai(), sp.getGiaSP(), sp.getGhiChuSP(), sp.getMaKho());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean CheckMaSanPham(String maSP) {
        try {
            String sql = "Select * from SAN_PHAM where MA_SP = '" + maSP + "'";
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
    
    public static boolean capNhatSanPham(SanPham sp){
        boolean kq = false;
        String sql = String.format("Update SAN_PHAM set TEN_SP =N'%s', NGAYSX='%s', HSD='%s', SOLUONG_SP = '%s', MALOAI  = '%s', GIA = '%s' , GHICHU_SP = N'%s', MAKHO = '%s'"
                + "where MA_SP='%s'", sp.getTenSP(),sp.getNgaySX(),sp.gethSD(),sp.getSoLuongSP(),sp.getMaLoai(),sp.getGiaSP(),sp.getGhiChuSP(),sp.getMaKho(),sp.getMaSP());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean xoaSanPham(String maSP){
        boolean kq = false;
        String sql = String.format("Delete from SAN_PHAM where MA_SP='%s'",maSP);
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static ArrayList<SanPham> findSanPhamTheoMa(String maSP) {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        String sql = String.format("select * from SAN_PHAM where MA_SP='%s'", maSP);
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        ResultSet resultSet = sqlsdp.executeQuery(sql);
        try {
            while (resultSet.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(resultSet.getString("MA_SP"));
                sp.setMaNhaCungCap(resultSet.getString("MA_NCC"));
                sp.setTenSP(resultSet.getString("TEN_SP"));
                sp.setNgaySX(resultSet.getString("NGAYSX"));
                sp.sethSD(resultSet.getString("HSD"));
                sp.setSoLuongSP(resultSet.getString("SOLUONG_SP"));
                sp.setMaLoai(resultSet.getString("MALOAI"));
                sp.setGiaSP(resultSet.getString("GIA"));
                sp.setGhiChuSP(resultSet.getString("GHICHU_SP"));
                sp.setMaKho(resultSet.getString("MAKHO"));
                dsSP.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        sqlsdp.close();
        return dsSP;
    }
    
    public static ArrayList<SanPham> findSanPhamTheoTen(String tenSP) {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        String sql = "select * from SAN_PHAM where TEN_SP like N'%" + tenSP + "%'";
        SQLServerDataProvider sqlsdp = new SQLServerDataProvider();
        sqlsdp.open();
        ResultSet resultSet = sqlsdp.executeQuery(sql);
        try {
            while (resultSet.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(resultSet.getString("MA_SP"));
                sp.setMaNhaCungCap(resultSet.getString("MA_NCC"));
                sp.setTenSP(resultSet.getString("TEN_SP"));
                sp.setNgaySX(resultSet.getString("NGAYSX"));
                sp.sethSD(resultSet.getString("HSD"));
                sp.setSoLuongSP(resultSet.getString("SOLUONG_SP"));
                sp.setMaLoai(resultSet.getString("MALOAI"));
                sp.setGiaSP(resultSet.getString("GIA"));
                sp.setGhiChuSP(resultSet.getString("GHICHU_SP"));
                sp.setMaKho(resultSet.getString("MAKHO"));
                dsSP.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        sqlsdp.close();
        return dsSP;
    }
    
}
