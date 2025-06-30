/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NgabarinUTS;

import com.formdev.flatlaf.FlatLightLaf;
import utils.RoundedBorder;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Svin
 */
public class Signup extends javax.swing.JFrame {
    SQLConnection connect;
    
    public Signup() {
        connect = new SQLConnection();
        initComponents();        
        setSize(1120, 820); 
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        
        namaDpn.putClientProperty("JTextField.placeholderText", "Masukan Nama Depan");
        namaDpn.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
         
        namaBlkg.putClientProperty("JTextField.placeholderText", "Masukan Nama Belakang");
        namaBlkg.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        
        email.putClientProperty("JTextField.placeholderText", "ex: user@gmail.com");
        email.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        
        username.putClientProperty("JTextField.placeholderText", "Pilih Username Unik");
        username.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        
        password.putClientProperty("JTextField.placeholderText", "Masukan password yang kuat");
        password.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        
        confirmPass.putClientProperty("JTextField.placeholderText", "Ulangi Password");
        confirmPass.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
        
        // formating bg               
        bg_left.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/assets/Rectangle 1.png"))
            .getImage()
            .getScaledInstance(bg_left.getWidth(), bg_left.getHeight(), Image.SCALE_SMOOTH)
        ));
        
        titleImg.setIcon(new ImageIcon(
                new ImageIcon(getClass().getResource("/assets/Frame 5.png"))
                .getImage()
                .getScaledInstance(titleImg.getWidth(), titleImg.getHeight(), Image.SCALE_SMOOTH)
        ));
        
        submitBtn.setIcon(new ImageIcon(
               new ImageIcon(getClass().getResource("/assets/Frame 425.png"))
               .getImage()
               .getScaledInstance(submitBtn.getWidth(), submitBtn.getHeight(), Image.SCALE_SMOOTH) 
        ));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleImg = new javax.swing.JLabel();
        bg_left = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaDpn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namaBlkg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        confirmPass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radioBtn = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1120, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleImg.setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().add(titleImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 370, 370));

        bg_left.setBackground(new java.awt.Color(0, 204, 204));
        bg_left.setForeground(new java.awt.Color(255, 255, 255));
        bg_left.setOpaque(true);
        getContentPane().add(bg_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 800));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 210, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Buat akun baru untuk mulai mengelola event anda");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nama Depan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        namaDpn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(namaDpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 190, 40));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nama Belakang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, 20));

        namaBlkg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(namaBlkg, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 190, 40));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 230, -1));

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 400, 40));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 400, 40));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 230, -1));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 400, 40));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 230, -1));

        confirmPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(confirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 400, 40));

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Konfirmasi Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 230, -1));

        radioBtn.setBackground(new java.awt.Color(255, 255, 255));
        radioBtn.setForeground(new java.awt.Color(153, 153, 153));
        radioBtn.setText("Saya menyetujui syarat dan ketentuan serta kebijakan privasi");
        getContentPane().add(radioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, -1));

        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 300, 40));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Sudah punya akun? ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Masuk disini");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 650, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        if (inputValidation()) {
            if (insertData()) {
                JOptionPane.showMessageDialog(rootPane, "User Berhasil Ditambah", "Success", JOptionPane.INFORMATION_MESSAGE);
                new Login().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_submitBtnMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private Boolean inputValidation(){
        if (namaDpn.getText().equals("") || namaBlkg.getText().equals("") || email.getText().equals("") || username.getText().equals("") || password.getText().equals("") || confirmPass.getText().equals("") || radioBtn.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "Isi Semua Input", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if (!password.getText().equals(confirmPass.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Password Tidak Sama", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } return true;
    }
    
    private Boolean insertData(){
        String namaDepan = namaDpn.getText();
        String namaBelakang = namaBlkg.getText();
        String email = this.email.getText();
        String uname = username.getText();
        String pass = password.getText();
        
        String query = "INSERT INTO user_table (nama_depan, nama_belakang, email, username, password) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = connect.con.prepareStatement(query);
            pstmt.setString(1, namaDepan);
            pstmt.setString(2, namaBelakang);
            pstmt.setString(3, email);
            pstmt.setString(4, uname);
            pstmt.setString(5, pass);
            
            pstmt.executeUpdate();
            
            connect.con.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Err: " + e.getMessage());
            return false;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_left;
    private javax.swing.JTextField confirmPass;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField namaBlkg;
    private javax.swing.JTextField namaDpn;
    private javax.swing.JTextField password;
    private javax.swing.JRadioButton radioBtn;
    private javax.swing.JLabel submitBtn;
    private javax.swing.JLabel titleImg;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
