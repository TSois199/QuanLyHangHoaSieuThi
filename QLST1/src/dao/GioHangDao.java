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
import pojo.GioHang;

/**
 *
 * @author Admin
 */
public class GioHangDao {
        public static ArrayList<GioHang>LayDanhSachGioHang(){
        ArrayList<GioHang>dsGH=new ArrayList<GioHang>();
        String sql = "select * from GIO_HANG";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        try {
            while (rs.next()) {
                GioHang gh= new GioHang();
                gh.setMaSP(rs.getString("TenSP"));
                gh.setMaKH(rs.getString("MAKH"));
                gh.setSl(rs.getInt("SOLUONG"));
                gh.setLoaiSP(rs.getString("LoaiSP"));
                dsGH.add(gh);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsGH;
    }
        public static boolean ThemGiHang(GioHang gh)
    {   
 
        boolean kq=false;
        
        String sql="insert into GIO_HANG values('N"+gh.getMaSP()+"','"+gh.getMaKH()+"',"+gh.getSl()+",'"+gh.getLoaiSP()+"')";
        SQLServerDataProvider provider= new SQLServerDataProvider();
        provider.open();
        int n=provider.executeUpdate(sql);
        if(n==1)
            kq=true;
        provider.close();
        
        return kq;
    }
    
}
