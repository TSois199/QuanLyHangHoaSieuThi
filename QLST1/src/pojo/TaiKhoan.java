/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Admin
 */
public class TaiKhoan {
    String tK,mK,eMail,quyen,iD;

    public TaiKhoan(String tK, String mK, String eMail, String quyen, String iD) {
        this.tK = tK;
        this.mK = mK;
        this.eMail = eMail;
        this.quyen = quyen;
        this.iD = iD;
    }

    public TaiKhoan() {
    }

    public String gettK() {
        return tK;
    }

    public void settK(String tK) {
        this.tK = tK;
    }

    public String getmK() {
        return mK;
    }

    public void setmK(String mK) {
        this.mK = mK;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
    
}
