/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import GUI.ChiTietHoaDon_GUI;
import GUI.HoaDon_GUI;
import GUI.KhachHang_GUI;
import GUI.NCC_GUI;
import GUI.NhanVien_GUI;
import GUI.PhieuNhapHang_GUI;
import GUI.SanPham_GUI;
import GUI.TrangChu_GUI;
import bean.DanhMuc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author Admin
 */
public class ChuyenTrang {
    private JPanel root;
    private String kinSelectd="";
    List<DanhMuc> listItem=null;
    public ChuyenTrang(JPanel jpnRoot) {
        this.root=jpnRoot;
        
    }
    public void setView(JPanel jpnItem,JLabel jlb_Item)
    {
        kinSelectd="TrangChu";
        jpnItem.setBackground(new Color(153,204,255));
        jlb_Item.setBackground(new Color(153,204,255));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChu_GUI());
        root.validate();
        root.repaint();
    }
    public void setEvent(List<DanhMuc> listItem)
    {
        this.listItem=listItem;
        for(DanhMuc item : listItem)
        {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
            private JPanel node;
            private String kind;
            private JPanel jpnItem;
            private JLabel jlbitem;

        public LabelEvent(String kind, JPanel ipnItem, JLabel jlbitem) {
            this.kind = kind;
            this.jpnItem = ipnItem;
            this.jlbitem = jlbitem;
        }
            
            
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
           switch(kind)
           {
               case "TrangChu":
                   node=new TrangChu_GUI();
                   break;
               case "HoaDon":
                   node=new HoaDon_GUI();
                   break;
               case "KhachHang":
                    node=new  KhachHang_GUI();
                    break;
               case"NhanVien":
                     node=new NhanVien_GUI();
                     break;
               case"TaiKhoan":
                     node=new PhieuNhapHang_GUI();
                     break;
               case"SanPham":
                     node=new SanPham_GUI();
                     break;
               default:
                   node=new TrangChu_GUI();
                   break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
           setChangeBackground(kind);
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            kinSelectd=kind;
            jpnItem.setBackground(new Color(153,204,255));
            jlbitem.setBackground(new Color(153,204,255));
            
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            jpnItem.setBackground(new Color(153,204,255));
            jlbitem.setBackground(new Color(153,204,255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
           if(!kinSelectd.equalsIgnoreCase(kind)){
                 jpnItem.setBackground(new Color(255,255,255));
                 jlbitem.setBackground(new Color(255,255,255));
           }
        }
        private void setChangeBackground(String kind)
        {
            for(DanhMuc item:listItem)
            {
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJlb().setBackground(new Color(153,204,255));
                    item.getJpn().setBackground(new Color(153,204,255));
                }
                else
                {
                    item.getJlb().setBackground(new Color(255,255,255));
                    item.getJpn().setBackground(new Color(255,255,255));
                }
            }
        }
        
    }
    
    
   
    
}
