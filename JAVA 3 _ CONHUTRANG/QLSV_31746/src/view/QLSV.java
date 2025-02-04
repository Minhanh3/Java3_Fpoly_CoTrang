/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.sun.jdi.connect.Connector;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mode.SinhVien;
import servise.SinhVienService;

/**
 *
 * @author Asus
 */
public class QLSV extends javax.swing.JFrame {

    private SinhVienService service = new SinhVienService();
    private DefaultTableModel mol = new DefaultTableModel();
    private int index = -1;

    /**
     * Creates new form view_QLSV
     */
    public QLSV() {
        initComponents();
        this.setLocationRelativeTo(null);
        initCBO();
        this.fillTable(service.getAll());

    }

    void initCBO() {
        String[] cbo = new String[]{"Phat Trien Phan Mem", "Xu li du lieu", "maketing"};
        cbo_chuyenNganh.setModel(new DefaultComboBoxModel<>(cbo));
    }

    void fillTable(List<SinhVien> list) {
        mol = (DefaultTableModel) tbl_bang.getModel();
        mol.setRowCount(0);
        for (SinhVien sinhVien : list) {
            mol.addRow(sinhVien.toData());
        }
    }

    void show(int index) {
        SinhVien sv = service.getAll().get(index);
        txt_maSV.setText(sv.getMaSinhVien());
        txt_tenSV.setText(sv.getTenSinhVien());
        txt_Tuoi.setText(String.valueOf(sv.getTuoi()));
        txt_kyHoc.setText(String.valueOf(sv.getHocKy()));
        txt_diemTB.setText(String.valueOf(sv.getDiemTrungBinh()));
        if (String.valueOf(sv.isGioitinh()).contains("true")) {
            rdo_nam.setSelected(true);
        } else {
            rdo_Nu.setSelected(true);
        }
        if (sv.getNganhHoc().contains("Phat Trien Phan Mem")) {
            cbo_chuyenNganh.setSelectedIndex(0);
        } else if (sv.getNganhHoc().contains("Xu li du lieu")) {
            cbo_chuyenNganh.setSelectedIndex(1);
        } else {
            cbo_chuyenNganh.setSelectedIndex(2);
        }

    }

    boolean check() {
        if (txt_maSV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "masv không được bỏ trống");
            return false;
        }
        if (txt_Tuoi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "tuoi không được bỏ trống");
            return false;
        } else {
            if (Integer.valueOf(txt_Tuoi.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Tuoi sai định dạngv");
                return false;
            }
        }
        if (txt_diemTB.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "diemTB không được bỏ trống");
            return false;
        } else {
            if (Double.valueOf(txt_diemTB.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Tuoi sai định dạngv");
                return false;
            }
        }
        if (txt_kyHoc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "KyHoc không được bỏ trống");
            return false;
        } else {
            if (Integer.valueOf(txt_kyHoc.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Tuoi sai định dạngv");
                return false;
            }
        }
        if (txt_tenSV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Name không được bỏ trống");
            return false;
        } else {//có name check :name là chữ cái ; không có tiếng việt
            if (!txt_tenSV.getText().matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "Name sai định dạng");
                return false;
            }
            return true;
        }
    }

    SinhVien readShow() {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(txt_maSV.getText());
        sv.setTenSinhVien(txt_tenSV.getText());
        sv.setTuoi(Integer.parseInt(txt_Tuoi.getText()));
        sv.setDiemTrungBinh(Float.parseFloat(txt_diemTB.getText()));
        sv.setHocKy(Integer.parseInt(txt_kyHoc.getText()));
        if (rdo_nam.isSelected()) {
            sv.setGioitinh(true); // Chọn 'Nam'
        } else {
            sv.setGioitinh(false); // Chọn 'Nữ'
        }
        sv.setNganhHoc((String) cbo_chuyenNganh.getSelectedItem());
        return sv;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bang = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_maSV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tenSV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Tuoi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_kyHoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_diemTB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbo_chuyenNganh = new javax.swing.JComboBox<>();
        rdo_nam = new javax.swing.JRadioButton();
        rdo_Nu = new javax.swing.JRadioButton();
        btn_Add = new javax.swing.JButton();
        btn_Remove = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "ma sinh vien", "ten sinh vien", "tuổi", "KỲ HỌC", "Title 6", "Title 7", "Title 8"
            }
        ));
        tbl_bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_bangMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bang);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Sinh Vien", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel2.setText("maSV");

        txt_maSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maSVActionPerformed(evt);
            }
        });

        jLabel3.setText("TenSV");

        jLabel4.setText("Tuoi");

        txt_Tuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TuoiActionPerformed(evt);
            }
        });

        jLabel5.setText("KyHoc");

        jLabel6.setText("NganhHoc");

        jLabel7.setText("DiemTrungBinh");

        txt_diemTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diemTBActionPerformed(evt);
            }
        });

        jLabel8.setText("GioiTinh");

        cbo_chuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdo_nam);
        rdo_nam.setText("Nam");

        buttonGroup1.add(rdo_Nu);
        rdo_Nu.setText("Nu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tenSV, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_maSV))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Tuoi)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(txt_diemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdo_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdo_Nu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_kyHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbo_chuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_kyHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_maSV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_chuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_diemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_nam)
                            .addComponent(rdo_Nu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btn_Add.setText("ADD");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Remove.setText("REMOVE");
        btn_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoveActionPerformed(evt);
            }
        });

        btn_Update.setText("UPDATE");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btn_Add)
                .addGap(72, 72, 72)
                .addComponent(btn_Remove)
                .addGap(65, 65, 65)
                .addComponent(btn_Update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add)
                    .addComponent(btn_Remove)
                    .addComponent(btn_Update))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_bangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bangMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_bangMouseEntered

    private void tbl_bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bangMouseClicked
        index = tbl_bang.getSelectedRow();
        this.show(index);
    }//GEN-LAST:event_tbl_bangMouseClicked

    private void txt_maSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maSVActionPerformed

    private void txt_TuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TuoiActionPerformed

    private void txt_diemTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diemTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diemTBActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        if (check()) {
            SinhVien sv = this.readShow();
            int index = tbl_bang.getSelectedRow();
            // Cập nhật thông tin cho đối tượng sv
            if (service.upDateSV(sv,sv.getMaSinhVien()) > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                fillTable(service.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
            }
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        if (check()) {
            SinhVien sv = this.readShow();
            if (service.getSinhVien(sv.getMaSinhVien()) != null) {
                JOptionPane.showMessageDialog(this, "mãSV trùng");
            } else {
                if (service.addSinhVien(sv) > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    fillTable(service.getAll());
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }
            }
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoveActionPerformed
        // TODO add your handling code here:
        if (check()) {
            SinhVien sv = this.readShow();
            String maSinhVien = tbl_bang.getValueAt(index, 1).toString();
            if (service.deleteSV(maSinhVien) > 0) {
                JOptionPane.showMessageDialog(this, "Delete thành công");
                fillTable(service.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "Delete thất bại");
            }
        }
    }//GEN-LAST:event_btn_RemoveActionPerformed

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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Remove;
    private javax.swing.JButton btn_Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_chuyenNganh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdo_Nu;
    private javax.swing.JRadioButton rdo_nam;
    private javax.swing.JTable tbl_bang;
    private javax.swing.JTextField txt_Tuoi;
    private javax.swing.JTextField txt_diemTB;
    private javax.swing.JTextField txt_kyHoc;
    private javax.swing.JTextField txt_maSV;
    private javax.swing.JTextField txt_tenSV;
    // End of variables declaration//GEN-END:variables
}
