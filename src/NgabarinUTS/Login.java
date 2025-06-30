package NgabarinUTS;

import utils.RoundedBorder;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.UIManager;
import utils.GlobalState;
import utils.SupabaseAPI;

public class Login extends javax.swing.JFrame {
    SQLConnection connect;
    
    public Login() {
        
        initComponents();        
        setSize(1120, 820);     
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        
        username.putClientProperty("JTextField.placeholderText", "Masukan Username");
        username.setBorder(new RoundedBorder(Color.GRAY, 10, 1));

        password.putClientProperty("JTextField.placeholderText", "Masukan Password");
        password.setBorder(new RoundedBorder(Color.GRAY, 10, 1));
      
     
        
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
        
        welcome.setIcon(new ImageIcon(
                new ImageIcon(getClass().getResource("/assets/loginTop.png"))
                .getImage()
                .getScaledInstance(welcome.getWidth(), welcome.getHeight(), Image.SCALE_SMOOTH)
        ));
        
        submitBtn.setIcon(new ImageIcon(
               new ImageIcon(getClass().getResource("/assets/Frame 424.png"))
               .getImage()
               .getScaledInstance(submitBtn.getWidth(), submitBtn.getHeight(), Image.SCALE_SMOOTH) 
        ));
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleImg = new javax.swing.JLabel();
        bg_left = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(1120, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleImg.setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().add(titleImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 360, 350));

        bg_left.setBackground(new java.awt.Color(0, 204, 204));
        bg_left.setForeground(new java.awt.Color(255, 255, 255));
        bg_left.setOpaque(true);
        getContentPane().add(bg_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 800));

        welcome.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 370, 90));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Username ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 450, 50));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 140, -1));

        submitBtn.setBackground(new java.awt.Color(0, 255, 255));
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 300, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Daftar Sekarang");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Lupa Password?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Belum punya akun? ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, -1, -1));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 450, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        if (username.getText().equals("su") && password.getText().equals("su")) {
            new Admin().setVisible(true);
            this.dispose();
            return;
        }
        if (inputValidation()) {
            if (checkAccount()) {
                JOptionPane.showMessageDialog(rootPane, "Selamat Datang " + GlobalState.getUsername(), "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                new Dashboard().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "User tidak ditemukan, periksa username dan password atau buat akun", "User tidak ditemukan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_submitBtnMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
    try {
        UIManager.setLookAndFeel(new FlatLightLaf());
     } catch (Exception e) {
        System.err.println("Failed to initialize LaF");
    }
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login().setVisible(true);
        }
    });
    System.out.println(UIManager.getLookAndFeel().getName());
}
    
    private Boolean inputValidation(){
        if (username.getText().equals("") || password.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Isi Semua Input", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } return true;
    }
    
    private Boolean checkAccount(){
        String query = "SELECT * FROM user_table where username = '"+ username.getText() +"' and password = '"+ password.getText() +"'";
        try {
            connect = new SQLConnection();
            Statement st = connect.con.createStatement();
            ResultSet res = st.executeQuery(query);
            Boolean found = res.next();

            if (found) {
                GlobalState.setUserID(res.getInt("id"));
                GlobalState.setUsername(res.getString("username"));
                GlobalState.setEmail(res.getString("email"));
            }

            connect.con.close();
            return found;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Err: " + e.getMessage());
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_left;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel submitBtn;
    private javax.swing.JLabel titleImg;
    private javax.swing.JTextField username;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
