package utils;

import NgabarinUTS.Dashboard;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.UIManager;


public class Dash_cardEvt extends javax.swing.JPanel {
    public Dash_cardEvt() {
        initComponents();
        
        cardBg.setIcon(new FlatSVGIcon("assets/cardBg.svg", cardBg.getWidth(), cardBg.getHeight()));
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        evtName = new javax.swing.JLabel();
        evtDate = new javax.swing.JLabel();
        cardBg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(582, 300));

        jLabel1.setText("jLabel1");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardBg;
    private javax.swing.JLabel evtDate;
    private javax.swing.JLabel evtName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
