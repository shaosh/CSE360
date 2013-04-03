import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome {
	private static JFrame frame;
	private JLabel label, infoLabel;
	private JButton docButton, patientButton, adminButton;
	public Welcome(){
		//Set the Frame
		frame = new JFrame("Well-Check Clinic");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setVisible(true);
		frame.setSize(450, 300);	
		frame.setLayout(null);		
		frame.setResizable(false);
		
		//Set the interface to the center of the screen
		int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		frame.setLocation((screenWidth - frame.getSize().width) / 2,(screenHeight - frame.getSize().height) / 2); 
		
		//Set the panel
		JPanel welcome = new JPanel();
		frame.add(welcome);
		welcome.setBounds(0, 50, 450, 200);
		
		welcome.setPreferredSize(new Dimension(450, 300));
		welcome.setLayout(new GridLayout(3, 1));
		label = new JLabel("Welcome to Well-Check Clinic!");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		welcome.add (label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		//set the information label
		JPanel infoPanel = new JPanel();
		infoLabel = new JLabel("v1.0              by Team12");
		welcome.add(infoPanel);
		infoPanel.add(infoLabel);
		
		//set the buttons
		JPanel buttonPanel = new JPanel();
		FlowLayout btnFlow = new FlowLayout(1, 50, 0);
		buttonPanel.setLayout(btnFlow);
		docButton = new JButton("Doctor");
		docButton.setSize(100, 30);
		patientButton = new JButton("Patient");
		patientButton.setSize(100, 30);
		adminButton = new JButton("Admin");
		adminButton.setSize(100, 30);
		welcome.add(buttonPanel);
		buttonPanel.add(docButton);
		buttonPanel.add(patientButton);
		buttonPanel.add(adminButton);		
		
		//button events
		ButtonListen btnListener = new ButtonListen();
		docButton.addActionListener(btnListener);		
		patientButton.addActionListener(btnListener);
		adminButton.addActionListener(btnListener);		
	}
	
	public void WelcomeVisible(){
		frame.setVisible(true);		
	}
	
	private class ButtonListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Open the signin interface, close current interface
			if (e.getSource() == docButton){
				DocSignIn docSignIn = new DocSignIn();
				docSignIn.DocSignVisible();
				frame.setVisible(false);
//				WelcomeDriver.WelcomeInvisible(currFrame);
			}
			else if (e.getSource() == patientButton){
				PatientSignIn patientSignIn = new PatientSignIn();
				patientSignIn.PatientSignVisible();
				frame.setVisible(false);
//				WelcomeDriver.WelcomeInvisible(currFrame);
			}
			else if (e.getSource() == adminButton){
					//*******************************
					//need coding
					//*******************************					
//				WelcomeDriver.WelcomeInvisible(currFrame);
			}
	    }
	 }
//	public static void WelcomeInvisible(JFrame ivframe){
//		ivframe.setVisible(false);		
//	}
}
