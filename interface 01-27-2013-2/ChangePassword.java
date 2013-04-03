import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangePassword extends JFrame {
	private JLabel oldLabel, newLabel, confirmLabel, reminderLabel;
	private JTextField oldField, newField, confirmField;
	private JButton submitButton, cancelButton;
	private JFrame frame;
	private JPanel panel;
	
	public ChangePassword(){
		frame = new JFrame("Change Password");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setVisible(true);
		frame.setSize(450, 300);			
		frame.setResizable(false);
		//Set the interface to the center of the screen
		int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		frame.setLocation((screenWidth - frame.getSize().width) / 2,(screenHeight - frame.getSize().height) / 2); 
		
//		frame.setLayout(null);
		oldLabel = new JLabel("Old Password");
		newLabel = new JLabel("New Password");
		confirmLabel = new JLabel("Confirm"); 
		reminderLabel = new JLabel("You may want to change your default password.");
		oldField = new JTextField(); 
		newField = new JTextField(); 
		confirmField = new JTextField();
		submitButton = new JButton("Submit");
		cancelButton = new JButton("Cancel");
		panel = new JPanel();
		
		
		oldField.setSize(50, 30);
		newField.setSize(50, 30);
		confirmField.setSize(50, 30);
		submitButton.setSize(100, 30);
		cancelButton.setSize(100, 30);
		panel.setPreferredSize(new Dimension(450, 300));
		panel.setLayout(null);
		
		panel.add(oldLabel);
		panel.add(newLabel);
		panel.add(confirmLabel);
		panel.add(reminderLabel);
		panel.add(oldField);
		panel.add(newField);
		panel.add(confirmField);
		panel.add(submitButton);
		panel.add(cancelButton);
		frame.add(panel);
		
		oldLabel.setBounds(75, 50, 100, 30);
		newLabel.setBounds(75, 100, 100, 30);
		confirmLabel.setBounds(75, 150, 100, 30);
		reminderLabel.setBounds(75, 0, 300, 30);
		oldField.setBounds(175, 50, 200, 30);
		newField.setBounds(175, 100, 200, 30);
		confirmField.setBounds(175, 150, 200, 30);
		submitButton.setBounds(75, 200, 100, 30);	
		cancelButton.setBounds(275, 200, 100, 30);
		
		//Button Event Listener
		ButtonListen btnListener = new ButtonListen();
		submitButton.addActionListener(btnListener);		
		cancelButton.addActionListener(btnListener);		
	}
	
	public void changePasswordVisible(){
		frame.setVisible(true);		
	}
	
	private class ButtonListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Open the welcome interface, close current interface
			if (e.getSource() == submitButton){
				//*******************************
				//need coding
				//*******************************				
 			}
			else if (e.getSource() == cancelButton){
				Welcome welcome =  new Welcome();
				welcome.WelcomeVisible();
				frame.setVisible(false);
 			}
	    }
	}
}
