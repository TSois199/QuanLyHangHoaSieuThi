/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author TSOIS
 */
public class KhachHang {
    private String ma_KH;
    private String tenKH;
    private String diaChi;
    private String gioiTinh;
    private String SDT_KH;
    private String Email_KH;

    public KhachHang() {
    }

    public KhachHang(String ma_KH, String tenKH, String diaChi, String gioiTinh, String SDT_KH, String Email_KH) {
        this.ma_KH = ma_KH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.SDT_KH = SDT_KH;
        this.Email_KH = Email_KH;
    }

    public String getMa_KH() {
        return ma_KH;
    }

    public void setMa_KH(String ma_KH) {
        this.ma_KH = ma_KH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSDT_KH() {
        return SDT_KH;
    }

    public void setSDT_KH(String SDT_KH) {
        this.SDT_KH = SDT_KH;
    }

    public String getEmail_KH() {
        return Email_KH;
    }

    public void setEmail_KH(String Email_KH) {
        this.Email_KH = Email_KH;
    }
}
