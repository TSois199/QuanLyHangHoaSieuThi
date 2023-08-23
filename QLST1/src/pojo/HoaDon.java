/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;

/**
 *
 * @author TSOIS
 */
public class HoaDon {
    private String maHD;
    private Date ngayXuat;
    private int tongSL;
    private double tongTien;
    private String maKH;
    private String maNV;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public int getTongSL() {
        return tongSL;
    }

    public void setTongSL(int tongSL) {
        this.tongSL = tongSL;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public HoaDon(String maHD, Date ngayXuat, int tongSL, double tongTien, String maKH, String maNV) {
        this.maHD = maHD;
        this.ngayXuat = ngayXuat;
        this.tongSL = tongSL;
        this.tongTien = tongTien;
        this.maKH = maKH;
        this.maNV = maNV;
    }

    public HoaDon() {
    }
}
