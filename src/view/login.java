/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LoginController;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import models.query;

/**
 *
 * @author hima1993
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        log_usr_name = new javax.swing.JTextField();
        log_passwrd = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        frgt_paswrd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 90, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 80, 30));

        log_usr_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_usr_nameActionPerformed(evt);
            }
        });
        getContentPane().add(log_usr_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 150, 30));
        getContentPane().add(log_passwrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, 30));

        login.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        reset.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 0, 255));
        reset.setText("Clear");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        frgt_paswrd.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        frgt_paswrd.setForeground(new java.awt.Color(0, 0, 153));
        frgt_paswrd.setText("Forget Password");
        frgt_paswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frgt_paswrdActionPerformed(evt);
            }
        });
        getContentPane().add(frgt_paswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/hospital.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 430, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_usr_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_usr_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_log_usr_nameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        log_usr_name.setText("");
        log_passwrd.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void frgt_paswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frgt_paswrdActionPerformed
        try {
            // TODO add your handling code here:
            String pin = JOptionPane.showInputDialog(rootPane, "Enter the Pin Code", "pin", JOptionPane.QUESTION_MESSAGE);
            int p = Integer.parseInt(pin);
            String username = log_usr_name.getText();
            ResultSet j = query.thequery_search("select * from employee where pin_code='" + p + "'and emp_username='" + username + "'");
            if (j.next()) {
                log_usr_name.setText("");
                log_passwrd.setText("");
                close();
                menu mn = new menu();
                mn.setVisible(true);
            }else{JOptionPane.showMessageDialog(null, "Pin code incoreect !! Please enter the valid Pin code ", "Wrong Pass", JOptionPane.ERROR_MESSAGE);
}
        } catch (Exception ex) {
           
        }

    }//GEN-LAST:event_frgt_paswrdActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            ResultSet m = query.thequery_search("select * from employee ");
            if (m.next()) {
                String currentpass = null;
                String username = log_usr_name.getText();
                String password = log_passwrd.getText();
                ResultSet j = query.thequery_search("select * from employee where emp_username='" + username + "'and emp_password='" + password + "'");

                if (j.next()) {
                   
                    currentpass= j.getString("emp_password");
                    System.out.println(currentpass);
                    
                    log_usr_name.setText("");
                    log_passwrd.setText("");
                    close();
                    menu mn = new menu(currentpass);
                    mn.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Password or User Name is Incorrect !! \n Click Ok and Try Again ", "Wrong Pass", JOptionPane.ERROR_MESSAGE);

                }

            } else {
                close();
                menu mn = new menu();
                mn.setVisible(true);

            }
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_loginActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    private void close() {
        WindowEvent winclosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosing);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton frgt_paswrd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField log_passwrd;
    private javax.swing.JTextField log_usr_name;
    private javax.swing.JButton login;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}