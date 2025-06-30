package NgabarinUTS;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import utils.GlobalState;


public class Navbar extends javax.swing.JPanel {   
    public Navbar() {
        initComponents();
        
        navBg.setIcon(new ImageIcon(
                new ImageIcon(getClass().getResource("/assets/Rectangle 1.png"))
                .getImage()
                .getScaledInstance(270, 800, Image.SCALE_SMOOTH)
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
        
        cardNama.putClientProperty(FlatClientProperties.STYLE, 
            "background: #6B8CAE; border: 0,0,0,0, #DEE4D7, 0f, 25;");
        
        nama.setText(GlobalState.getUsername());
        email.setText(GlobalState.getEmail());
    }
    
    private void resetButtonStyle() {
        Color defaultColor = Color.decode("#F0F0F0");
        dashboardBtn.setBackground(defaultColor);
        dashboardBtn.setOpaque(false);
        dashboardBtn.setForeground(Color.white);
        eventBtn.setBackground(defaultColor);
        eventBtn.setOpaque(false);
        eventBtn.setForeground(Color.white);
        divisiBtn.setBackground(defaultColor);
        divisiBtn.setOpaque(false);
        divisiBtn.setForeground(Color.white);
        manageBtn.setBackground(defaultColor);
        manageBtn.setOpaque(false);
        manageBtn.setForeground(Color.white);
        progressBtn.setBackground(defaultColor);
        progressBtn.setOpaque(false);
        progressBtn.setForeground(Color.white);
        laporanBtn.setBackground(defaultColor);
        laporanBtn.setOpaque(false);
        laporanBtn.setForeground(Color.white);
        pengaturanBtn.setBackground(defaultColor);
        pengaturanBtn.setOpaque(false);
        pengaturanBtn.setForeground(Color.white);
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
        cardNama = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        navBg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn.setText("Dashboard");
        dashboardBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        dashboardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardBtnMouseClicked(evt);
            }
        });
        add(dashboardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 270, 33));

        pengaturanBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        pengaturanBtn.setForeground(new java.awt.Color(255, 255, 255));
        pengaturanBtn.setText("Pengaturan");
        pengaturanBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        pengaturanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengaturanBtnMouseClicked(evt);
            }
        });
        add(pengaturanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 270, 33));

        eventBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        eventBtn.setForeground(new java.awt.Color(255, 255, 255));
        eventBtn.setText("Event Saya");
        eventBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        eventBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventBtnMouseClicked(evt);
            }
        });
        add(eventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 33));

        divisiBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        divisiBtn.setForeground(new java.awt.Color(255, 255, 255));
        divisiBtn.setText("Divisi & Anggota");
        divisiBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        divisiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisiBtnMouseClicked(evt);
            }
        });
        add(divisiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, 33));

        manageBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        manageBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageBtn.setText("Manajemen Tugas");
        manageBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        manageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBtnMouseClicked(evt);
            }
        });
        add(manageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 33));

        progressBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        progressBtn.setForeground(new java.awt.Color(255, 255, 255));
        progressBtn.setText("Progress Tugas");
        progressBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        progressBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progressBtnMouseClicked(evt);
            }
        });
        add(progressBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, 33));

        laporanBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        laporanBtn.setForeground(new java.awt.Color(255, 255, 255));
        laporanBtn.setText("Laporan");
        laporanBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        laporanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanBtnMouseClicked(evt);
            }
        });
        add(laporanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 270, 33));
        add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 180, 90));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kelola event dengan mudah");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 143, 270, -1));

        keluarBtn.setText("Keluar");
        keluarBtn.setBorder(null);
        keluarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarBtnMouseClicked(evt);
            }
        });
        add(keluarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 210, 30));

        cardNama.setBackground(new java.awt.Color(153, 153, 255));
        cardNama.setOpaque(false);

        nama.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(235, 235, 235));
        nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama.setText("NAMAKU");

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("Jabatan");

        javax.swing.GroupLayout cardNamaLayout = new javax.swing.GroupLayout(cardNama);
        cardNama.setLayout(cardNamaLayout);
        cardNamaLayout.setHorizontalGroup(
            cardNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardNamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardNamaLayout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardNamaLayout.setVerticalGroup(
            cardNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardNamaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(cardNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 180, 100));

        navBg.setBackground(new java.awt.Color(0, 0, 255));
        navBg.setOpaque(true);
        add(navBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtnMouseClicked
        resetButtonStyle();
        dashboardBtn.setOpaque(true);
        dashboardBtn.setBackground(Color.decode("#CED9E4"));
        dashboardBtn.setForeground(Color.black);
        
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_dashboardBtnMouseClicked

    private void eventBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventBtnMouseClicked
        resetButtonStyle();
        eventBtn.setOpaque(true);
        eventBtn.setBackground(Color.decode("#CED9E4"));
        eventBtn.setForeground(Color.black);
        
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Event().setVisible(true);
    }//GEN-LAST:event_eventBtnMouseClicked

    private void divisiBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisiBtnMouseClicked
        resetButtonStyle();
        divisiBtn.setOpaque(true);
        divisiBtn.setBackground(Color.decode("#CED9E4"));
        divisiBtn.setForeground(Color.black);
        
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Anggota();
    }//GEN-LAST:event_divisiBtnMouseClicked

    private void manageBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBtnMouseClicked
        resetButtonStyle();
        manageBtn.setOpaque(true);
        manageBtn.setBackground(Color.decode("#CED9E4"));
        manageBtn.setForeground(Color.black);
        
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Manajement();
    }//GEN-LAST:event_manageBtnMouseClicked

    private void progressBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressBtnMouseClicked
        resetButtonStyle();
        progressBtn.setOpaque(true);
        progressBtn.setBackground(Color.decode("#CED9E4"));
        progressBtn.setForeground(Color.black);
        
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Progress().setVisible(true);
    }//GEN-LAST:event_progressBtnMouseClicked

    private void laporanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanBtnMouseClicked
        resetButtonStyle();
        laporanBtn.setOpaque(true);
        laporanBtn.setBackground(Color.decode("#CED9E4"));
        laporanBtn.setForeground(Color.black);
        
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Laporan().setVisible(true);
    }//GEN-LAST:event_laporanBtnMouseClicked

    private void pengaturanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengaturanBtnMouseClicked
        resetButtonStyle();
        pengaturanBtn.setOpaque(true);
        pengaturanBtn.setBackground(Color.decode("#CED9E4"));
        pengaturanBtn.setForeground(Color.black);
        
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Settings().setVisible(true);
    }//GEN-LAST:event_pengaturanBtnMouseClicked

    private void keluarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarBtnMouseClicked
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Login().setVisible(true);
    }//GEN-LAST:event_keluarBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardNama;
    private javax.swing.JLabel dashboardBtn;
    private javax.swing.JLabel divisiBtn;
    private javax.swing.JLabel email;
    private javax.swing.JLabel eventBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JLabel laporanBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel manageBtn;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel navBg;
    private javax.swing.JLabel pengaturanBtn;
    private javax.swing.JLabel progressBtn;
    // End of variables declaration//GEN-END:variables
}
