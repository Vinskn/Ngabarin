
package NgabarinUTS;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import utils.AnggotaCard;
import utils.GlobalState;

public class Anggota extends javax.swing.JFrame {
    SQLConnection connect;
    private int getEventID;

    public Anggota() {
        initComponents();
        setSize(1120, 820);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);

        bg.setIcon(new FlatSVGIcon("assets/cardBg.svg", bg.getWidth() + 5, bg.getHeight() + 5));

        dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.Y_AXIS));

        if (checkLeader()) {
            setVisible(true);
            getData();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Anda Bukan ketua event, tidak bisa akses");
            this.dispose();
            new Dashboard().setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar1 = new NgabarinUTS.Navbar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        divisi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("Divisi dan Anggota");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tambah Divisi");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(176, 176, 176));
        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221, 219, 219));
        jLabel3.setText("Kode Divisi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(176, 176, 176));
        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 219, 219));
        jLabel4.setText("Nama Divisi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, -1));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 773, 38));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
                dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 717, Short.MAX_VALUE));
        dataPanelLayout.setVerticalGroup(
                dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 407, Short.MAX_VALUE));

        jScrollPane1.setViewportView(dataPanel);

        jButton1.setText("Tambah");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(navbar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(42, 42, 42)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addGap(32, 32, 32)
                                                                                .addComponent(divisi,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        326,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(36, 36, 36)
                                                                                .addComponent(jButton1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        117,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 15, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(navbar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(divisi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addGap(62, 62, 62)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked
        String query = "INSERT INTO divisi_table (nama_divisi, jumlah_anggota, event_id) VALUES ('"
                + divisi.getText() + "', "
                + 0 + ", "
                + getEventID + ")";

        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(rootPane, "Divisi Berhasil Ditambah", "Berhasil",JOptionPane.INFORMATION_MESSAGE);
            refreshData();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }// GEN-LAST:event_jButton1MouseClicked

    
    private boolean checkLeader() {
        int globalUsrID = GlobalState.getUserID();
        System.out.println(globalUsrID);
        String query = "SELECT * FROM event_table WHERE id_ketuaEvent = " + globalUsrID;
        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                if (res.getInt("id_ketuaEvent") == globalUsrID) {
                    getEventID = res.getInt("eventID");
                    connect.con.close();
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Gagal Mengambil data" + e.getMessage());
        }
        return false;
    }

    private void getData() {
        String query = "SELECT * FROM divisi_table WHERE event_id = " + getEventID;

        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            ResultSet res = st.executeQuery(query);

            while (res.next()) {
                AnggotaCard data = new AnggotaCard(
                        getEventID,
                        res.getInt("id_divisi"),
                        res.getString("nama_divisi"),
                        this);

                dataPanel.add(data);
                dataPanel.add(Box.createVerticalStrut(10));
            }

            connect.con.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void refreshData() {
        dataPanel.removeAll();
        getData();
        dataPanel.revalidate();
        dataPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JTextField divisi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private NgabarinUTS.Navbar navbar1;
    // End of variables declaration//GEN-END:variables
}
