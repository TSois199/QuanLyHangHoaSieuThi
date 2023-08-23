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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pojo.TaiKhoan;
import pojo.TaiKhoan;

/**
 *
 * @author Admin
 */
public class Tai_KhoanDao {
    
    public static ArrayList<TaiKhoan> layDanhSachTaiKhoan(){
        ArrayList<TaiKhoan> dsPB=new ArrayList<TaiKhoan>();
       
       
        try {
            String sql="select*from TAI_KHOAN";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
             ResultSet resultSet=provider.executeQuery(sql);
             while(resultSet.next())
             {
                 TaiKhoan tk= new TaiKhoan();
                 tk.settK(resultSet.getString("TK"));
                 tk.setQuyen(resultSet.getString(("QUYEN")));
                 dsPB.add(tk);
                
             }
              provider.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dsPB;
        
    }
      public static boolean KT_DangNhap(String ma,String mk)
    {
  
     
        try {
             String selectMa="select * from TAI_KHOAN where TK='"+ma+"'and MK='"+mk+"'";
             SQLServerProvider provider =new SQLServerProvider();
            provider.open();
            ResultSet rs= provider.executeQuery(selectMa);
            if(rs.next())
            {
                provider.close();
                return true;
            }
              provider.close();
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return false;
        
    }

     public static boolean KT_TrungMa(String ma)
    {
  
     
        try {
             String selectMa="select * from TAI_KHOAN where TK='"+ma+"'";
             SQLServerProvider provider =new SQLServerProvider();
            provider.open();
            ResultSet rs= provider.executeQuery(selectMa);
            if(rs.next())
            {
                provider.close();
                return true;
            }
              provider.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
        
    }
     public static class EmailExample {
	private static Pattern pattern;
	private Matcher matcher;
	private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
	public EmailExample() {
		pattern = Pattern.compile(EMAIL_REGEX);
	}
	public boolean validate(String regex) {
		matcher = pattern.matcher(regex);
		return matcher.matches();
	}
       }   
     public static boolean EmailExampleTest(String email)
             {
	
		EmailExample emailExample = new EmailExample();
	
			boolean isvalid = emailExample.validate(email);
			System.out.println("Email is " + email +" is valid: "+ isvalid);
                        
                             return isvalid;
                }       
    public static boolean ThemTaiKhoan(TaiKhoan tk)
    {   
 
        boolean kq=false;
        
        try {
            String sql="insert into TAI_KHOAN values('"+tk.gettK()+"','"+tk.getmK()+"','"+tk.geteMail()+"','client',NULL)";
            SQLServerProvider provider= new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1)
                kq=true;
             provider.close();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        return kq;
    }
  
}
