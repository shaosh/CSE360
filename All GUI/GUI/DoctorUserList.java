
package GUI;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author shaosh
 */
public class DoctorUserList extends javax.swing.JFrame {

    /**
     * Creates new form DocSignIn
     */
    public DoctorUserList() {
        initComponents();
        int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	this.setLocation((screenWidth - this.getSize().width) / 2,(screenHeight - this.getSize().height) / 2); 
    }
    public void CreateDoctorVisible(){
        this.setVisible(true);		
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jDialog3 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        docSignin = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        signButton1 = new javax.swing.JButton();
        signButton3 = new javax.swing.JButton();

        jDialog2.setTitle("Attention");
        jDialog2.setIconImage(null);
        jDialog2.setResizable(false);
        jDialog2.getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Do you still want to continue?");
        jDialog2.getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 60, 290, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Doctors with the same profile have already existed.");
        jDialog2.getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 30, 290, 30);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("Confirm");
        jDialog2.getContentPane().add(jButton1);
        jButton1.setBounds(80, 110, 100, 30);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jDialog2.getContentPane().add(jButton2);
        jButton2.setBounds(270, 110, 100, 30);

        idLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        idLabel.setText("Result");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Name    UserID" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jDialog3.setTitle("Attention");
        jDialog3.setIconImage(null);
        jDialog3.setResizable(false);
        jDialog3.getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("No such user.");
        jDialog3.getContentPane().add(jLabel4);
        jLabel4.setBounds(55, 30, 90, 30);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setText("Confirm");
        jDialog3.getContentPane().add(jButton3);
        jButton3.setBounds(50, 80, 100, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Users Found");
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        docSignin.setMaximumSize(new java.awt.Dimension(450, 300));
        docSignin.setMinimumSize(new java.awt.Dimension(0, 0));
        docSignin.setLayout(null);

        cancelButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        docSignin.add(cancelButton);
        cancelButton.setBounds(310, 220, 120, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "ID", "Type"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        docSignin.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 420, 180);

        signButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        signButton1.setText("View History");
        signButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButton1ActionPerformed(evt);
            }
        });
        docSignin.add(signButton1);
        signButton1.setBounds(10, 220, 120, 30);

        signButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        signButton3.setText("Create Visit");
        signButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButton3ActionPerformed(evt);
            }
        });
        docSignin.add(signButton3);
        signButton3.setBounds(160, 220, 120, 30);

        getContentPane().add(docSignin);
        docSignin.setBounds(0, 0, 450, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        Welcome welcome = new Welcome();
	welcome.WelcomeVisible();
	this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void signButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signButton1ActionPerformed

    private void signButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SetPermission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetPermission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetPermission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetPermission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorUserList().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel docSignin;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton signButton1;
    private javax.swing.JButton signButton3;
    // End of variables declaration//GEN-END:variables
}
