package NgabarinUTS;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.sql.ResultSet;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import utils.GlobalState;
import utils.progressCard;

public class Progress extends javax.swing.JFrame {
    SQLConnection connect;
    
    private int countCompltTask = 0;
    private int totalTasks = 0;
    
    public Progress() {
        initComponents();        
        setSize(1120, 820);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        
        panelData.setLayout(new BoxLayout(panelData, BoxLayout.Y_AXIS));
        
        bg.setIcon(new FlatSVGIcon("assets/cardBg.svg", bg.getWidth() + 5, bg.getHeight() + 5));
        
        getData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar1 = new NgabarinUTS.Navbar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        percent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelData = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1120, 820));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("Progress Tugas");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Tugas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Deskripsi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 70, 30));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 790, 46));

        progressBar.setBackground(new java.awt.Color(255, 204, 204));
        progressBar.setForeground(new java.awt.Color(102, 255, 102));

        percent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        percent.setText("70%");
        percent.setPreferredSize(new java.awt.Dimension(52, 16));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(117, 117, 117));
        jLabel5.setText("Progress Keseluruhan");
        jLabel5.setPreferredSize(new java.awt.Dimension(145, 16));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelData.setBackground(new java.awt.Color(255, 255, 255));
        panelData.setLayout(new javax.swing.BoxLayout(panelData, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(panelData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(percent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(navbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void getData(){
        int userID = GlobalState.getUserID();
        
        String query = "CALL GetTasks_uid("+ userID +")";
        try {
            connect = new SQLConnection();
            java.sql.Statement st = connect.con.createStatement();
            boolean hasResults = st.execute(query);
            
            if (hasResults) {
                ResultSet res = st.getResultSet();
                while (res.next()) {                
                    progressCard data = new progressCard(
                            res.getString("nama_tugas"),
                            res.getString("deskripsi_tugas"),
                            res.getString("nama_event"),
                            res.getString("nama_divisi"),
                            res.getInt("status_tugas"),
                            res.getInt("id_tugas"),
                            this
                    );
                    panelData.add(data);
                    panelData.add(Box.createVerticalStrut(10));
                    
                    if (res.getInt("status_tugas") == 1) {
                        countCompltTask ++;
                    }
                }
                res.close();
            }
            
            if (st.getMoreResults()) {
                ResultSet res2 = st.getResultSet();
                if (res2.next()) {
                    totalTasks = res2.getInt("total_tasks_for_user");
                }
                res2.close();
            }
            
            st.close();
            connect.con.close();
        } catch (Exception e) {
            System.out.println("Gagal Mengambil data" + e.getMessage());
        }
        handleProgressbar();
    }
    
    private void handleProgressbar() {
        System.out.println(countCompltTask);
        System.out.println(totalTasks);
        
        if (totalTasks > 0) {
            int calc = (int) (((double) countCompltTask / totalTasks) * 100);
            progressBar.setValue(calc);
            percent.setText(calc + "%");
        } else {
            progressBar.setValue(0);
            percent.setText("0%");
        }
    }
    
    public void refreshData() {
        panelData.removeAll();
        countCompltTask = 0;
        totalTasks = 0;
        getData();
        panelData.revalidate();
        panelData.repaint();
    }

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private NgabarinUTS.Navbar navbar1;
    private javax.swing.JPanel panelData;
    private javax.swing.JLabel percent;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
