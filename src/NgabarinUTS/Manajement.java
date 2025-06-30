package NgabarinUTS;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import utils.Dash_cardEvt;
import utils.GlobalState;
import utils.ManageBar;
import utils.RoundedBorder;

public class Manajement extends javax.swing.JFrame {
    SQLConnection connect;
    private int leaderingEvt;
    public Manajement() {
        initComponents();        
        setSize(1120, 820);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        
        dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.Y_AXIS));
        
        addBtn.setIcon(new FlatSVGIcon("assets/tambahBtn.svg", addBtn.getWidth(), addBtn.getHeight()));
        tugas.putClientProperty("JTextField.placeholderText", "Judul Tugas");
        tugas.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        divisi.putClientProperty("JTextField.placeholderText", "Masukan Divisi (Case Sensitive)");
        divisi.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        deskripsi.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        
        tabelHeader.setIcon(new FlatSVGIcon("assets/tableHeaderManajement.svg", tabelHeader.getWidth() + 3, tabelHeader.getHeight() + 3));
        
        if (checkLeader()) {
            setVisible(true);
            showTasksData();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Anda bukan ketua Event, buat event untuk akses halaman ini", "Tidak bisa Akses", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new Dashboard().setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar1 = new NgabarinUTS.Navbar();
        jLabel1 = new javax.swing.JLabel();
        formAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        divisi = new javax.swing.JTextField();
        tugas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        addBtn = new javax.swing.JLabel();
        tabelHeader = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1120, 820));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("Manajemen Tugas");

        formAdd.setBackground(new java.awt.Color(235, 235, 235));
        formAdd.setForeground(new java.awt.Color(98, 98, 98));
        formAdd.setPreferredSize(new java.awt.Dimension(780, 250));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(98, 98, 98));
        jLabel2.setText("Tambah Tugas");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(98, 98, 98));
        jLabel3.setText("Divisi");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(98, 98, 98));
        jLabel4.setText("Deskripsi");

        divisi.setBackground(new java.awt.Color(235, 235, 235));
        divisi.setBorder(null);

        tugas.setBackground(new java.awt.Color(235, 235, 235));
        tugas.setBorder(null);
        tugas.setOpaque(true);

        jScrollPane1.setBorder(null);

        deskripsi.setBackground(new java.awt.Color(235, 235, 235));
        deskripsi.setColumns(20);
        deskripsi.setRows(5);
        deskripsi.setBorder(null);
        jScrollPane1.setViewportView(deskripsi);

        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formAddLayout = new javax.swing.GroupLayout(formAdd);
        formAdd.setLayout(formAddLayout);
        formAddLayout.setHorizontalGroup(
            formAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAddLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(formAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(divisi, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                        .addComponent(tugas)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(formAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        formAddLayout.setVerticalGroup(
            formAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAddLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(formAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(formAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formAddLayout.createSequentialGroup()
                        .addComponent(tugas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tabelHeader.setBackground(new java.awt.Color(204, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(102, 102, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        dataPanel.setBackground(new java.awt.Color(204, 255, 51));
        dataPanel.setOpaque(false);
        dataPanel.setLayout(new javax.swing.BoxLayout(dataPanel, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(dataPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(formAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                                .addComponent(tabelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(navbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(formAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tabelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        String query = "CALL upsertTasks('"
            + tugas.getText() + "','"
            + deskripsi.getText() + "',"
            + 0 + ",'"
            + divisi.getText() + "',"
            + leaderingEvt + ")";

        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Tugas Ditambahkan", "Informasi Tambah Tugas", JOptionPane.INFORMATION_MESSAGE);
            
            tugas.setText("");
            deskripsi.setText("");
            divisi.setText("");
            
            dataPanel.removeAll();
            dataPanel.revalidate();
            dataPanel.repaint();
            showTasksData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL: " + e.getMessage());
        }
    }//GEN-LAST:event_addBtnMouseClicked

    
    private boolean checkLeader(){
        int globalUsrID = GlobalState.getUserID();
        String query = "SELECT * FROM event_table WHERE id_ketuaEvent = " + globalUsrID;
        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            ResultSet res = st.executeQuery(query); 
            while (res.next()) {                
                if (res.getInt("id_ketuaEvent") == globalUsrID) {
                    leaderingEvt = res.getInt("eventID");
                    return true;
                } 
            }
            connect.con.close();
        } catch (Exception e) {
            System.out.println("Gagal Mengambil data" + e.getMessage());
        }
        return false;
    }
    
    private void showTasksData(){
        String query = "CALL GetTasksByEventID("+ leaderingEvt +")";
        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            ResultSet res = st.executeQuery(query); 
            while (res.next()) {                
                ManageBar barData = new ManageBar(
                        res.getString("nama_tugas"),
                        res.getString("nama_divisi"),
                        res.getInt("status")
                );
                dataPanel.add(barData);
                dataPanel.add(Box.createVerticalStrut(10));
            }
            connect.con.close();
        } catch (Exception e) {
            System.out.println("Gagal Mengambil data" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JTextField divisi;
    private javax.swing.JPanel formAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private NgabarinUTS.Navbar navbar1;
    private javax.swing.JLabel tabelHeader;
    private javax.swing.JTextField tugas;
    // End of variables declaration//GEN-END:variables
}
