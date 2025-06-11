package utils;

import NgabarinUTS.Progress;
import NgabarinUTS.SQLConnection;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import javax.swing.JOptionPane;


public class progressCard extends javax.swing.JPanel {
    SQLConnection connect;
    private String judul_param;
    private String deskripsi_param;
    private String namaEvt;
    private String namaDivisi;
    private int status_param = 1;
    private int idTugas;
    
    private Progress parent;
    
    public progressCard(String judul_param, String deskripsi_param, String namaEvt, String namaDivisi, int status_param, int idTugas, Progress parent) {
        this.parent = parent;
        this.judul_param = judul_param;
        this. deskripsi_param = deskripsi_param;
        this.namaEvt = namaEvt;
        this.namaDivisi = namaDivisi;
        this.status_param = status_param;
        this.idTugas = idTugas;
        
        initComponents();
        nama.setText(judul_param);
        deskripsi.setText(deskripsi_param);
        evtName.setText(namaEvt);
        divisi.setText(namaDivisi);
                
        if (status_param == 0) {
            status.setIcon(new FlatSVGIcon("assets/manage_belum.svg", 90, 35));
        } else {
            status.setIcon(new FlatSVGIcon("assets/manage_selesai.svg", 90, 35));
        }
        
        if (status_param == 0) {
            check.setIcon(new FlatSVGIcon("assets/done.svg", 35, 35));
        } else {
            check.setVisible(false);
            this.setBackground(new Color(161, 255, 218));
            nama.setBackground(new Color(161, 255, 218));
            deskripsi.setBackground(new Color(161, 255, 218));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        check = new javax.swing.JLabel();
        divisi = new javax.swing.JLabel();
        evtName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        nama = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(790, 135));

        status.setText("TAk Tahu");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setOpaque(false);

        deskripsi.setEditable(false);
        deskripsi.setColumns(20);
        deskripsi.setLineWrap(true);
        deskripsi.setRows(5);
        deskripsi.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab");
        deskripsi.setBorder(null);
        deskripsi.setFocusable(false);
        jScrollPane1.setViewportView(deskripsi);

        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });

        divisi.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 10)); // NOI18N
        divisi.setForeground(new java.awt.Color(2, 0, 75));
        divisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        divisi.setText("Logistik");

        evtName.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 10)); // NOI18N
        evtName.setForeground(new java.awt.Color(2, 0, 75));
        evtName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        evtName.setText("Masa Bimbingan RPL");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 153, 153));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        nama.setEditable(false);
        nama.setColumns(20);
        nama.setLineWrap(true);
        nama.setRows(5);
        nama.setBorder(null);
        nama.setFocusable(false);
        jScrollPane2.setViewportView(nama);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(evtName, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 87, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(divisi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evtName)
                    .addComponent(divisi))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
        int confirm = JOptionPane.showConfirmDialog(evtName, "Yakin untuk menandai tugas ini selesai?", "Set Status Tugas", JOptionPane.WARNING_MESSAGE);
        if (confirm == 0) {
            updateStatus();
        }
    }//GEN-LAST:event_checkMouseClicked

    private void updateStatus(){
        String query = "UPDATE task_table SET status = 1 WHERE id_tugas = "+ idTugas;
        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(evtName, "Berhasil Diubah", "Informasi Update Status", JOptionPane.INFORMATION_MESSAGE);
            
            parent.refreshData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel check;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JLabel divisi;
    private javax.swing.JLabel evtName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea nama;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
