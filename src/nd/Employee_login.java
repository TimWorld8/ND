/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nd;///Bird ddds adsfgsdfgdfsg   TimWorld
=======
package nd;///Bird ddds adsfgsdfgdfsg โหล โหล เทส
>>>>>>> 84b18b0cc80a6bd73050102555d3310f0bb9b2ee

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static nd.ND.connectDB;

/**
 *
 * @author User
 */
public class Employee_login extends javax.swing.JFrame {
     
     
    /**
     * Creates new form Employee_login
     */
     
    
    
     
   
    
    public Employee_login() {
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NDClinic = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        tfpassword = new javax.swing.JTextField();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        btlogin = new javax.swing.JButton();
        lbresetpw = new javax.swing.JLabel();
        lbregister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 540));

        NDClinic.setText("ND Clinic");

        tfusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusernameActionPerformed(evt);
            }
        });

        tfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpasswordActionPerformed(evt);
            }
        });

        Username.setText(" username kub");

        Password.setText("Password");

        btlogin.setText("log in");
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });

        lbresetpw.setText("reset password");

        lbregister.setText("register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btlogin)
                            .addComponent(NDClinic)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lbregister)))
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(tfusername))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbresetpw)
                        .addGap(118, 118, 118))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(NDClinic, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(btlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbresetpw, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbregister)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpasswordActionPerformed

    private void tfusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfusernameActionPerformed

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
        // TODO add your handling code here:
    Connection con = connectDB();
    PreparedStatement pst;
      try {      
            pst = con.prepareStatement("select staff_id,staff_pw from staff where staff_id=? and staff_pw=?");
            String username = tfusername.getText();
            String password = tfpassword.getText();
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()==false)
                {
                    JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                    tfusername.setText("");
                    tfpassword.setText("");               
                }
            else
                {
                     new Employee_menu().setVisible(true);
                     setVisible(false);
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btloginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NDClinic;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btlogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbregister;
    private javax.swing.JLabel lbresetpw;
    private javax.swing.JTextField tfpassword;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
