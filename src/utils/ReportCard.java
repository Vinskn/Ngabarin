
package utils;

import NgabarinUTS.Laporan;
import NgabarinUTS.SQLConnection;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ReportCard extends javax.swing.JPanel {
    SQLConnection connect;
    private String namaEvt;
    private String descEvt;
    private int idEvt;
    private Laporan parent;

    public ReportCard(String namaEvt, String descEvt, int idEvt, Laporan parent) {
        this.namaEvt = namaEvt;
        this.descEvt = descEvt;
        this.idEvt = idEvt;
        this.parent = parent;

        initComponents();
        namaEvent.setText(namaEvt);
        descEvent.setText(descEvt);
        check.setIcon(new FlatSVGIcon("assets/beenhere.svg", check.getWidth(), check.getHeight()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        namaEvent = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        descEvent = new javax.swing.JTextArea();
        check = new javax.swing.JLabel();

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);

        namaEvent.setEditable(false);
        namaEvent.setColumns(20);
        namaEvent.setLineWrap(true);
        namaEvent.setRows(5);
        namaEvent.setText("111111111111");
        jScrollPane1.setViewportView(namaEvent);

        jScrollPane2.setBorder(null);
        jScrollPane2.setFocusable(false);

        descEvent.setEditable(false);
        descEvent.setColumns(20);
        descEvent.setLineWrap(true);
        descEvent.setRows(5);
        descEvent.setText("11111111111111");
        jScrollPane2.setViewportView(descEvent);

        check.setPreferredSize(new java.awt.Dimension(50, 56));
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_checkMouseClicked
        if (!checkLeader()) {
            JOptionPane.showMessageDialog(parent, "Maaf Anda bukan ketua event ini, tidak bisa menandai selesai!",
                    "Error Access", JOptionPane.ERROR_MESSAGE);
        } else {
            int validation = JOptionPane.showConfirmDialog(parent, "Yakin untuk menandai event selesai?");
            if (validation == 0) {
                sendData();
            }
        }
    }// GEN-LAST:event_checkMouseClicked

    private boolean checkLeader() {
        int globalUsrID = GlobalState.getUserID();
        String query = "SELECT * FROM event_table WHERE eventID = " + idEvt + " AND id_ketuaEvent = " + globalUsrID;
        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            ResultSet res = st.executeQuery(query);

            if (res.next()) {
                return true;
            }
            connect.con.close();
            return false;
        } catch (Exception e) {
            System.out.println("Gagal Mengambil data" + e.getMessage());
        }
        return false;
    }

    private void sendData() {
        String query = "CALL FinishEventCascade("+ idEvt +")";
        
        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            int status = st.executeUpdate(query);
            if (status > 1) {
                JOptionPane.showMessageDialog(parent, "Event Berhasil Diselesaikan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                parent.refreshData();
            } else {
                JOptionPane.showMessageDialog(parent, "Gagal menandai Event Selesai", "GAGAL", JOptionPane.ERROR_MESSAGE);
            }         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parent, "Gagal " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel check;
    private javax.swing.JTextArea descEvent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea namaEvent;
    // End of variables declaration//GEN-END:variables
}
