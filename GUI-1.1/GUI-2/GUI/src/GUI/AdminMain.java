

package GUI;
import java.awt.*;
/**
 *
 * @author shaosh
 */
public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    private final int ADMIN = 0;
    private final int DOCTOR = 1;
    public AdminMain() {
        initComponents();
        int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	this.setLocation((screenWidth - this.getSize().width) / 2,(screenHeight - this.getSize().height) / 2); 
    }
    public void AdminMainVisible(){
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

        panel = new javax.swing.JPanel();
        createAdminButton = new javax.swing.JButton();
        createDoctorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        findButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        changeButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Home");
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(270, 400));
        setResizable(false);

        panel.setLayout(null);

        createAdminButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        createAdminButton.setText("Create Administrator");
        createAdminButton.setPreferredSize(new java.awt.Dimension(100, 30));
        createAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminButtonActionPerformed(evt);
            }
        });
        panel.add(createAdminButton);
        createAdminButton.setBounds(50, 70, 170, 40);

        createDoctorButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        createDoctorButton.setText("Create Doctor");
        createDoctorButton.setPreferredSize(new java.awt.Dimension(100, 30));
        createDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDoctorButtonActionPerformed(evt);
            }
        });
        panel.add(createDoctorButton);
        createDoctorButton.setBounds(50, 130, 170, 40);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("AdminName");
        panel.add(jLabel1);
        jLabel1.setBounds(140, 30, 90, 18);

        findButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        findButton.setText("Find");
        findButton.setPreferredSize(new java.awt.Dimension(100, 30));
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });
        panel.add(findButton);
        findButton.setBounds(50, 190, 170, 40);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Administrator:");
        panel.add(jLabel2);
        jLabel2.setBounds(50, 30, 90, 18);

        changeButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        changeButton.setText("Change User");
        changeButton.setPreferredSize(new java.awt.Dimension(100, 30));
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });
        panel.add(changeButton);
        changeButton.setBounds(50, 250, 170, 40);

        cancelButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cancelButton.setText("Exit");
        cancelButton.setPreferredSize(new java.awt.Dimension(100, 30));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        panel.add(cancelButton);
        cancelButton.setBounds(50, 310, 170, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminButtonActionPerformed
        CreateUser createAdmin = new CreateUser(ADMIN);
	createAdmin.CreateUserVisible();
	this.dispose();
    }//GEN-LAST:event_createAdminButtonActionPerformed

    private void createDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDoctorButtonActionPerformed
        CreateUser createDoctor = new CreateUser(DOCTOR);
	createDoctor.CreateUserVisible();
	this.dispose();
    }//GEN-LAST:event_createDoctorButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        Find find = new Find(ADMIN);
        find.FindVisible();
        this.dispose();
    }//GEN-LAST:event_findButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        SignIn signIn = new SignIn();
        signIn.SignInVisible();
        this.dispose();
    }//GEN-LAST:event_changeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton createAdminButton;
    private javax.swing.JButton createDoctorButton;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}