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
public class PhieuNhapHang {
    private String maPNH;
    private Date ngayNH;
    private int tongSL;
    private double tongTienNH;
    private String maNV;

    public String getMaPNH() {
        return maPNH;
    }

    public void setMaPNH(String maPNH) {
        this.maPNH = maPNH;
    }

    public Date getNgayNH() {
        return ngayNH;
    }

    public void setNgayNH(Date ngayNH) {
        this.ngayNH = ngayNH;
    }

    public int getTongSL() {
        return tongSL;
    }

    public void setTongSL(int tongSL) {
        this.tongSL = tongSL;
    }

    public double getTongTienNH() {
        return tongTienNH;
    }

    public void setTongTienNH(double tongTienNH) {
        this.tongTienNH = tongTienNH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public PhieuNhapHang(String maPNH, Date ngayNH, int tongSL, double tongTienNH, String maNV) {
        this.maPNH = maPNH;
        this.ngayNH = ngayNH;
        this.tongSL = tongSL;
        this.tongTienNH = tongTienNH;
        this.maNV = maNV;
    }

    public PhieuNhapHang() {
    }
}
