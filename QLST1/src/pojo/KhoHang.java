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
public class KhoHang {
    private String maKho;
    private String tenKho;
    private String diaChiKho;
    private String ghiChuKho;

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    public String getDiaChiKho() {
        return diaChiKho;
    }

    public void setDiaChiKho(String diaChiKho) {
        this.diaChiKho = diaChiKho;
    }

    public String getGhiChuKho() {
        return ghiChuKho;
    }

    public void setGhiChuKho(String ghiChuKho) {
        this.ghiChuKho = ghiChuKho;
    }

    public KhoHang(String maKho, String tenKho, String diaChiKho, String ghiChuKho) {
        this.maKho = maKho;
        this.tenKho = tenKho;
        this.diaChiKho = diaChiKho;
        this.ghiChuKho = ghiChuKho;
    }

    public KhoHang() {
    }
}
