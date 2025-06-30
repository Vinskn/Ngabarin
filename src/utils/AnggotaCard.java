
package utils;

import NgabarinUTS.SQLConnection;
import NgabarinUTS.Anggota;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AnggotaCard extends javax.swing.JPanel {
    SQLConnection connect;
    private int idEvt;
    private int idDivisi;
    private String namaDivisi;
    private Anggota parent;

    private int getIDmember;

    public AnggotaCard(int idEvt, int idDivisi, String namaDivisi, Anggota parent) {
        this.idEvt = idEvt;
        this.idDivisi = idDivisi;
        this.namaDivisi = namaDivisi;
        this.parent = parent;
        initComponents();

        idDiv.setText(String.valueOf(idDivisi));
        namaDiv.setText(namaDivisi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idDiv = new javax.swing.JLabel();
        namaDiv = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        idDiv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idDiv.setText("jLabel1");

        namaDiv.setText("jLabel2");

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("+ Anggota");
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(20, 20));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(idDiv)
                                .addGap(52, 52, 52)
                                .addComponent(namaDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146,
                                        Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idDiv)
                                        .addComponent(namaDiv))
                                .addGap(16, 16, 16))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MouseClicked
        String email = JOptionPane.showInputDialog(null, "Masukan Email Anggota");
        if (checkUser(email)) {
            sendData();
        } else {
            JOptionPane.showMessageDialog(parent, "Email tidak ditemukan");
        }
    }// GEN-LAST:event_jLabel3MouseClicked

    private boolean checkUser(String email) {
        String query = "SELECT * FROM user_table WHERE email = '" + email + "'";

        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            ResultSet res = st.executeQuery(query);
            if (res.next()) {
                getIDmember = res.getInt("id");
                return true;
            }
            connect.con.close();
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parent, "Error: " + e.getMessage());
            return false;
        }
    }

    private void sendData() {
        String query = "CALL AddMemberToDivision(" + idDivisi + ", " + getIDmember + ")";

        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            int res = st.executeUpdate(query);

            if (res > 1) {
                JOptionPane.showMessageDialog(parent, "Anggota Berhasil Ditambah", "Berhasil",
                        JOptionPane.INFORMATION_MESSAGE);
                parent.refreshData();
            } else {
                JOptionPane.showMessageDialog(parent, "Gagal menambah Anggota", "GAGAL", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(parent, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idDiv;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel namaDiv;
    // End of variables declaration//GEN-END:variables
}
