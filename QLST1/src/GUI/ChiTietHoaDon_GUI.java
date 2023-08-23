/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import dao.ChiTietHoaDonDAO;
import dao.ChiTietPhieuNhapHangDAO;
import dao.HoaDonDAO;
import dao.SanPhamDAO;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import pojo.ChiTietHoaDon;
import pojo.ChiTietPhieuNhapHang;
import pojo.HoaDon;
import pojo.MyCombobox;
import pojo.SanPham;

/**
 *
 * @author TSOIS
 */
public class ChiTietHoaDon_GUI extends javax.swing.JFrame {

    
    DefaultComboBoxModel sp;
    /**
     * Creates new form ChiTietHoaDon_GUI
     */
    public ChiTietHoaDon_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Chi Tiết Hóa Đơn");
        hienthi();
        hienthiHD();
        loadSanPham();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_return = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_soluong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_thanhtien = new javax.swing.JTextField();
        txt_mahd = new javax.swing.JTextField();
        txt_masp = new javax.swing.JTextField();
        cbb_masp = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_DanhSachHoaDon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DanhSachCTHD = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_return.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return_icon.png"))); // NOI18N
        btn_return.setText("Trở về");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin Chi Tiết Phiếu Nhập Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Mã Hóa Đơn:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Mã sản phẩm:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Số lượng:");

        txt_soluong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Thành tiền:");

