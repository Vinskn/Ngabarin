package utils;

import NgabarinUTS.Dashboard;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class Dash_cardEvt extends javax.swing.JPanel {
    public Dash_cardEvt() {
        initComponents();
        
        cardBg.setIcon(new FlatSVGIcon("assets/cardBg.svg", cardBg.getWidth(), cardBg.getHeight()));
        
        deskripsi.setLineWrap(true);
        deskripsi.setWrapStyleWord(true);
        deskripsi.setEditable(false);
        deskripsi.setFocusable(false);
        jScrollPane1.setBorder(null);
        
        status.putClientProperty(FlatClientProperties.STYLE, 
            "background: #DEE4D7; foreground: #2E8A34; border: 0,0,0,0, #DEE4D7, 1.0f, 15;");
        
        progress.setValue(80);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        evtName = new javax.swing.JLabel();
        evtDate = new javax.swing.JLabel();
        cardBg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        status = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        setPreferredSize(new java.awt.Dimension(575, 200));

        jLayeredPane1.setBackground(new java.awt.Color(255, 51, 255));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        evtName.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        evtName.setForeground(new java.awt.Color(255, 255, 255));
        evtName.setText("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
        jLayeredPane1.add(evtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        evtDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        evtDate.setForeground(new java.awt.Color(255, 255, 255));
        evtDate.setText("11 - November - 1111");
        jLayeredPane1.add(evtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        cardBg.setPreferredSize(new java.awt.Dimension(582, 72));
        jLayeredPane1.add(cardBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        deskripsi.setEditable(false);
        deskripsi.setBackground(new java.awt.Color(255, 255, 255));
        deskripsi.setColumns(20);
        deskripsi.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        deskripsi.setForeground(new java.awt.Color(102, 102, 102));
        deskripsi.setRows(2);
        deskripsi.setText("Masa Bimbingan Mahasiswa Baru Rekayasa Perangkat Lunak UPI Kampus Cibiru Tahun 2025");
        deskripsi.setWrapStyleWord(true);
        deskripsi.setBorder(null);
        deskripsi.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        deskripsi.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(deskripsi);

        status.setBackground(new java.awt.Color(231, 231, 231));
        status.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        status.setForeground(new java.awt.Color(0, 204, 0));
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("Aktif");
        status.setOpaque(true);

        progress.setBackground(new java.awt.Color(232, 232, 232));
        progress.setForeground(new java.awt.Color(156, 175, 136));
        progress.setBorder(null);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel1.setText("80%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardBg;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JLabel evtDate;
    private javax.swing.JLabel evtName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
