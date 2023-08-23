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
import pojo.PhieuNhapHang;
import pojo.HoaDon;
import dao.HoaDonDAO;

/**
 *
 * @author TSOIS
 */
public class HoaDonDAO {
    public static ArrayList<HoaDon>LayDanhSachHoaDon(){
        ArrayList<HoaDon> dsHD=new ArrayList<HoaDon>();
        String sql = "select * from PHIEU_XUAT_HANG";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString("MAPH_XH"));
                hd.setNgayXuat(rs.getDate("NGAY_XH"));
                hd.setTongSL(rs.getInt("TONGSOLUONG_XH"));
                hd.setTongTien(rs.getDouble("TONGTIEN_XH"));
                hd.setMaKH(rs.getString("MAKH"));
                hd.setMaNV(rs.getString("MANV"));
                dsHD.add(hd);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsHD;
    }
    
    public static boolean themHoaDon(HoaDon hod){
        boolean kq = false;
        String sql = String.format("Insert into PHIEU_XUAT_HANG(MAPH_XH, NGAY_XH, TONGSOLUONG_XH, TONGTIEN_XH, MAKH, MANV) Values('%s', '%s', '%d', '%s', '%s', '%s')", hod.getMaHD(), hod.getNgayXuat(), hod.getTongSL(), hod.getTongTien(), hod.getMaKH(), hod.getMaNV());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n  = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        return kq;
    }
    
}
