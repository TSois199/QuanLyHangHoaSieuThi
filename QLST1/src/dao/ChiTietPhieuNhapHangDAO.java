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
import pojo.ChiTietPhieuNhapHang;

/**
 *
 * @author TSOIS
 */
public class ChiTietPhieuNhapHangDAO {
    public static ArrayList<ChiTietPhieuNhapHang>LayDanhSachChiTietPhieuNhapHang(){
        ArrayList<ChiTietPhieuNhapHang>dsCTPNH=new ArrayList<ChiTietPhieuNhapHang>();
        String sql = "select * from CHITIET_NH";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                ChiTietPhieuNhapHang ctpnh = new ChiTietPhieuNhapHang();
                ctpnh.setMaPNH(rs.getString("MAPHIEU_NH"));
                ctpnh.setMaSP(rs.getString("MA_SP"));
                ctpnh.setSoLuong(rs.getInt("SOLUONG"));
                ctpnh.setThanhTien(rs.getDouble("THANHTIEN"));
                dsCTPNH.add(ctpnh);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsCTPNH;
    }
}
