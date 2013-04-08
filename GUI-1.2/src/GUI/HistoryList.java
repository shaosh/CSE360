
package GUI;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author shaosh
 */
public class HistoryList extends javax.swing.JFrame {

    /**
     * Creates new form DocSignIn
     */
    private final int PATIENT = 2;
    private final int DOCTOR = 1;
    private final int DOCTORVIEW = 0;
    private final int DOCTORCREATE = 1;
    private final int PATIENTVIEW = 2;
    private final int PATIENTUPDATE = 3;
    private int type = -1;
    public HistoryList(int type) {
        initComponents();
        int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	this.setLocation((screenWidth - this.getSize().width) / 2,(screenHeight - this.getSize().height) / 2); 
        this.type = type;
        if(this.type == PATIENT)
            markButton.setEnabled(false);
    }
    public void HistoryVisible(){
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jDialog3 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jDialog5 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jDialog6 = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        completeDialog = new javax.swing.JDialog();
        completePanel = new javax.swing.JPanel();
        completeButton = new javax.swing.JButton();
        completeLabel = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        indicatorButton = new javax.swing.JButton();
        patientLabel = new javax.swing.JLabel();
        patientName = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        markButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        visitTable = new javax.swing.JTable();

        jDialog2.setTitle("Attention");
        jDialog2.setIconImage(null);
        jDialog2.setResizable(false);
        jDialog2.getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Do you still want to continue?");
        jDialog2.getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 60, 290, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("The user's password will be reset. ");
        jDialog2.getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 30, 220, 30);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("Confirm");
        jDialog2.getContentPane().add(jButton1);
        jButton1.setBounds(80, 110, 100, 30);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jDialog2.getContentPane().add(jButton2);
        jButton2.setBounds(270, 110, 100, 30);

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

