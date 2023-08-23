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
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String EmailNhanVien;
    private String GioiTinh;
    private String SDT;
    private String DiaChi;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getEmailNhanVien() {
        return EmailNhanVien;
    }

    public void setEmailNhanVien(String EmailNhanVien) {
        this.EmailNhanVien = EmailNhanVien;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String EmailNhanVien, String GioiTinh, String SDT, String DiaChi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.EmailNhanVien = EmailNhanVien;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public NhanVien() {
    }
}
