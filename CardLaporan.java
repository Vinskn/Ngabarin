
package utils;

import NgabarinUTS.Laporan;
import NgabarinUTS.SQLConnection;
import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CardLaporan extends javax.swing.JPanel {
    SQLConnection connect;
    String judulPrm;
    String deskripsiPrm;
    int id_evt;
    Laporan parent;
    public CardLaporan(String judulPrm, String deskripsiPrm, int id_evt, Laporan parent) {
        initComponents();
        this.parent = parent;
        setSize(1100, 145);
        this.judulPrm = judulPrm;
        this.deskripsiPrm = deskripsiPrm;
        id_evt = id_evt;
        
        judulEvent.setText(judulPrm);
        deskripsi.setText(deskripsiPrm);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p = new javax.swing.JScrollPane();
        judulEvent = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        p.setBorder(null);
        p.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        p.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        judulEvent.setEditable(false);
        judulEvent.setColumns(20);
        judulEvent.setLineWrap(true);
        judulEvent.setRows(5);
        judulEvent.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        judulEvent.setBorder(null);
        judulEvent.setFocusable(false);
        p.setViewportView(judulEvent);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        deskripsi.setEditable(false);
        deskripsi.setColumns(20);
        deskripsi.setLineWrap(true);
        deskripsi.setRows(5);
        deskripsi.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        deskripsi.setBorder(null);
        jScrollPane2.setViewportView(deskripsi);

        jButton1.setText("Event Selesai");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String query = "CALL FinishEventCascade("+ id_evt +")";
        
        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(jButton1, "Berhasil");
                       
            parent.refreshData();
            connect.con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jButton1, "Berhasil");
        }
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea judulEvent;
    private javax.swing.JScrollPane p;
    // End of variables declaration//GEN-END:variables
}
