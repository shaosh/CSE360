
package GUI;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author shaosh
 */
public class CreatePatient extends javax.swing.JFrame {

    /**
     * Creates new form DocSignIn
     */
    public CreatePatient() {
        initComponents();
        int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	this.setLocation((screenWidth - this.getSize().width) / 2,(screenHeight - this.getSize().height) / 2); 
    }
    public void CreatePatientVisible(){
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
        docSignin = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        signButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        pwLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        pwLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        idField1 = new javax.swing.JTextField();

        jDialog2.setTitle("Attention");
        jDialog2.setIconImage(null);
        jDialog2.setPreferredSize(new java.awt.Dimension(450, 200));
        jDialog2.setResizable(false);
        jDialog2.getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Do you still want to continue?");
        jDialog2.getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 60, 290, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Patients with the same profile have already existed.");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Patient");
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        docSignin.setMaximumSize(new java.awt.Dimension(450, 300));
        docSignin.setMinimumSize(new java.awt.Dimension(0, 0));
        docSignin.setLayout(null);

        idLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        idLabel.setText("First Name");
        docSignin.add(idLabel);
        idLabel.setBounds(70, 20, 100, 30);

        pwLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pwLabel.setText("Last Name");
        docSignin.add(pwLabel);
        pwLabel.setBounds(70, 70, 100, 30);

        signButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        signButton.setText("Submit");
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

        pwLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pwLabel1.setText("Gender");
        docSignin.add(pwLabel1);
        pwLabel1.setBounds(70, 170, 100, 30);

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jComboBox1.setMaximumRowCount(12);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        docSignin.add(jComboBox1);
        jComboBox1.setBounds(180, 120, 60, 30);

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jComboBox2.setMaximumRowCount(31);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        docSignin.add(jComboBox2);
        jComboBox2.setBounds(250, 120, 50, 30);

        jComboBox3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jComboBox3.setMaximumRowCount(100);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1960", "Item 2", "Item 3", "Item 4" }));
        docSignin.add(jComboBox3);
        jComboBox3.setBounds(310, 120, 70, 30);

        pwLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pwLabel2.setText("Birthday");
        docSignin.add(pwLabel2);
        pwLabel2.setBounds(70, 120, 100, 30);

        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jRadioButton1.setText("Male");
        docSignin.add(jRadioButton1);
        jRadioButton1.setBounds(180, 170, 51, 30);

        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jRadioButton2.setText("Female");
        docSignin.add(jRadioButton2);
        jRadioButton2.setBounds(280, 170, 100, 30);

        idField1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        docSignin.add(idField1);
        idField1.setBounds(180, 20, 200, 30);

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
    	if(idField.getText().equals(String.valueOf(idField.getText()))
	&& idField.getText().length() != 0){
            ChangePassword changePW = new ChangePassword();
            changePW.ChangePasswordVisible();
            this.setVisible(false);
	}
	else if (idField.getText().length() == 0 || idField.getText() == "0" ){
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
                new CreatePatient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel docSignin;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idField1;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JLabel pwLabel1;
    private javax.swing.JLabel pwLabel2;
    private javax.swing.JButton signButton;
    // End of variables declaration//GEN-END:variables
}
