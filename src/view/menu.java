/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author hima1993
 */
public class menu extends javax.swing.JFrame {
    String curren = null;
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }
    public menu(String pass){
        
    curren = pass;
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

        attendance = new javax.swing.JButton();
        person_mng = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        ward = new javax.swing.JButton();
        service = new javax.swing.JButton();
        admission = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendance.setBackground(new java.awt.Color(204, 204, 255));
        attendance.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        attendance.setText("Attendance");
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });
        getContentPane().add(attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 160, 40));

        person_mng.setBackground(new java.awt.Color(0, 0, 204));
        person_mng.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        person_mng.setText("Person Management");
        person_mng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_mngActionPerformed(evt);
            }
        });
        getContentPane().add(person_mng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 160, 40));

        payment.setBackground(new java.awt.Color(51, 51, 255));
        payment.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        payment.setText("Payment");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 160, 40));

        ward.setBackground(new java.awt.Color(102, 102, 255));
        ward.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ward.setText("Ward");
        ward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardActionPerformed(evt);
            }
        });
        getContentPane().add(ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 160, 40));

        service.setBackground(new java.awt.Color(153, 153, 255));
        service.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        service.setText("Services");
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        getContentPane().add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 160, 40));

        admission.setBackground(new java.awt.Color(0, 0, 255));
        admission.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        admission.setText("Admission");
        admission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionActionPerformed(evt);
            }
        });
        getContentPane().add(admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Krankenhaus_Flur_web_01.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void person_mngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_mngActionPerformed
        person mn = new person(curren);
        mn.setVisible(true);
        close();
    }//GEN-LAST:event_person_mngActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
         payment mn = new payment();
         mn.setVisible(true);
         close();
    }//GEN-LAST:event_paymentActionPerformed

    private void wardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardActionPerformed
         Ward mn = new Ward();
         mn.setVisible(true);
         close();
    }//GEN-LAST:event_wardActionPerformed

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
         service mn = new service();
         mn.setVisible(true);
         close();
    }//GEN-LAST:event_serviceActionPerformed

    private void attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceActionPerformed
         Attendance mn = new Attendance();
         mn.setVisible(true);
         close();
    }//GEN-LAST:event_attendanceActionPerformed

    private void admissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionActionPerformed
        // TODO add your handling code here:
         admission mn = new admission();
         mn.setVisible(true);
         close();
    }//GEN-LAST:event_admissionActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }
    private void close(){
        WindowEvent winclosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosing);
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admission;
    private javax.swing.JButton attendance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton payment;
    private javax.swing.JButton person_mng;
    private javax.swing.JButton service;
    private javax.swing.JButton ward;
    // End of variables declaration//GEN-END:variables
}