        jDialog4.setTitle("Attention");
        jDialog4.setIconImage(null);
        jDialog4.setModal(true);
        jDialog4.setResizable(false);
        jDialog4.getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Do you still want to continue?");
        jDialog4.getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 60, 290, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("The user account will be lockout. ");
        jDialog4.getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 30, 220, 30);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton4.setText("Confirm");
        jDialog4.getContentPane().add(jButton4);
        jButton4.setBounds(80, 110, 100, 30);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton5.setText("Cancel");
        jDialog4.getContentPane().add(jButton5);
        jButton5.setBounds(270, 110, 100, 30);

        jDialog5.setTitle("Attention");
        jDialog5.setIconImage(null);
        jDialog5.setModal(true);
        jDialog5.setResizable(false);
        jDialog5.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("Do you still want to continue?");
        jDialog5.getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 60, 290, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("The user account will be unlocked. ");
        jDialog5.getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 30, 220, 30);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton6.setText("Confirm");
        jDialog5.getContentPane().add(jButton6);
        jButton6.setBounds(80, 110, 100, 30);

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton7.setText("Cancel");
        jDialog5.getContentPane().add(jButton7);
        jButton7.setBounds(270, 110, 100, 30);

        jDialog6.setTitle("Attention");
        jDialog6.setIconImage(null);
        jDialog6.setModal(true);
        jDialog6.setResizable(false);
        jDialog6.getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("Do you still want to continue?");
        jDialog6.getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 60, 290, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("The two user accounts will be merged. ");
        jDialog6.getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 30, 220, 30);

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton8.setText("Confirm");
        jDialog6.getContentPane().add(jButton8);
        jButton8.setBounds(80, 110, 100, 30);

        jButton9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton9.setText("Cancel");
        jDialog6.getContentPane().add(jButton9);
        jButton9.setBounds(270, 110, 100, 30);

        completeDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        completeDialog.setTitle("Attention");
        completeDialog.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        completeDialog.setIconImage(null);
        completeDialog.setName("completeDialog"); // NOI18N
        completeDialog.getContentPane().setLayout(null);

        completePanel.setMaximumSize(new java.awt.Dimension(285, 190));
        completePanel.setPreferredSize(new java.awt.Dimension(285, 190));
        completePanel.setLayout(null);

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
        completeLabel.setBounds(60, 40, 160, 30);

        completeDialog.getContentPane().add(completePanel);
        completePanel.setBounds(0, 0, 285, 190);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View History");
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        panel.setMaximumSize(new java.awt.Dimension(450, 300));
        panel.setLayout(null);

        indicatorButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        indicatorButton.setText("Indicator");
        indicatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicatorButtonActionPerformed(evt);
            }
        });
        panel.add(indicatorButton);
        indicatorButton.setBounds(220, 200, 95, 30);

        patientLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        patientLabel.setText("Patient:");
        panel.add(patientLabel);
        patientLabel.setBounds(20, 40, 70, 15);

        patientName.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        patientName.setText("PatientName");
        panel.add(patientName);
        patientName.setBounds(70, 40, 70, 15);

        ageLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ageLabel.setText("Age:");
        panel.add(ageLabel);
        ageLabel.setBounds(160, 40, 30, 15);

        age.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        age.setText("PatientAge");
        panel.add(age);
        age.setBounds(190, 40, 60, 15);

        id.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        id.setText("PatientID");
        panel.add(id);
        id.setBounds(310, 40, 70, 15);

        idLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        idLabel.setText("ID:");
        panel.add(idLabel);
        idLabel.setBounds(280, 40, 50, 15);

        userLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        userLabel.setText("User:");
        panel.add(userLabel);
        userLabel.setBounds(20, 10, 70, 15);

        userName.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        userName.setText("UserName");
        panel.add(userName);
        userName.setBounds(70, 10, 70, 15);

        markButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        markButton.setText("Mark Invalid");
        markButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markButtonActionPerformed(evt);
            }
        });
        panel.add(markButton);
        markButton.setBounds(321, 200, 110, 30);

        viewButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        viewButton.setText("View Visit");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        panel.add(viewButton);
        viewButton.setBounds(20, 200, 95, 30);

        cancelButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        panel.add(cancelButton);
        cancelButton.setBounds(120, 200, 95, 30);

        visitTable.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        visitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Visit Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        visitTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(visitTable);

        panel.add(jScrollPane3);
        jScrollPane3.setBounds(20, 60, 410, 120);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 450, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if(type == DOCTOR){
            PatientList patientList = new PatientList(DOCTOR);
            patientList.PatientListVisible();
            this.dispose();
        }
        else if (type == PATIENT){
            PatientMain patientMain = new PatientMain();
            patientMain.PatientMainVisible();
            this.dispose();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void markButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markButtonActionPerformed
        if(visitTable.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Please select one visit!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            completeDialog.setSize(285, 190);
            completeDialog.setLocation((screenWidth - completeDialog.getSize().width) / 2,(screenHeight - completeDialog.getSize().height) / 2);            
            completeLabel.setText("Marking invalid complete.");
            completeDialog.setVisible(true);
        }
    }//GEN-LAST:event_markButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        if(visitTable.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Please select one visit!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            if(type ==1){
                PatientInfo patientInfo = new PatientInfo(DOCTORVIEW);
                patientInfo.viewRecordReadOnly(DOCTORVIEW);
                patientInfo.PatientInfoVisible();
                this.dispose();
            }
            else if(type == 2){
                PatientInfo patientInfo = new PatientInfo(PATIENTVIEW);
                patientInfo.viewRecordReadOnly(PATIENTVIEW);
                patientInfo.PatientInfoVisible();
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Type error!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void indicatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicatorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indicatorButtonActionPerformed

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        completeDialog.dispose();
    }//GEN-LAST:event_completeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel ageLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton completeButton;
    private javax.swing.JDialog completeDialog;
    private javax.swing.JLabel completeLabel;
    private javax.swing.JPanel completePanel;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton indicatorButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton markButton;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel patientName;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userName;
    private javax.swing.JButton viewButton;
    private javax.swing.JTable visitTable;
    // End of variables declaration//GEN-END:variables
}
