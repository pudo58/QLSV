/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hubt.reypham.controller;

import com.hubt.reypham.dao.DmDiemHocPhanDAO;
import com.hubt.reypham.dao.DmHocPhanDAO;
import com.hubt.reypham.dao.SinhVienDAO;
import com.hubt.reypham.model.DmDiemHocPhan;
import com.hubt.reypham.model.DmHocPhan;
import com.hubt.reypham.model.SinhVien;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tho.lv
 */
public class DiemHocPhanController extends javax.swing.JFrame {
    SinhVienDAO sinhvienDao = SinhVienDAO.getInstance();
    DmDiemHocPhanDAO diemHocPhanDAO = DmDiemHocPhanDAO.getInstance();
    DmHocPhanDAO dmHocPhanDAO = DmHocPhanDAO.getInstance();
    DefaultComboBoxModel cbbSvModel,cbbHocPhanModel;
    DefaultTableModel tblModel ;
    public DiemHocPhanController() throws SQLException {
        initComponents();
        init();
    }
    public void init() throws SQLException{
        setResizable(false);
        setLocationRelativeTo(null);
        cbbSvModel = (DefaultComboBoxModel)cbb_maSv.getModel();
        for(SinhVien x : sinhvienDao.findAll())
            cbbSvModel.addElement(x.getMaSv());
        cbbHocPhanModel = (DefaultComboBoxModel)cbb_maHp.getModel();
        for (DmHocPhan  x : dmHocPhanDAO.findAll()) 
            cbbHocPhanModel.addElement(x.getMaHp());
        showTable();
    }
    public void showTable() throws SQLException{
         tblModel =(DefaultTableModel) tbl_table.getModel();
         tblModel.setRowCount(0);
        for(DmDiemHocPhan x : diemHocPhanDAO.findAll())
            tblModel.addRow(new Object[]{
                x.getMaSv(),x.getMaHp(),x.getDiemHp()
            });
    }
    public void create() throws SQLException{
        DmDiemHocPhan diemHocPhan = new DmDiemHocPhan(
                cbbSvModel.getSelectedItem().toString(),
                cbbHocPhanModel.getSelectedItem().toString(), 
                Double.parseDouble(txt_diem.getText())
        );
        if(diemHocPhanDAO.create(diemHocPhan)>0){
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            showTable();
        }else {
              JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_diem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbb_maSv = new javax.swing.JComboBox<>();
        cbb_maHp = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Quản lý điểm học phần");

        jLabel2.setText("Mã học phần");

        jLabel3.setText("Điểm");

        jLabel4.setText("Mã sinh viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_diem)
                    .addComponent(cbb_maSv, 0, 247, Short.MAX_VALUE)
                    .addComponent(cbb_maHp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbb_maHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_diem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbb_maSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jButton1.setText("Thêm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbl_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sv", "Mã học phần", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_table);
        if (tbl_table.getColumnModel().getColumnCount() > 0) {
            tbl_table.getColumnModel().getColumn(0).setResizable(false);
            tbl_table.getColumnModel().getColumn(1).setResizable(false);
            tbl_table.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton2.setText("Sửa điểm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            create();        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(DiemHocPhanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tableMouseClicked
     int index = tbl_table.getSelectedRow();
     txt_diem.setText(tblModel.getValueAt(index, 2).toString());
     cbbHocPhanModel.setSelectedItem(tblModel.getValueAt(index, 1));
     cbbSvModel.setSelectedItem(tblModel.getValueAt(index, 0));
    }//GEN-LAST:event_tbl_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String masv =cbbSvModel.getSelectedItem().toString();
     String mahp =cbbHocPhanModel.getSelectedItem().toString();
     DmDiemHocPhan dm = new DmDiemHocPhan(null, null, Double.parseDouble(txt_diem.getText()));
        try {
            if(diemHocPhanDAO.updateDiemHocPhan(mahp, masv, dm.getDiemHp())>0)
                JOptionPane.showMessageDialog(this, "Thành công");
        } catch (SQLException ex) {
            Logger.getLogger(DiemHocPhanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(DiemHocPhanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String masv =cbbSvModel.getSelectedItem().toString();
     String mahp =cbbHocPhanModel.getSelectedItem().toString();
        try {
            if(diemHocPhanDAO.deleteByMa(mahp, masv)>0){
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }  } catch (SQLException ex) {
            Logger.getLogger(DiemHocPhanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(DiemHocPhanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


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
            java.util.logging.Logger.getLogger(DiemHocPhanController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiemHocPhanController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiemHocPhanController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiemHocPhanController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DiemHocPhanController().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DiemHocPhanController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbb_maHp;
    private javax.swing.JComboBox<String> cbb_maSv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_table;
    private javax.swing.JTextField txt_diem;
    // End of variables declaration//GEN-END:variables
}
