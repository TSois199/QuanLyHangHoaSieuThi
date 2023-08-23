/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import pojo.NhanVien;

/**
 *
 * @author TSOIS
 */
public class ThongTinCaNhanDAO {
    public static NhanVien layNhanVien(String maNV){
       NhanVien nv= null;
        try {
            String sql = "Select * from NHAN_VIEN where MANV = "+maNV;
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet rs   = provider.executeQuery(sql);
            if(rs.next()){
                nv =new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNV"));
                nv.setTenNhanVien(rs.getString("TEN_NV"));
                nv.setEmailNhanVien(rs.getString("EMAIL_NV"));
                nv.setGioiTinh(rs.getString("SDT_NV"));
                nv.setSDT(rs.getString("SDT_NV"));
                nv.setDiaChi(rs.getString("DIACHI_NV"));
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }
}
