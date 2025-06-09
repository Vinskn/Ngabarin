/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NgabarinUTS;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import utils.ImageButton;
import utils.ImageUtils;
import javax.swing.Box;
import utils.Dash_cardEvt;


/**
 *
 * @author Svin
 */
public class Dashboard extends javax.swing.JFrame {
    SQLConnection connect;

    public Dashboard() {
        connect = new SQLConnection();
        initComponents();        
        setSize(840, 530);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        
        // setting scroll & mainpanel ------------------------------------------------------ 
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // create custom btn (bg png)
        Image originalBg = new ImageIcon(getClass().getResource("/assets/Rectangle 1.png")).getImage();
        BufferedImage btnBg = ImageUtils.getScaledImage(originalBg, 200, 50);
                               
        ImageButton headerAddEvt = new ImageButton(btnBg, "<html><center>Tambah<br>Event</center></html>", 10);
        headerAddEvt.setBounds(dummyAddEvt.getBounds());
        headerPanel.remove(dummyAddEvt);
        headerPanel.add(headerAddEvt);
        dummyAddEvt = headerAddEvt;
        headerAddEvt.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
        headerAddEvt.setForeground(Color.WHITE);
        
        // setting dashboard summary
        cont_totalEvt.setIcon(new FlatSVGIcon("assets/dash-totalEvt.svg", cont_totalEvt.getWidth() + 5, cont_totalEvt.getHeight() + 5));
        cont_aktifEvt.setIcon(new FlatSVGIcon("assets/dash-aktifEvt.svg", cont_totalEvt.getWidth() + 5, cont_totalEvt.getHeight() + 5));
        cont_totalTugas.setIcon(new FlatSVGIcon("assets/dash-totalTugas.svg", cont_totalEvt.getWidth() + 5, cont_totalEvt.getHeight() + 5));
        cont_tugasSelesai.setIcon(new FlatSVGIcon("assets/dash-tugasSelesai.svg", cont_totalEvt.getWidth() + 5, cont_totalEvt.getHeight() + 5));
        

        for (int i = 0; i < 5; i++) {
            Dash_cardEvt cardList = new Dash_cardEvt();
            mainPanel.add(cardList);
            mainPanel.add(Box.createVerticalStrut(10));
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar2 = new NgabarinUTS.Navbar();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dummyAddEvt = new javax.swing.JButton();
        summary = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        totalEvt = new javax.swing.JLabel();
        cont_totalEvt = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        eventAktif = new javax.swing.JLabel();
        cont_aktifEvt = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        totalTugas = new javax.swing.JLabel();
        cont_totalTugas = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        tugasSelesai = new javax.swing.JLabel();
        cont_tugasSelesai = new javax.swing.JLabel();
        recentEvt = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(222, 228, 215));
        setSize(new java.awt.Dimension(830, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(navbar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setBorder(null);

        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        headerPanel.setPreferredSize(new java.awt.Dimension(586, 95));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Selamat datang kembali! Lihat ringkasan event dan");
        jLabel2.setIconTextGap(0);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("aktivitas terbaru anda");
        jLabel3.setIconTextGap(0);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(dummyAddEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(dummyAddEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        mainPanel.add(headerPanel);

        summary.setBackground(new java.awt.Color(222, 228, 215));
        summary.setPreferredSize(new java.awt.Dimension(586, 327));

        jLayeredPane1.setBackground(new java.awt.Color(240, 214, 214));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalEvt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        totalEvt.setText("10");
        jLayeredPane1.add(totalEvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jLayeredPane1.add(cont_totalEvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 140));

        jLayeredPane2.setBackground(new java.awt.Color(240, 214, 214));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eventAktif.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        eventAktif.setText("10");
        jLayeredPane2.add(eventAktif, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jLayeredPane2.add(cont_aktifEvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 140));

        jLayeredPane3.setBackground(new java.awt.Color(0, 255, 51));
        jLayeredPane3.setOpaque(true);
        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalTugas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        totalTugas.setText("10");
        jLayeredPane3.add(totalTugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jLayeredPane3.add(cont_totalTugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 140));

        jLayeredPane4.setBackground(new java.awt.Color(255, 102, 102));
        jLayeredPane4.setOpaque(true);
        jLayeredPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tugasSelesai.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tugasSelesai.setText("10");
        jLayeredPane4.add(tugasSelesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
        jLayeredPane4.add(cont_tugasSelesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 140));

        javax.swing.GroupLayout summaryLayout = new javax.swing.GroupLayout(summary);
        summary.setLayout(summaryLayout);
        summaryLayout.setHorizontalGroup(
            summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane4))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        summaryLayout.setVerticalGroup(
            summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1))
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(summaryLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane3))
                    .addGroup(summaryLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane4)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        mainPanel.add(summary);

        recentEvt.setPreferredSize(new java.awt.Dimension(586, 80));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Event Terbaru");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Lihat Semua");

        javax.swing.GroupLayout recentEvtLayout = new javax.swing.GroupLayout(recentEvt);
        recentEvt.setLayout(recentEvtLayout);
        recentEvtLayout.setHorizontalGroup(
            recentEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentEvtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        recentEvtLayout.setVerticalGroup(
            recentEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentEvtLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(recentEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(recentEvt);

        jScrollPane1.setViewportView(mainPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 580, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put( "ProgressBar.arc", 999 );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cont_aktifEvt;
    private javax.swing.JLabel cont_totalEvt;
    private javax.swing.JLabel cont_totalTugas;
    private javax.swing.JLabel cont_tugasSelesai;
    private javax.swing.JButton dummyAddEvt;
    private javax.swing.JLabel eventAktif;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private NgabarinUTS.Navbar navbar2;
    private javax.swing.JPanel recentEvt;
    private javax.swing.JPanel summary;
    private javax.swing.JLabel totalEvt;
    private javax.swing.JLabel totalTugas;
    private javax.swing.JLabel tugasSelesai;
    // End of variables declaration//GEN-END:variables
}
