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

/**
 *
 * @author TSOIS
 */
public class PhieuNhapHangDAO {
    public static ArrayList<PhieuNhapHang>LayDanhSachPhieuNhapHang(){
        ArrayList<PhieuNhapHang>dsPNH=new ArrayList<PhieuNhapHang>();
        String sql = "select * from PHIEU_NHAP_HANG";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                PhieuNhapHang pnh = new PhieuNhapHang();
                pnh.setMaPNH(rs.getString("MAPHIEU_NH"));
                pnh.setNgayNH(rs.getDate("NGAY_NH"));
                pnh.setTongSL(rs.getInt("TONGSOLUONG_NH"));
                pnh.setTongTienNH(rs.getDouble("TONGTIEN_NH"));
                pnh.setMaNV(rs.getString("MANV"));
                dsPNH.add(pnh);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPNH;
    }
}
