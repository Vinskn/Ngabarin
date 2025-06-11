package utils;

import NgabarinUTS.Dashboard;
import NgabarinUTS.Progress;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class Dash_cardEvt extends javax.swing.JPanel {
    String namePrm, datePrm, descPrm;
    int statusPrm;
    public Dash_cardEvt(String namePrm, String datePrm, String descPrm, int statusPrm) {
        this.namePrm = namePrm;
        this.datePrm = datePrm;
        this.descPrm = descPrm;
        this.statusPrm = statusPrm;
        
        initComponents();
        
        evtName.setText(namePrm);
        evtDate.setText(datePrm);
        deskripsi.setText(descPrm);
        if (statusPrm == 0) {
            status.setText("Aktif");
        } else {
            status.setText("Selesai");
        }
        
        cardBg.setIcon(new FlatSVGIcon("assets/cardBg.svg", cardBg.getWidth(), cardBg.getHeight()));
        
        deskripsi.setLineWrap(true);
        deskripsi.setWrapStyleWord(true);
        deskripsi.setEditable(false);
        deskripsi.setFocusable(false);
        jScrollPane1.setBorder(null);
        
        status.putClientProperty(FlatClientProperties.STYLE, 
            "background: #DEE4D7; foreground: #2E8A34; border: 0,0,0,0, #DEE4D7, 1.0f, 15;");
        
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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        setPreferredSize(new java.awt.Dimension(780, 210));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

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
        cardBg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardBgMouseClicked(evt);
            }
        });
        jLayeredPane1.add(cardBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void cardBgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardBgMouseClicked
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JFrame) {
            parentWindow.dispose();
        }
        new Progress().setVisible(true);
    }//GEN-LAST:event_cardBgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardBg;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JLabel evtDate;
    private javax.swing.JLabel evtName;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
