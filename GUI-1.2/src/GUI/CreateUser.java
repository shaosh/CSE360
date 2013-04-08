
package GUI;

import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author shaosh
 */
public class CreateUser extends javax.swing.JFrame {

    /**
     * Creates new form DocSignIn
     */
    private final int ADMIN = 0;
    private final int DOCTOR = 1;
    private final int PATIENT = 2;
    private final int NURSE = 3;
    private final int DOCTORVIEW = 0;
    private final int DOCTORCREATE = 1;
    private final int PATIENTVIEW = 2;
    private final int PATIENTUPDATE = 3;    
    private final int NURSECREATE = 4;
    private int sourceType = -1;
    private int type = -1;
    public CreateUser(int sourceType, int userType) {  //userType: 0-Admin, 1-Doctor, 2-Patient, 3-Nurse
        initComponents();
        int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	this.setLocation((screenWidth - this.getSize().width) / 2,(screenHeight - this.getSize().height) / 2); 
        type = userType;
        this.sourceType = sourceType;
        Calendar cal = Calendar.getInstance();

        yearCombo.addItem(" ");
        monthCombo.addItem(" ");
        dayCombo.addItem(" ");        
        for(int i = 1900; i <= cal.get(Calendar.YEAR); i++)
            yearCombo.addItem(i);	       
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i = 0; i < 12; i++)
            monthCombo.addItem(months[i]);
        for(int i = 1; i <= 31; i++)
            dayCombo.addItem(i);
        radioGroup.add(maleRadio);
	radioGroup.add(femaleRadio);
        if(this.type == ADMIN){
            this.setTitle("Create Administrator");
        }
        else if(this.type == DOCTOR){
            this.setTitle("Create Doctor");
        }
        else if(this.type == PATIENT){
            this.setTitle("Create Patient");
        }
        else if(this.type == NURSE){
            this.setTitle("Create Nurse");
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid user type!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
        }
    }
    public void CreateUserVisible(){        
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

        radioGroup = new javax.swing.ButtonGroup();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        completeDialog = new javax.swing.JDialog();
        completePanel = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        completeButton = new javax.swing.JButton();
        completeLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        firstLabel = new javax.swing.JLabel();
        lastLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        lastField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        monthCombo = new javax.swing.JComboBox();
        dayCombo = new javax.swing.JComboBox();
        yearCombo = new javax.swing.JComboBox();
        birthLabel = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        firstField = new javax.swing.JTextField();

        jDialog2.setTitle("Attention");
        jDialog2.setIconImage(null);
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

        completeDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        completeDialog.setTitle("Attention");
        completeDialog.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        completeDialog.setIconImage(null);
        completeDialog.setName("completeDialog"); // NOI18N
        completeDialog.getContentPane().setLayout(null);

        completePanel.setMaximumSize(new java.awt.Dimension(285, 190));
        completePanel.setMinimumSize(new java.awt.Dimension(0, 0));
        completePanel.setPreferredSize(new java.awt.Dimension(285, 190));
        completePanel.setLayout(null);

        id.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        id.setText("abc123");
        completePanel.add(id);
        id.setBounds(100, 50, 130, 30);

        completeButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        completeButton.setText("Confirm");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });
        completePanel.add(completeButton);
        completeButton.setBounds(90, 100, 100, 30);

        completeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        completePanel.add(completeLabel);
        completeLabel.setBounds(40, 20, 190, 30);

        idLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        idLabel.setText("User ID:");
        completePanel.add(idLabel);
        idLabel.setBounds(40, 50, 70, 30);

        completeDialog.getContentPane().add(completePanel);
        completePanel.setBounds(0, 0, 285, 190);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create User");
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        panel.setMaximumSize(new java.awt.Dimension(450, 300));
        panel.setMinimumSize(new java.awt.Dimension(0, 0));
        panel.setLayout(null);

        firstLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        firstLabel.setText("First Name");
        panel.add(firstLabel);
        firstLabel.setBounds(70, 20, 100, 30);

        lastLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lastLabel.setText("Last Name");
        panel.add(lastLabel);
        lastLabel.setBounds(70, 70, 100, 30);

        submitButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        panel.add(submitButton);
        submitButton.setBounds(70, 220, 100, 30);

        cancelButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        panel.add(cancelButton);
        cancelButton.setBounds(280, 220, 100, 30);

        lastField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        panel.add(lastField);
        lastField.setBounds(180, 70, 200, 30);

        genderLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        genderLabel.setText("Gender");
        panel.add(genderLabel);
        genderLabel.setBounds(70, 170, 100, 30);

        monthCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        monthCombo.setMaximumRowCount(10);
        panel.add(monthCombo);
        monthCombo.setBounds(180, 120, 60, 30);

        dayCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        dayCombo.setMaximumRowCount(10);
        panel.add(dayCombo);
        dayCombo.setBounds(250, 120, 50, 30);

        yearCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        yearCombo.setMaximumRowCount(10);
        yearCombo.setToolTipText("");
        yearCombo.setAutoscrolls(true);
        yearCombo.setPreferredSize(new java.awt.Dimension(70, 30));
        panel.add(yearCombo);
        yearCombo.setBounds(310, 120, 70, 30);

        birthLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        birthLabel.setText("Birthday");
        panel.add(birthLabel);
        birthLabel.setBounds(70, 120, 100, 30);

        maleRadio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        maleRadio.setText("Male");
        panel.add(maleRadio);
        maleRadio.setBounds(180, 170, 51, 30);

        femaleRadio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        femaleRadio.setText("Female");
        panel.add(femaleRadio);
        femaleRadio.setBounds(280, 170, 100, 30);

        firstField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        panel.add(firstField);
        firstField.setBounds(180, 20, 200, 30);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 450, 300);

        getAccessibleContext().setAccessibleName("frame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if(this.type == ADMIN || this.type == DOCTOR){
            AdminMain adminMain = new AdminMain();
            adminMain.AdminMainVisible();
            this.dispose();
        }
        else if(this.sourceType == DOCTOR && this.type == PATIENT){ 
            DoctorMain doctorMain = new DoctorMain();
            doctorMain.DoctorMainVisible();
            this.dispose();
        }
        else if(this.sourceType == NURSE && this.type == PATIENT){ 
            NurseMain nurseMain = new NurseMain();
            nurseMain.NurseMainVisible();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid user type!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
        }
       
