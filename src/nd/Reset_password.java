/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author timworld
 */
public class Reset_password extends javax.swing.JFrame {
    public static Main m = new Main();
    int ck =0;
    /**
     * Creates new form Reset_password
     */
    public Reset_password() {
        initComponents();
        er.setVisible(false);
        er1.setVisible(false);
        btok1.setVisible(false);
        textpass.setVisible(false);
        textpass1.setVisible(false);
        passja.setVisible(false);
        passja1.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        btok = new javax.swing.JButton();
        er = new javax.swing.JLabel();
        textpass = new javax.swing.JLabel();
        textpass1 = new javax.swing.JLabel();
        btok1 = new javax.swing.JButton();
        er1 = new javax.swing.JLabel();
        passja = new javax.swing.JPasswordField();
        passja1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(84, 22, 108));
        jLabel2.setText("ลืมรหัสผ่าน");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("รหัสไอดี");

        tel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("เบอร์โทร");

        tfusername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusernameActionPerformed(evt);
            }
        });

        btok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btok.setText("ตกลง");
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });

        er.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        er.setForeground(new java.awt.Color(255, 0, 0));
        er.setText("ไม่พบ");

        textpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textpass.setText("รหัสผ่าน");

        textpass1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textpass1.setText("ยืนยันรหัสผ่าน");

        btok1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btok1.setText("ตกลง");
        btok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btok1ActionPerformed(evt);
            }
        });

        er1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        er1.setForeground(new java.awt.Color(255, 0, 0));
        er1.setText("รหัสผ่านไม่ตรง");

        passja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passjaActionPerformed(evt);
            }
        });

        passja1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passja1ActionPerformed(evt);
            }
        });
        passja1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passja1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(er1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btok1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(textpass1)
                            .addComponent(textpass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(er)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btok, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passja1)
                            .addComponent(tfusername)
                            .addComponent(passja)
                            .addComponent(tel))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er)
                    .addComponent(btok))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textpass)
                    .addComponent(passja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textpass1)
                    .addComponent(passja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er1)
                    .addComponent(btok1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
 Connection con = m.connectDB();
    PreparedStatement pst;
      try {      
            pst = con.prepareStatement("select staff_id,staff_pw from staff where staff_id=? and s_tel=?");
            String username = tfusername.getText();
            String password = tel.getText();
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()==false)
                {
                    JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                    tfusername.setText("");
                    tel.setText(""); 
                     er.setVisible(true);
                }
            else
                {
                     er.setVisible(false);
                     btok.setVisible(false);
                 btok1.setVisible(true);            
                textpass.setVisible(true);
                textpass1.setVisible(true);
                passja.setVisible(true);
                passja1.setVisible(true);
                     
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_login.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btokActionPerformed

    private void btok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btok1ActionPerformed
if(ck==0){
    Connection con = m.connectDB();
PreparedStatement pst;
try {
    pst = con.prepareStatement("UPDATE staff SET staff_pw=? WHERE staff_id=? ");
    String username = passja1.getText();
    String password = tfusername.getText();
    pst.setString(1, username);
    pst.setString(2, password);
    int affectedRows = pst.executeUpdate();
    if (affectedRows == 0) {
        JOptionPane.showMessageDialog(this, "Sorry, Record Not Found");
        passja1.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "OK");
        setVisible(false);
    }

} catch (SQLException ex) {
    Logger.getLogger(Reset_password.class.getName()).log(Level.SEVERE, null, ex);
}

}
else{
    JOptionPane.showMessageDialog(this, "CK >0");
}

    }//GEN-LAST:event_btok1ActionPerformed

    private void passjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passjaActionPerformed

    private void passja1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passja1KeyReleased
String pass = passja.getText();
String pass1 = passja1.getText();
        if(pass.equals(pass1))  {      
 ck=0;
 er1.setVisible(false);
}
else{
    ck=1;
    er1.setVisible(true);
}

    }//GEN-LAST:event_passja1KeyReleased

    private void passja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passja1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passja1ActionPerformed

    private void tfusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfusernameActionPerformed

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
            java.util.logging.Logger.getLogger(Reset_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reset_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reset_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reset_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reset_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btok;
    private javax.swing.JButton btok1;
    private javax.swing.JLabel er;
    private javax.swing.JLabel er1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passja;
    private javax.swing.JPasswordField passja1;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel textpass;
    private javax.swing.JLabel textpass1;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
