/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NgabarinUTS;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;



/**
 *
 * @author elgisundari
 */
public class divisi extends javax.swing.JFrame {
    private javax.swing.JTextField txtDivisi;
    SQLConnection connect;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(divisi.class.getName());

    /**
     * Creates new form divisi
     */
    public divisi() {
        connect = new SQLConnection();
        initComponents();        
        setSize(1100, 828); 
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(245, 243, 240));
        
        loadDataDivisi();
        
        jScrollPane1.setColumnHeaderView(null); // ini bikin header hilang total
        jTable1.setBackground(new Color(255, 250, 240)); // krem
        jScrollPane1.getViewport().setBackground(new Color(255, 255, 255)); // krem juga
        jTable1.setRowHeight(30); 
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(200); // kolom "Divisi"
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100); // kolom "Anggota"
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(120); // kolom "Aksi"


        txtDivisi = new javax.swing.JTextField();
        getContentPane().add(txtDivisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 300, 40));

        DefaultTableModel model = new DefaultTableModel(new Object[]{"Divisi", "Anggota", "Aksi"}, 0);
        jTable1.setModel(model);

        ImageIcon icon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/logo_sidebar.png"));
        Image scaledImage = icon.getImage().getScaledInstance(275, 134, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(scaledImage));
        
        icon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/user.png"));
        scaledImage = icon.getImage().getScaledInstance(245, 70, Image.SCALE_SMOOTH);
        maman.setIcon(new ImageIcon(scaledImage));
        
        // resize icon tombol Dashboard
        ImageIcon dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/dashboard bar.png"));
        Image dashboardImg = dashboardIcon.getImage().getScaledInstance(320, 50, Image.SCALE_SMOOTH);
        dashboard.setIcon(new ImageIcon(dashboardImg));
        
        // resize icon tombol Dashboard
        dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/event bar.png"));
        dashboardImg = dashboardIcon.getImage().getScaledInstance(320, 50, Image.SCALE_SMOOTH);
        event.setIcon(new ImageIcon(dashboardImg));
        
        // resize icon tombol Dashboard
        dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/divisi bar.png"));
        dashboardImg = dashboardIcon.getImage().getScaledInstance(320, 50, Image.SCALE_SMOOTH);
        divisi.setIcon(new ImageIcon(dashboardImg));
        
        // resize icon tombol Dashboard
        dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/manajemen bar.png"));
        dashboardImg = dashboardIcon.getImage().getScaledInstance(320, 50, Image.SCALE_SMOOTH);
        tugas.setIcon(new ImageIcon(dashboardImg));
        
        // resize icon tombol Dashboard
        dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/progress bar.png"));
        dashboardImg = dashboardIcon.getImage().getScaledInstance(320, 50, Image.SCALE_SMOOTH);
        progress.setIcon(new ImageIcon(dashboardImg));
        
        // resize icon tombol Dashboard
        dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/laporan bar.png"));
        dashboardImg = dashboardIcon.getImage().getScaledInstance(320, 50, Image.SCALE_SMOOTH);
        laporan.setIcon(new ImageIcon(dashboardImg));
        
        // resize icon tombol Dashboard
        dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/pengaturan.png"));
        dashboardImg = dashboardIcon.getImage().getScaledInstance(320, 50, Image.SCALE_SMOOTH);
        pengaturan.setIcon(new ImageIcon(dashboardImg));
        
        dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/keluar.png"));
        dashboardImg = dashboardIcon.getImage().getScaledInstance(245, 35, Image.SCALE_SMOOTH);
        keluar.setIcon(new ImageIcon(dashboardImg));
        
        dashboardIcon = new ImageIcon(getClass().getResource("/NgabarinUTS/assets/Frame 444.png"));
        dashboardImg = dashboardIcon.getImage().getScaledInstance(141, 41, Image.SCALE_SMOOTH);
        tambah.setIcon(new ImageIcon(dashboardImg));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        laporan = new javax.swing.JButton();
        divisi = new javax.swing.JButton();
        event = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        tugas = new javax.swing.JButton();
        progress = new javax.swing.JButton();
        pengaturan = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maman = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setPreferredSize(new java.awt.Dimension(275, 134));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/keluar.png"))); // NOI18N
        keluar.setContentAreaFilled(false);
        keluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        keluar.setPreferredSize(new java.awt.Dimension(250, 50));
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 245, 35));

        laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/laporan bar.png"))); // NOI18N
        laporan.setContentAreaFilled(false);
        laporan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        laporan.setMargin(new java.awt.Insets(0, 10, 0, 0));
        laporan.setPreferredSize(new java.awt.Dimension(320, 50));
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });
        getContentPane().add(laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        divisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/divisi bar.png"))); // NOI18N
        divisi.setContentAreaFilled(false);
        divisi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        divisi.setMargin(new java.awt.Insets(0, 10, 0, 0));
        divisi.setPreferredSize(new java.awt.Dimension(320, 50));
        divisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisiActionPerformed(evt);
            }
        });
        getContentPane().add(divisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        event.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/event bar.png"))); // NOI18N
        event.setContentAreaFilled(false);
        event.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        event.setMargin(new java.awt.Insets(0, 10, 0, 0));
        event.setPreferredSize(new java.awt.Dimension(320, 50));
        event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventActionPerformed(evt);
            }
        });
        getContentPane().add(event, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/dashboard bar.png"))); // NOI18N
        dashboard.setBorderPainted(false);
        dashboard.setContentAreaFilled(false);
        dashboard.setFocusPainted(false);
        dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dashboard.setMargin(new java.awt.Insets(0, 10, 0, 0));
        dashboard.setPreferredSize(new java.awt.Dimension(320, 50));
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        tugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/manajemen bar.png"))); // NOI18N
        tugas.setContentAreaFilled(false);
        tugas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tugas.setMargin(new java.awt.Insets(0, 10, 0, 0));
        tugas.setPreferredSize(new java.awt.Dimension(320, 50));
        tugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tugasActionPerformed(evt);
            }
        });
        getContentPane().add(tugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        progress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/progress bar.png"))); // NOI18N
        progress.setContentAreaFilled(false);
        progress.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        progress.setMargin(new java.awt.Insets(0, 10, 0, 0));
        progress.setPreferredSize(new java.awt.Dimension(320, 50));
        progress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progressActionPerformed(evt);
            }
        });
        getContentPane().add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        pengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/Pengaturan.png"))); // NOI18N
        pengaturan.setContentAreaFilled(false);
        pengaturan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pengaturan.setMargin(new java.awt.Insets(0, 10, 0, 0));
        pengaturan.setPreferredSize(new java.awt.Dimension(320, 50));
        pengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengaturanActionPerformed(evt);
            }
        });
        getContentPane().add(pengaturan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/Frame 444.png"))); // NOI18N
        tambah.setContentAreaFilled(false);
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/30.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 610, 440));

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 183, 390, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/rectangle.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, 40));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Tambah Divisi");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/Rectangle 19.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        maman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/user.png"))); // NOI18N
        maman.setPreferredSize(new java.awt.Dimension(254, 90));
        getContentPane().add(maman, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 245, 70));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Divisi & Anggota");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/Rectangle 2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(320, 800));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/putih.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(703, 734));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");
        jLabel8.setPreferredSize(new java.awt.Dimension(1100, 800));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true); // buka form dashboard
        this.dispose(); // tutup form sekarang
    }//GEN-LAST:event_dashboardActionPerformed

    private void eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventActionPerformed

    private void divisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisiActionPerformed
        // TODO add your handling code here:
        new divisi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_divisiActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laporanActionPerformed

    private void tugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tugasActionPerformed

    }//GEN-LAST:event_tugasActionPerformed

    private void progressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_progressActionPerformed

    private void pengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengaturanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pengaturanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Yakin ingin keluar?", "Konfirmasi Logout", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            new Login().setVisible(true);  // ganti ke frame login kamu
            dispose();  // tutup frame sekarang
        }
    }//GEN-LAST:event_keluarActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        try {
        String namaDivisi = jTextField1.getText();
        if (namaDivisi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama divisi tidak boleh kosong!");
            return;
        }
        
        Connection conn = connect.con;
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi ke database!");
            return;
        }

        String sql = "INSERT INTO divisi (nama_divisi, jumlah_anggota) VALUES (?, 0)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, namaDivisi);
        pst.executeUpdate();

        // Tambah ke tabel
        loadDataDivisi(); // biar data langsung ke-refresh dari database
        System.out.println("Data berhasil ditambahkan ke tabel");


        txtDivisi.setText(""); // bersihkan input

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error tambah divisi: " + e.getMessage());
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());

        if (col == 2) { // kolom aksi
            String pilihan = JOptionPane.showInputDialog("Ketik 'edit' untuk ubah jumlah anggota, atau 'hapus':");

            if ("edit".equalsIgnoreCase(pilihan)) {
                // Ambil nama divisi
                String namaDivisi = (String) jTable1.getValueAt(row, 0);

                // Minta input jumlah anggota
                String inputAnggota = JOptionPane.showInputDialog("Masukkan jumlah anggota untuk divisi: " + namaDivisi);
                try {
                    int jumlahBaru = Integer.parseInt(inputAnggota);

                    // Update DB
                    Connection conn = connect.con;
                    if (conn == null) {
                        JOptionPane.showMessageDialog(null, "Gagal koneksi ke database!");
                        return;
                    }

                    String sql = "UPDATE divisi SET jumlah_anggota = ? WHERE nama_divisi = ?";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setInt(1, jumlahBaru);
                    pst.setString(2, namaDivisi);
                    pst.executeUpdate();

                    // Update tabel GUI
                    jTable1.setValueAt(jumlahBaru, row, 1);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Jumlah anggota harus berupa angka!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Gagal update anggota: " + ex.getMessage());
                }
            }

            else if ("hapus".equalsIgnoreCase(pilihan)) {
                String namaDivisi = (String) jTable1.getValueAt(row, 0);

                int confirm = JOptionPane.showConfirmDialog(null,
                    "Yakin hapus divisi: " + namaDivisi + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    try {
                        Connection conn = connect.con;
                        if (conn == null) {
                            JOptionPane.showMessageDialog(null, "Koneksi gagal!");
                            return;
                        }

                        String sql = "DELETE FROM divisi WHERE nama_divisi = ?";
                        PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, namaDivisi);
                        pst.executeUpdate();

                        ((DefaultTableModel) jTable1.getModel()).removeRow(row);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Gagal hapus divisi: " + ex.getMessage());
                    }
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void loadDataDivisi() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear isi tabel

    try {
        Connection conn = connect.con;
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal");
            return;
        }

        String sql = "SELECT nama_divisi, jumlah_anggota FROM divisi";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            String nama = rs.getString("nama_divisi");
            int jumlah = rs.getInt("jumlah_anggota");

            model.addRow(new Object[]{nama, jumlah, "Edit | Hapus"});
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal load data: " + e.getMessage());
    }
}

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new divisi().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard;
    private javax.swing.JButton divisi;
    private javax.swing.JButton event;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton laporan;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel maman;
    private javax.swing.JButton pengaturan;
    private javax.swing.JButton progress;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tugas;
    // End of variables declaration//GEN-END:variables
}