//	this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
    //*******************************
    //need coding
    //*******************************	
    	//Check if the information are correctly entered
        if(lastField.getText().length() == 0 || firstField.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Please enter the names!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
        }
        else if(maleRadio.isSelected() == false && femaleRadio.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Please select the gender!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
        }
        else if((monthCombo.getSelectedIndex() == 4 || monthCombo.getSelectedIndex() == 6 || 
        monthCombo.getSelectedIndex() == 9 || monthCombo.getSelectedIndex() == 11) &&
        dayCombo.getSelectedIndex() > 30){
            JOptionPane.showMessageDialog(null, "Date is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
        }
        else if((monthCombo.getSelectedIndex() == 2 && ((int)(yearCombo.getSelectedItem()) % 4 == 0 &&
        ((int)yearCombo.getSelectedItem()) % 100 == 0 && ((int)yearCombo.getSelectedItem()) % 400 == 0)) &&
        dayCombo.getSelectedIndex() > 29){
            JOptionPane.showMessageDialog(null, "Date is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else if((monthCombo.getSelectedIndex() == 2 && ((int)(yearCombo.getSelectedItem()) % 4 == 0 &&
        ((int)yearCombo.getSelectedItem()) % 100 != 0)) &&
        dayCombo.getSelectedIndex() > 29){
            JOptionPane.showMessageDialog(null, "Date is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else if((monthCombo.getSelectedIndex() == 2 && ((int)(yearCombo.getSelectedItem()) % 4 != 0 ||
        (((int)yearCombo.getSelectedItem()) % 100 == 0 && ((int)yearCombo.getSelectedItem()) % 400 != 0))) &&
        dayCombo.getSelectedIndex() > 28){
            JOptionPane.showMessageDialog(null, "Date is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(monthCombo.getSelectedIndex() == 0 || dayCombo.getSelectedIndex() == 0 || yearCombo.getSelectedIndex() == 0 ){
            JOptionPane.showMessageDialog(null, "Please enter birth date!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
        }								
        //*******************************
        //need coding
        //*******************************
        //Search for info
        //Use dialog to show if search is success
        else{
            int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            completeDialog.setSize(285, 190);
            completeDialog.setLocation((screenWidth - completeDialog.getSize().width) / 2,(screenHeight - completeDialog.getSize().height) / 2); 
            if(this.type == ADMIN){
                completeLabel.setText("Administrator creation complete.");
            }
            else if(this.type == DOCTOR){
                completeLabel.setText("Doctor creation complete.");
            }
            else if(this.type == PATIENT){
                completeLabel.setText("Patient creation complete.");
            }
            else if(this.type == NURSE){
                completeLabel.setText("Nurse creation complete.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid user type!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
            }
            
            completeDialog.setVisible(true);

        }       // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        // TODO add your handling code here:
        if(this.type == ADMIN || this.type == DOCTOR || this.type == NURSE){
            AdminMain adminMain = new AdminMain();
            adminMain.AdminMainVisible();
            completeDialog.dispose();
            this.dispose();
        }
        else if(this.type == PATIENT && this.sourceType == DOCTOR){ 
            PatientInfo patientInfo = new PatientInfo(DOCTORCREATE);
            patientInfo.PatientInfoVisible();
            completeDialog.dispose();
            this.dispose();
        }
        else if(this.type == PATIENT && this.sourceType == NURSE){ 
            PatientInfo patientInfo = new PatientInfo(NURSECREATE);
            patientInfo.nurseAccessReadOnly();
            patientInfo.PatientInfoVisible();
            completeDialog.dispose();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid user type!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
            completeDialog.dispose();
        }
        
        
        
    }//GEN-LAST:event_completeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton completeButton;
    private javax.swing.JDialog completeDialog;
    private javax.swing.JLabel completeLabel;
    private javax.swing.JPanel completePanel;
    private javax.swing.JComboBox dayCombo;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstField;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lastField;
    private javax.swing.JLabel lastLabel;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JComboBox monthCombo;
    private javax.swing.JPanel panel;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox yearCombo;
    // End of variables declaration//GEN-END:variables
}
