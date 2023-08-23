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
public class SanPham {
    private String maSP;
    private String maNhaCungCap;
    private String tenSP;
    private String ngaySX;
    private String hSD;
    private String soLuongSP;
    private String maLoai;
    private String giaSP;
    private String ghiChuSP;
    private String maKho;
     private String anhSP;

    public String getAnhSP() {
        return anhSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public String gethSD() {
        return hSD;
    }

    public void sethSD(String hSD) {
        this.hSD = hSD;
    }

    public String getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(String soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }

    public String getGhiChuSP() {
        return ghiChuSP;
    }

    public void setGhiChuSP(String ghiChuSP) {
        this.ghiChuSP = ghiChuSP;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public SanPham(String maSP, String maNhaCungCap, String tenSP, String ngaySX, String hSD, String soLuongSP, String maLoai, String giaSP, String ghiChuSP, String maKho) {
        this.maSP = maSP;
        this.maNhaCungCap = maNhaCungCap;
        this.tenSP = tenSP;
        this.ngaySX = ngaySX;
        this.hSD = hSD;
        this.soLuongSP = soLuongSP;
        this.maLoai = maLoai;
        this.giaSP = giaSP;
        this.ghiChuSP = ghiChuSP;
        this.maKho = maKho;
    }

    public SanPham() {
    }
}