package utils;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JOptionPane;


public class progressCard extends javax.swing.JPanel {

    private String judul_param = "Menyusun Agenda";
    private String deskripsi_param = "Masa Bimbingan RPL adalah kegiatan pengenalan \n" +
                                        "jurusan bagi siswa baru untuk memahami \n" +
                                        "dasarpemrograman, aturan jurusan, \n" +
                                        "dan membangun kekompakan.";
    private int status_param = 1;
//    , String deskripsi_param, int status_param
    public progressCard(String judul_param) {
        
        this.judul_param = judul_param;
        
        initComponents();
        nama.setText(judul_param);
        deskripsi.setText(deskripsi_param);
                
        if (status_param == 0) {
            status.setIcon(new FlatSVGIcon("assets/manage_selesai.svg", 90, 35));
        } else {
            status.setIcon(new FlatSVGIcon("assets/manage_belum.svg", 90, 35));
        }
        
        check.setIcon(new FlatSVGIcon("assets/done.svg", 35, 35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        nama = new javax.swing.JLabel();
        check = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(790, 100));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        status.setText("TAk Tahu");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        deskripsi.setEditable(false);
        deskripsi.setColumns(20);
        deskripsi.setLineWrap(true);
        deskripsi.setRows(5);
        deskripsi.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab");
        deskripsi.setBorder(null);
        deskripsi.setFocusable(false);
        jScrollPane1.setViewportView(deskripsi);

        nama.setText("TAk Tahu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        JOptionPane.showMessageDialog(jScrollPane1, nama.getText());
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel check;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