        txt_thanhtien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        txt_mahd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        txt_masp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        cbb_masp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbb_masp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_maspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbb_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_thanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbb_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_thanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Các chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        btn_them.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_icon.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_icon.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tb_DanhSachHoaDon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tb_DanhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_DanhSachHoaDon.setGridColor(new java.awt.Color(0, 0, 0));
        tb_DanhSachHoaDon.setRowHeight(40);
        tb_DanhSachHoaDon.setRowMargin(5);
        tb_DanhSachHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DanhSachHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_DanhSachHoaDon);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách Chi Tiết Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tb_DanhSachCTHD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tb_DanhSachCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_DanhSachCTHD.setGridColor(new java.awt.Color(0, 0, 0));
        tb_DanhSachCTHD.setRowHeight(40);
        tb_DanhSachCTHD.setRowMargin(5);
        tb_DanhSachCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DanhSachCTHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_DanhSachCTHD);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CHI TIẾT PHIẾU HÓA ĐƠN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_return)
                .addGap(278, 278, 278)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_return)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_returnActionPerformed

    private void cbb_maspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_maspActionPerformed
        // TODO add your handling code here:
        MyCombobox chon = (MyCombobox) sp.getSelectedItem();
        String maSP = chon.MaString();
        txt_masp.setText(maSP);
    }//GEN-LAST:event_cbb_maspActionPerformed

    private void theater(){
        JTableHeader thead = tb_DanhSachCTHD.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        TableColumn col1 = tb_DanhSachCTHD.getColumnModel().getColumn(0);
        col1.setPreferredWidth(100);
        TableColumn col2 = tb_DanhSachCTHD.getColumnModel().getColumn(1);
        col2.setPreferredWidth(100);
        TableColumn col3 = tb_DanhSachCTHD.getColumnModel().getColumn(2);
        col3.setPreferredWidth(100);
        TableColumn col4 = tb_DanhSachCTHD.getColumnModel().getColumn(3);
        col4.setPreferredWidth(100);
    }
    
    private void theater1(){
        JTableHeader thead = tb_DanhSachHoaDon.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        TableColumn col1 = tb_DanhSachHoaDon.getColumnModel().getColumn(0);
        col1.setPreferredWidth(100);
        TableColumn col2 = tb_DanhSachHoaDon.getColumnModel().getColumn(1);
        col2.setPreferredWidth(100);
        TableColumn col3 = tb_DanhSachHoaDon.getColumnModel().getColumn(2);
        col3.setPreferredWidth(100);
        TableColumn col4 = tb_DanhSachHoaDon.getColumnModel().getColumn(3);
        col4.setPreferredWidth(100);
    }
    
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        String maHD = txt_mahd.getText();
        String maSP = txt_masp.getText();
        int soLuong = Integer.valueOf(txt_soluong.getText());
        String thanhTien = txt_thanhtien.getText();
        if(txt_mahd.getText().isEmpty()||txt_masp.getText().isEmpty()||txt_soluong.getText().isEmpty()||txt_thanhtien.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Không Được Để Trống Thông Tin","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
            ChiTietHoaDon cthd = new ChiTietHoaDon();
            cthd.setMaHD(maHD);
            cthd.setMaSP(maSP);
            cthd.setSoLuong(soLuong);
            cthd.setThanhTien(thanhTien);
            ChiTietHoaDonDAO.themCTHoaDon(cthd);
            hienthi();
            JOptionPane.showMessageDialog(this,"Thêm Nhà Cung Cấp Thành Công","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        /*try {
            NhaCungCap ncc = new NhaCungCap();
            String maNCC = txt_mapnh.getText();
            boolean n = NhaCungCapDAO.deleteNhaCungCap(maNCC);
            if (n == true) {
                JOptionPane.showMessageDialog(this, "Xóa " + maNCC + " Thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Xóa " + maNCC + " Thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xung đột khóa ngoại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } finally {
            hienthi();
        }*/
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        /*try {
            NhaCungCap ncc = new NhaCungCap();
            ncc.setTenNhaCungCap(txt_tenncc.getText());
            ncc.setMaNhaCungCap(txt_diachincc.getText());
            ncc.setDiaChiNhaCungCap(txt_mancc.getText());
            boolean n = NhaCungCapDAO.updateNhaCungCap(ncc);
            if (n == true) {
                JOptionPane.showMessageDialog(this, "Sửa Nhà Cung Cấp" + txt_mancc.getText() + " Thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa Nhà Cung Cấp " + txt_mancc.getText() + " Thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sửa thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } finally {
            hienthi();
        }*/

        /*try {
            NhaCungCap ncc = new NhaCungCap();
            ncc.setTenNhaCungCap(txt_tenncc.getText());
            ncc.setDiaChiNhaCungCap(txt_tongsl.getText());
            ncc.setMaNhaCungCap(txt_mapnh.getText());
            boolean n = NhaCungCapDAO.updateNhaCungCap(ncc);
            int row = tb_DanhSachPNH.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Chọn Dòng Cần Sửa ");
                return;
            } else {
                if (n == true) {
                    JOptionPane.showMessageDialog(this, "Sửa Nhà Cung Cấp\t "  + txt_mapnh.getText() + " Thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa Nhà Cung Cấp\t "  + txt_mapnh.getText() + " Thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sửa Kho Hàng thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } finally {
            hienthi();
        }*/
    }//GEN-LAST:event_btn_suaActionPerformed

    private void tb_DanhSachHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DanhSachHoaDonMouseClicked
        // TODO add your handling code here:
        int row = tb_DanhSachHoaDon.getSelectedRow();
        txt_mahd.setText((String)(tb_DanhSachHoaDon.getValueAt(row, 0)));
    }//GEN-LAST:event_tb_DanhSachHoaDonMouseClicked

    private void tb_DanhSachCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DanhSachCTHDMouseClicked
        // TODO add your handling code here:
        int row = tb_DanhSachCTHD.getSelectedRow();
        txt_mahd.setText((String)String.valueOf(tb_DanhSachCTHD.getValueAt(row, 0)));
        txt_masp.setText((String)String.valueOf(tb_DanhSachCTHD.getValueAt(row, 1)));
        txt_soluong.setText(String.valueOf(tb_DanhSachCTHD.getValueAt(row, 2)));
        txt_thanhtien.setText((String)String.valueOf(tb_DanhSachCTHD.getValueAt(row, 3)));
    }//GEN-LAST:event_tb_DanhSachCTHDMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietHoaDon_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbb_masp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_DanhSachCTHD;
    private javax.swing.JTable tb_DanhSachHoaDon;
    private javax.swing.JTextField txt_mahd;
    private javax.swing.JTextField txt_masp;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_thanhtien;
    // End of variables declaration//GEN-END:variables

    private void hienthi() {
        theater();
        String[] tieude = {"Mã Hóa Đơn", "Mã Sản Phẩm", "Số lượng", "Thành tiền"};
        ArrayList<ChiTietHoaDon> dsChiTietHD = ChiTietHoaDonDAO.LayDanhSachChiTietHoaDon();
        DefaultTableModel dtm = (DefaultTableModel)tb_DanhSachCTHD.getModel();
        dtm.setColumnIdentifiers(tieude);
        dtm.setRowCount(0);
        for(ChiTietHoaDon chithd: dsChiTietHD){
            Vector <Object>v=new Vector<Object>();
            v.add(chithd.getMaHD());
            v.add(chithd.getMaSP());
            v.add(chithd.getSoLuong());
            v.add(chithd.getThanhTien());
            dtm.addRow(v);
        }
        tb_DanhSachCTHD.setModel(dtm);
    }

    private void hienthiHD() {
        theater1();
        String[] tieude = {"Mã Hóa Đơn", "Ngày xuất"};
        ArrayList<HoaDon> dsHD = HoaDonDAO.LayDanhSachHoaDon();
        DefaultTableModel dtm = (DefaultTableModel)tb_DanhSachHoaDon.getModel();
        dtm.setColumnIdentifiers(tieude);
        dtm.setRowCount(0);
        for(HoaDon hd: dsHD){
            Vector <Object>v=new Vector<Object>();
            v.add(hd.getMaHD());
            v.add(hd.getNgayXuat());
            dtm.addRow(v);
        }
        tb_DanhSachHoaDon.setModel(dtm);
    }

    private void loadSanPham() {
        sp = (DefaultComboBoxModel) cbb_masp.getModel();
        ArrayList<SanPham> dsSP = SanPhamDAO.LayDanhSachSanPham();
        for (SanPham sap : dsSP) {
            MyCombobox v = new MyCombobox(sap.getMaSP(), sap.getTenSP());
            sp.addElement(v);
        }
    }
}
