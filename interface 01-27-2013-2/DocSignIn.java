import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class DocSignIn{
	private JFrame frame;
	private JLabel idLabel, pwLabel;
	private JTextField idField;
	private JPasswordField pwField;
	private JButton signButton, cancelButton;
	public DocSignIn(){
		//Set the Frame
		frame = new JFrame("Doctor SignIn");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setVisible(true);
		frame.setSize(450, 300);			
		frame.setResizable(false);
		//Set the interface to the center of the screen
		int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		frame.setLocation((screenWidth - frame.getSize().width) / 2,(screenHeight - frame.getSize().height) / 2); 
		
		//Set the panel
		JPanel docSignin = new JPanel();		
		docSignin.setPreferredSize(new Dimension(450, 300));
		docSignin.setLayout(null);
		
		//set components to the panel	
		idLabel = new JLabel("ID:");
		pwLabel = new JLabel("Password:");
		idField = new JTextField();
		pwField = new JPasswordField();
		idField.setSize(50, 30);
		pwField.setSize(50, 30);
		pwField.setEchoChar('*');	
		signButton = new JButton("Sign In");
		cancelButton = new JButton("Cancel");
		signButton.setSize(100, 30);
		cancelButton.setSize(100, 30);
		
		//add the components to panel
		docSignin.add(idLabel);
		docSignin.add(pwLabel);
		docSignin.add(idField);
		docSignin.add(pwField);
		docSignin.add(signButton);
		docSignin.add(cancelButton);
		frame.add(docSignin);	
		idLabel.setBounds(75, 50, 100, 30);		
		pwLabel.setBounds(75, 100, 100, 30);
		idField.setBounds(175, 50, 200, 30);		
		pwField.setBounds(175, 100, 200, 30);
		signButton.setBounds(75, 180, 100, 30);		
		cancelButton.setBounds(275, 180, 100, 30);

		//button events
		ButtonListen btnListener = new ButtonListen();
		signButton.addActionListener(btnListener);		
		cancelButton.addActionListener(btnListener);	
	}
	
	public void DocSignVisible(){
		frame.setVisible(true);		
	}
	
	private class ButtonListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Open the welcome interface, close current interface
			if (e.getSource() == cancelButton){
				Welcome welcome = new Welcome();
				welcome.WelcomeVisible();
				frame.setVisible(false);
			}
			else if (e.getSource() == signButton){
				//*******************************
				//need coding
				//*******************************	
				if(idField.getText().compareTo(pwField.getText()) == 0
					&& idField.getText().length() != 0){
					ChangePassword changePW = new ChangePassword();
					changePW.changePasswordVisible();
					frame.setVisible(false);
				}
				else if (idField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "You need to enter your ID!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}
				//*******************************
				//need coding
				//*******************************					
			}
	    }
	}
}
