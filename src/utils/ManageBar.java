package utils;

import com.formdev.flatlaf.extras.FlatSVGIcon;

public class ManageBar extends javax.swing.JPanel {
    private String judul_param;
    private String divisi_param;
    private int status_param;
    
    public ManageBar(String judul_param, String divisi_param, int status_param) {
        initComponents();
        judul.setText(judul_param);
        divisi.setText(divisi_param);
        if (status_param == 0) {
            status.setIcon(new FlatSVGIcon("assets/manage_belum.svg", 95, 26));
        } else {
            status.setIcon(new FlatSVGIcon("assets/manage_selesai.svg", 95, 26));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        divisi = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(754, 38));

        judul.setText("Menyusun Agenda Acara");

        divisi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        divisi.setText("Acara");

        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(divisi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divisi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(judul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel divisi;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
