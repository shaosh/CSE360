
package GUI;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author shaosh
 */
public class SetPassword extends javax.swing.JFrame {

    /**
     * Creates new form DocSignIn
     */
    public SetPassword() {
        initComponents();
        int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	this.setLocation((screenWidth - this.getSize().width) / 2,(screenHeight - this.getSize().height) / 2); 
    }
    public void SetPasswordVisible(){
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

        docSignin = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        signButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        pwField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        pwLabel1 = new javax.swing.JLabel();
        pwField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        docSignin.setMaximumSize(new java.awt.Dimension(450, 300));
        docSignin.setMinimumSize(new java.awt.Dimension(0, 0));
        docSignin.setLayout(null);

        idLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        idLabel.setText("Old Password");
        docSignin.add(idLabel);
        idLabel.setBounds(80, 70, 100, 30);

        pwLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pwLabel.setText("New Password");
        docSignin.add(pwLabel);
        pwLabel.setBounds(80, 120, 100, 30);

        signButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        signButton.setText("Log In");
        signButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButtonActionPerformed(evt);
            }
        });
        docSignin.add(signButton);
        signButton.setBounds(70, 220, 100, 30);

        cancelButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        docSignin.add(cancelButton);
        cancelButton.setBounds(280, 220, 100, 30);

        idField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        docSignin.add(idField);
        idField.setBounds(180, 70, 200, 30);

        pwField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        docSignin.add(pwField);
        pwField.setBounds(180, 120, 200, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("You may want to change your default password.");
        docSignin.add(jLabel1);
        jLabel1.setBounds(75, 20, 290, 18);

        pwLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pwLabel1.setText("Confirm");
        docSignin.add(pwLabel1);
        pwLabel1.setBounds(80, 170, 100, 30);

        pwField1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        docSignin.add(pwField1);
        pwField1.setBounds(180, 170, 200, 30);

        getContentPane().add(docSignin);
        docSignin.setBounds(0, 0, 450, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        Welcome welcome = new Welcome();
	welcome.WelcomeVisible();
	this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void signButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButtonActionPerformed
    //*******************************
    //need coding
    //*******************************	
    	if(idField.getText().equals(String.valueOf(pwField.getPassword()))
	&& idField.getText().length() != 0){
            ChangePassword changePW = new ChangePassword();
            changePW.ChangePasswordVisible();
            this.setVisible(false);
	}
	else if (idField.getText().length() == 0 || pwField.getPassword().length == 0 ){
            JOptionPane.showMessageDialog(null, "Please enter your ID or Password!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
	}
	//*******************************
	//need coding
	//*******************************	
	else{
//          SearchPatient searchPatient = new SearchPatient();
//          searchPatient.SearchPatientVisible();
//          this.setVisible(false);
	}        // TODO add your handling code here:
    }//GEN-LAST:event_signButtonActionPerformed

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
                new SetPassword().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel docSignin;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JPasswordField pwField1;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JLabel pwLabel1;
    private javax.swing.JButton signButton;
    // End of variables declaration//GEN-END:variables
}