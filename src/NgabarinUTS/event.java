package NgabarinUTS;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Event extends javax.swing.JFrame {

    SQLConnection connect;
    private javax.swing.JTextField txtNamaEvent;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextArea txtDeskripsi;
        
    public Event() {
        txtNamaEvent = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtDeskripsi = new javax.swing.JTextArea();
        initComponents();
        connect = new SQLConnection();       
        setSize(1120, 820);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        
        tampilEvent();
        isiComboBox();
        
        jComboBox1.addActionListener(e -> filterEvent());
        jComboBox2.addActionListener(e -> filterEvent());
        
        getContentPane().add(txtNamaEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 200, 30));
        getContentPane().add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 200, 30));
        getContentPane().add(txtDeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 200, 60));


    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dummyAddEvt = new javax.swing.JButton();
        navbar1 = new NgabarinUTS.Navbar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        headerPanel.setPreferredSize(new java.awt.Dimension(586, 95));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Selamat datang kembali! Lihat ringkasan event dan");
        jLabel2.setIconTextGap(0);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("aktivitas terbaru anda");
        jLabel3.setIconTextGap(0);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(dummyAddEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(dummyAddEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(820, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(navbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(575, 100));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 273, 802));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/Frame 444.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, -1));

        jTextField1.setText("Cari Event");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 390, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/Frame 486.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("aktivitas seru Anda!");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Tambah event baru sekarang dan mulai rencanakan ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("Event");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/Frame 484.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NgabarinUTS/assets/rectangle.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 710, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 130, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = txtNamaEvent.getText();
        String tanggal = txtTanggal.getText();
        String deskripsi = txtDeskripsi.getText();

        try {
            Connection conn = connect.con;
            PreparedStatement pst = conn.prepareStatement("INSERT INTO event_table (nama_event, tanggal_pelaksanaan, deskripsi) VALUES (?, ?, ?)");
            pst.setString(1, nama);
            pst.setString(2, tanggal);
            pst.setString(3, deskripsi);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Event berhasil ditambahkan");
            tampilEvent(); // Refresh tabel
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menambah event: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String keyword = jTextField1.getText();
        cariEvent(keyword);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cariEvent(String keyword) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Event");
        model.addColumn("Tanggal");
        model.addColumn("Deskripsi");

        try {
            Connection conn = connect.con;
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM event_table WHERE nama_event LIKE ?");
            pst.setString(1, "%" + keyword + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nama_event"),
                    rs.getString("tanggal_pelaksanaan"),
                    rs.getString("deskripsi")
                });
            }

            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mencari data: " + e.getMessage());
        }
    }
    
   
    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Event().setVisible(true);
            }
        });
    }
    
    private void tampilEvent() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Event");
        model.addColumn("Tanggal");
        model.addColumn("Deskripsi");

        try {
            Connection conn = connect.con; // kalau pakai SQLConnection connect = new SQLConnection()
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM event_table");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nama_event"),
                    rs.getString("tanggal_pelaksanaan"),
                    rs.getString("deskripsi")
                });
            }

            jTable1.setModel(model); // Ganti eventTabel sesuai nama JTable kamu
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal load data: " + e.getMessage());
        }
    }
    
    private void isiComboBox() {
        try {
            Connection conn = connect.con;
            Statement stmt = conn.createStatement();

            // Isi ComboBox1 (Nama Event)
            ResultSet rs1 = stmt.executeQuery("SELECT DISTINCT nama_event FROM event_table");
            jComboBox1.removeAllItems();
            jComboBox1.addItem("Semua");
            while (rs1.next()) {
                jComboBox1.addItem(rs1.getString("nama_event"));
            }

            // Isi ComboBox2 (Tanggal)
            ResultSet rs2 = stmt.executeQuery("SELECT DISTINCT tanggal_pelaksanaan FROM event_table");
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Semua");
            while (rs2.next()) {
                jComboBox2.addItem(rs2.getString("tanggal_pelaksanaan"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal isi ComboBox: " + e.getMessage());
        }
    }
    
    private void filterEvent() {
        String namaDipilih = (String) jComboBox1.getSelectedItem();
        String tanggalDipilih = (String) jComboBox2.getSelectedItem();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Event");
        model.addColumn("Tanggal");
        model.addColumn("Deskripsi");

        try {
            Connection conn = connect.con;
            String sql = "SELECT * FROM event_table WHERE 1=1";
            if (!"Semua".equals(namaDipilih)) sql += " AND nama_event = ?";
            if (!"Semua".equals(tanggalDipilih)) sql += " AND tanggal_pelaksanaan = ?";

            PreparedStatement pst = conn.prepareStatement(sql);
            int paramIndex = 1;
            if (!"Semua".equals(namaDipilih)) pst.setString(paramIndex++, namaDipilih);
            if (!"Semua".equals(tanggalDipilih)) pst.setString(paramIndex++, tanggalDipilih);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nama_event"),
                    rs.getString("tanggal_pelaksanaan"),
                    rs.getString("deskripsi")
                });
            }

            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal filter data: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dummyAddEvt;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private NgabarinUTS.Navbar navbar1;
    // End of variables declaration//GEN-END:variables
}
