/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package secondAssignment.system.ui.Doctor;

import javax.swing.JOptionPane;
import secondAssignment.system.model.login.LoginList;
import secondAssignment.system.person.City;
import secondAssignment.system.person.DoctorDirectory;
import secondAssignment.system.person.PatientDirectory;
import secondAssignment.system.ui.AddDiagnosisInformation;
import secondAssignment.system.ui.HistoryPatient;
import secondAssignment.system.ui.Login;

/**
 *
 * @author sweta
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
     PatientDirectory patientList;
    City city;
    LoginList lgnList;
     DoctorDirectory doctorList;
    public Doctor(LoginList lgnList,PatientDirectory patientList,City city,DoctorDirectory doctorList) {
        initComponents();
         this.lgnList = lgnList;
         this.city = city;
         this.patientList = patientList;
         this.doctorList = doctorList;
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnAddDiagnosisInfo = new javax.swing.JButton();
        btnAddHistory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Doctor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 181, -1));

        btnLogOut.setText("Log Out");
        btnLogOut.setPreferredSize(new java.awt.Dimension(240, 59));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 672, 182, -1));

        btnAddDiagnosisInfo.setText("Add Diagnosis Information");
        btnAddDiagnosisInfo.setPreferredSize(new java.awt.Dimension(240, 59));
        btnAddDiagnosisInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDiagnosisInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDiagnosisInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 87, -1, -1));

        btnAddHistory.setText("Full History of the patient");
        btnAddHistory.setPreferredSize(new java.awt.Dimension(240, 59));
        btnAddHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 164, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secondAssignment/system/ui/bb.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Really want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
             System.out.println("outside doc");
            new Login(lgnList,patientList,city,doctorList).setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAddDiagnosisInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDiagnosisInfoActionPerformed
        // TODO add your handling code here:
        new AddDiagnosisInformation(patientList,city,doctorList).setVisible(true);
        System.out.println(patientList.toString());
        System.out.println(city.toString());
    }//GEN-LAST:event_btnAddDiagnosisInfoActionPerformed

    private void btnAddHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHistoryActionPerformed
        // TODO add your handling code here:
        new HistoryPatient(patientList,city,doctorList).setVisible(true);
    }//GEN-LAST:event_btnAddHistoryActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Doctor().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDiagnosisInfo;
    private javax.swing.JButton btnAddHistory;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
