import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SearchPatient extends JFrame {
	private JLabel lastLabel, firstLabel, genderLabel, birthLabel;
	private JTextField lastField, firstField;
	private JButton searchButton, newPatientButton;
	private JRadioButton maleRadio, femaleRadio;
	private ButtonGroup radioGroup;
	private JComboBox monthCombo, dayCombo, yearCombo;
	private JFrame frame;
	private JPanel panel;
	
	public SearchPatient(){		
		frame = new JFrame("Search Patient");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setVisible(true);
		frame.setSize(450, 300);			
		frame.setResizable(false);
		//Set the interface to the center of the screen
		int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		frame.setLocation((screenWidth - frame.getSize().width) / 2,(screenHeight - frame.getSize().height) / 2);
		
		//Initialize components
		lastLabel = new JLabel("Lastname");
		firstLabel = new JLabel("Firstname");
		genderLabel = new JLabel("Gender"); 
		birthLabel = new JLabel("Birth");
		lastField = new JTextField(); 
		firstField = new JTextField(); 
		maleRadio = new JRadioButton("Male");
		femaleRadio = new JRadioButton("Female");
		radioGroup = new ButtonGroup();
		monthCombo = new JComboBox();
		dayCombo = new JComboBox();
		yearCombo = new JComboBox();		
		searchButton = new JButton("Search");
		newPatientButton = new JButton("New Patient");
		panel = new JPanel();
		
		//Set JComboBoxes
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
		
		//Set component size
//		lastLabel.setSize(50, 30);
//		firstLabel.setSize(50, 30);
//		genderLabel.setSize(50, 30);
//		birthLabel.setSize(50, 30);
//		lastField.setSize(100, 30);
//		firstField.setSize(100, 30);
//		maleRadio.setSize(50, 30);
//		femaleRadio.setSize(50, 30);
//		yearCombo.setSize(50, 30);
//		monthCombo.setSize(50, 30);
//		dayCombo.setSize(50,30);
//		searchButton.setSize(100, 30);
//		newPatientButton.setSize(100, 30);
		panel.setPreferredSize(new Dimension(450, 300));
		panel.setLayout(null);
		
		//Add components to the panel
		panel.add(lastLabel);
		panel.add(firstLabel);
		panel.add(genderLabel);
		panel.add(birthLabel);
		panel.add(lastField);
		panel.add(firstField);
		radioGroup.add(maleRadio);
		radioGroup.add(femaleRadio);
		panel.add(maleRadio);
		panel.add(femaleRadio);
		panel.add(yearCombo);
		panel.add(monthCombo);
		panel.add(dayCombo);
		panel.add(searchButton);
		panel.add(newPatientButton);
		frame.add(panel);
		
		//Adjust component position
		lastLabel.setBounds(75, 25, 100, 30);
		firstLabel.setBounds(75, 75, 100, 30);
		genderLabel.setBounds(75, 125, 100, 30);
		birthLabel.setBounds(75, 165, 100, 30);		
		lastField.setBounds(175, 25, 200, 30);
		firstField.setBounds(175, 75, 200, 30);
		maleRadio.setBounds(175, 125, 75, 30);
		femaleRadio.setBounds(275, 125, 75, 30);		
		monthCombo.setBounds(175, 170, 50, 20);
		dayCombo.setBounds(245, 170, 50, 20);
		yearCombo.setBounds(315, 170, 60, 20);
		searchButton.setBounds(75, 215, 125, 30);	
		newPatientButton.setBounds(250, 215, 125, 30);
		
		//Set button event
		ButtonListen btnListener = new ButtonListen();
		searchButton.addActionListener(btnListener);
	}
	
	public void SearchPatientVisible(){
		frame.setVisible(true);		
	}
	
	private class ButtonListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == searchButton){
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
				((int)yearCombo.getSelectedItem()) % 100 != 0 && ((int)yearCombo.getSelectedItem()) % 400 == 0)) &&
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
					PatientList patientList = new PatientList();
					patientList.PatientListVisible();
					frame.setVisible(false);
				}
 			}
			//Open the welcome interface, close current interface
			else if (e.getSource() == newPatientButton){
//				Welcome welcome =  new Welcome();
//				welcome.WelcomeVisible();
				frame.setVisible(false);
 			}
		}
	}
}
