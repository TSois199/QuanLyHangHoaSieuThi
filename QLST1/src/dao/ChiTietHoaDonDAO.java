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
import pojo.ChiTietPhieuNhapHang;
import pojo.ChiTietHoaDon;

/**
 *
 * @author TSOIS
 */
public class ChiTietHoaDonDAO {
    public static ArrayList<ChiTietHoaDon>LayDanhSachChiTietHoaDon(){
        ArrayList<ChiTietHoaDon>dsCTHD=new ArrayList<ChiTietHoaDon>();
        String sql = "select * from CHITIET_XH";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setMaHD(rs.getString("MAPH_XH"));
                cthd.setMaSP(rs.getString("MA_SP"));
                cthd.setSoLuong(rs.getInt("SOLUONG"));
                cthd.setThanhTien(rs.getString("THANHTIEN"));
                dsCTHD.add(cthd);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsCTHD;
    }
    
    public static boolean themCTHoaDon(ChiTietHoaDon cthd){
        boolean kq = false;
        String sql = String.format("Insert into CHITIET_XH(MAPH_XH, MA_SP, SOLUONG, THANHTIEN) Values('%s', '%s', '%d', '%s')", cthd.getMaHD(), cthd.getMaSP(), cthd.getSoLuong(), cthd.getThanhTien());
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
