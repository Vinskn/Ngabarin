package NgabarinUTS;

import java.awt.Color;
import utils.RoundedBorder;
import utils.SupabaseAPI;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        
        senduser.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        sendTasks.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        sendMembers.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        sendEvent.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        sendDivisions.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        sendReports.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        senduser = new javax.swing.JButton();
        sendTasks = new javax.swing.JButton();
        sendMembers = new javax.swing.JButton();
        sendEvent = new javax.swing.JButton();
        sendDivisions = new javax.swing.JButton();
        sendReports = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 80, 80));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN DASHBOARD");

        jSeparator1.setForeground(new java.awt.Color(3, 11, 233));

        senduser.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        senduser.setText("Backup Users Data");
        senduser.setBorder(null);
        senduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senduserMouseClicked(evt);
            }
        });

        sendTasks.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        sendTasks.setText("Backup Tasks Data");
        sendTasks.setBorder(null);
        sendTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendTasksMouseClicked(evt);
            }
        });

        sendMembers.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        sendMembers.setText("Backup Members Data");
        sendMembers.setBorder(null);
        sendMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMembersMouseClicked(evt);
            }
        });

        sendEvent.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        sendEvent.setText("Backup Event Data");
        sendEvent.setBorder(null);
        sendEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendEventMouseClicked(evt);
            }
        });

        sendDivisions.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        sendDivisions.setText("Backup Divisions Data");
        sendDivisions.setBorder(null);
        sendDivisions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendDivisionsMouseClicked(evt);
            }
        });

        sendReports.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        sendReports.setText("Backup Reports Data");
        sendReports.setBorder(null);
        sendReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendReportsMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 54, 54));
        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jButton1.setText("Exit");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendReports, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendDivisions, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senduser, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 421, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(senduser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(sendTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(sendMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(sendEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(sendDivisions, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(sendReports, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senduserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senduserMouseClicked
        SupabaseAPI.postTableData("user_table");
    }//GEN-LAST:event_senduserMouseClicked

    private void sendTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendTasksMouseClicked
        SupabaseAPI.postTableData("task_table");
    }//GEN-LAST:event_sendTasksMouseClicked

    private void sendMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMembersMouseClicked
        SupabaseAPI.postTableData("member_table");
    }//GEN-LAST:event_sendMembersMouseClicked

    private void sendEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendEventMouseClicked
        SupabaseAPI.postTableData("event_table");
    }//GEN-LAST:event_sendEventMouseClicked

    private void sendDivisionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendDivisionsMouseClicked
        SupabaseAPI.postTableData("divisi_table");
    }//GEN-LAST:event_sendDivisionsMouseClicked

    private void sendReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendReportsMouseClicked
        SupabaseAPI.postTableData("finished_event");
    }//GEN-LAST:event_sendReportsMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton sendDivisions;
    private javax.swing.JButton sendEvent;
    private javax.swing.JButton sendMembers;
    private javax.swing.JButton sendReports;
    private javax.swing.JButton sendTasks;
    private javax.swing.JButton senduser;
    // End of variables declaration//GEN-END:variables
}
