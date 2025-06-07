package NgabarinUTS;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Navbar extends javax.swing.JPanel {
    public Navbar() {
        initComponents();
        
        navBg.setIcon(new ImageIcon(
                new ImageIcon(getClass().getResource("/assets/Rectangle 1.png"))
                .getImage()
                .getScaledInstance(230, 500, Image.SCALE_SMOOTH)
        ));
        
        logo.setIcon(new ImageIcon(
                new ImageIcon(getClass().getResource("/assets/logo.png"))
                .getImage()
                .getScaledInstance(130, 60, Image.SCALE_SMOOTH)
        ));
        
        FlatSVGIcon dashboardIcn = new FlatSVGIcon("assets/dashboard.svg", 20, 20);
        dashboardBtn.setIcon(dashboardIcn);
        dashboardBtn.setIconTextGap(10);
        
        FlatSVGIcon eventIcn = new FlatSVGIcon("assets/event.svg", 20, 20);
        eventBtn.setIcon(eventIcn);
        eventBtn.setIconTextGap(10);
        
        FlatSVGIcon divisiIcn = new FlatSVGIcon("assets/group.svg", 20, 20);
        divisiBtn.setIcon(divisiIcn);
        divisiBtn.setIconTextGap(10);
        
        FlatSVGIcon manageIcn = new FlatSVGIcon("assets/assignment.svg", 20, 20);
        manageBtn.setIcon(manageIcn);
        manageBtn.setIconTextGap(10);
        
        FlatSVGIcon progressIcn = new FlatSVGIcon("assets/progress.svg", 20, 20);
        progressBtn.setIcon(progressIcn);
        progressBtn.setIconTextGap(10);
        
        FlatSVGIcon laporanIcn = new FlatSVGIcon("assets/report.svg", 20, 20);
        laporanBtn.setIcon(laporanIcn);
        laporanBtn.setIconTextGap(10);
        
        FlatSVGIcon pengaturanIcn = new FlatSVGIcon("assets/gear.svg", 20, 20);
        pengaturanBtn.setIcon(pengaturanIcn);
        pengaturanBtn.setIconTextGap(10);
        
        keluarBtn.putClientProperty( "JButton.buttonType", "roundRect" );
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardBtn = new javax.swing.JLabel();
        pengaturanBtn = new javax.swing.JLabel();
        eventBtn = new javax.swing.JLabel();
        divisiBtn = new javax.swing.JLabel();
        manageBtn = new javax.swing.JLabel();
        progressBtn = new javax.swing.JLabel();
        laporanBtn = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        keluarBtn = new javax.swing.JButton();
        navBg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn.setText("Dashboard");
        dashboardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardBtnMouseClicked(evt);
            }
        });
        add(dashboardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 220, 33));

        pengaturanBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        pengaturanBtn.setForeground(new java.awt.Color(255, 255, 255));
        pengaturanBtn.setText("Pengaturan");
        add(pengaturanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 220, 33));

        eventBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        eventBtn.setForeground(new java.awt.Color(255, 255, 255));
        eventBtn.setText("Event Saya");
        add(eventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 220, 33));

        divisiBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        divisiBtn.setForeground(new java.awt.Color(255, 255, 255));
        divisiBtn.setText("Divisi & Anggota");
        add(divisiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 220, 33));

        manageBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        manageBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageBtn.setText("Manajemen Tugas");
        add(manageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, 33));

        progressBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        progressBtn.setForeground(new java.awt.Color(255, 255, 255));
        progressBtn.setText("Progress Tugas");
        add(progressBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 220, 33));

        laporanBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        laporanBtn.setForeground(new java.awt.Color(255, 255, 255));
        laporanBtn.setText("Laporan");
        add(laporanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 33));
        add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, 60));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kelola event dengan mudah");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, -1));

        keluarBtn.setText("Keluar");
        keluarBtn.setBorder(null);
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });
        add(keluarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 443, 210, 30));

        navBg.setBackground(new java.awt.Color(0, 0, 255));
        navBg.setOpaque(true);
        add(navBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtnMouseClicked
        JOptionPane.showMessageDialog(eventBtn, "PPP");
    }//GEN-LAST:event_dashboardBtnMouseClicked

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardBtn;
    private javax.swing.JLabel divisiBtn;
    private javax.swing.JLabel eventBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JLabel laporanBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel manageBtn;
    private javax.swing.JLabel navBg;
    private javax.swing.JLabel pengaturanBtn;
    private javax.swing.JLabel progressBtn;
    // End of variables declaration//GEN-END:variables
}
