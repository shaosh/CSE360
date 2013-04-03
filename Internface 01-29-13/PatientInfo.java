import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class PatientInfo extends JFrame{
	//Component for Basic Info page
	private JLabel lastLabel, firstLabel, birthLabel, genderLabel;
	private JLabel addrLabel, contactLabel, heightLabel, weightLabel;
	private JLabel bloodLabel, insurLabel, idLabel, id, allergyLabel, mediLabel;	
	private JTextField lastField, firstField, addrField, contactField;
	private JTextField heightField, weightField, bloodField, insurField;
	private JTextArea allergyArea, mediArea;	
	private JComboBox monthCombo, dayCombo, yearCombo;
	private JButton saveButton, cancelButton;
	private JRadioButton maleRadio, femaleRadio;
	private ButtonGroup radioGroup;
	private JScrollPane allergyScroll, mediScroll;
	
	//Component for Health Info page
	private JLabel dateLabel, tempLabel, pressureLabel, sugarLabel;
	private JLabel weightLabel2, complainLabel, observeLabel, prescriptLabel;
	private JTextField tempField, pressureField, sugarField, weightField2;
	private JComboBox monthCombo2, dayCombo2, yearCombo2;
	private JTextArea complainArea, observeArea, prescriptArea;
	private JButton saveButton2, cancelButton2;
	private JScrollPane complainScroll, observeScroll, prescriptScroll;
	
	private JTabbedPane tabbedPane;
	private JFrame frame;
	private JPanel basicPanel, healthPanel;
	
	public PatientInfo(){
		frame = new JFrame("Patient Info");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setVisible(true);
		frame.setSize(440, 550);			
		frame.setResizable(false);
		//Set the interface to the center of the screen
		int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		frame.setLocation((screenWidth - frame.getSize().width) / 2,(screenHeight - frame.getSize().height) / 2);
		
		//Initialize components for tab1
		lastLabel = new JLabel("Lastname");
		firstLabel = new JLabel("Firstname"); 
		birthLabel = new JLabel("Birth");
		genderLabel = new JLabel("Gender");
		addrLabel = new JLabel("Address");
		contactLabel = new JLabel("Contact");
		heightLabel = new JLabel("Height(cm)");
		weightLabel = new JLabel("Weight(kg)");
		bloodLabel = new JLabel("Blood Type");
		insurLabel = new JLabel("Insurance");
		idLabel = new JLabel("ID");
		id = new JLabel();
		allergyLabel = new JLabel("Allergy");
		mediLabel = new JLabel("Medication");	
		lastField = new JTextField();
		firstField = new JTextField();
		addrField = new JTextField();
		contactField = new JTextField();
		heightField = new JTextField();
		weightField = new JTextField();
		bloodField = new JTextField();
		insurField = new JTextField();
		allergyArea = new JTextArea();
		mediArea = new JTextArea();	
		allergyScroll = new JScrollPane(allergyArea);
		mediScroll = new JScrollPane(mediArea);
		monthCombo = new JComboBox(); 
		dayCombo = new JComboBox();
		yearCombo = new JComboBox();
		saveButton = new JButton("Save");
		cancelButton = new JButton("Cancel");
		maleRadio = new JRadioButton("Male");
		femaleRadio = new JRadioButton("Female");
		radioGroup = new ButtonGroup();
		
		//Initialize components for tab1
		dateLabel = new JLabel("Date");
		tempLabel = new JLabel("Temperature(C)"); 
		pressureLabel = new JLabel("Blood Pressure");
		sugarLabel = new JLabel("Sugar");
		weightLabel2 = new JLabel("Weight(kg)");
		complainLabel = new JLabel("Complain");
		observeLabel = new JLabel("Observation");
		prescriptLabel = new JLabel("Prescription");
		tempField = new JTextField();
		pressureField = new JTextField();
		sugarField = new JTextField();
		weightField2 = new JTextField();
		monthCombo2 = new JComboBox();
		dayCombo2 = new JComboBox();
		yearCombo2 = new JComboBox();
		complainArea = new JTextArea();
		observeArea = new JTextArea();
		prescriptArea = new JTextArea();
		complainScroll = new JScrollPane(complainArea);
		observeScroll = new JScrollPane(observeArea);
		prescriptScroll = new JScrollPane(prescriptArea);
		saveButton2 = new JButton("Save");
		cancelButton2 = new JButton("Cancel");
		
		basicPanel = new JPanel();
		healthPanel = new JPanel();
		tabbedPane = new JTabbedPane();
		
		//Set ComboBoxes
		Calendar cal = Calendar.getInstance();
		yearCombo.addItem(" ");
		monthCombo.addItem(" ");
		dayCombo.addItem(" ");
		yearCombo2.addItem(" ");
		monthCombo2.addItem(" ");
		dayCombo2.addItem(" ");
		for(int i = 1900; i <= cal.get(Calendar.YEAR); i++){
			yearCombo.addItem(i);	
			yearCombo2.addItem(i);
		}
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		for(int i = 0; i < 12; i++){
			monthCombo.addItem(months[i]);
			monthCombo2.addItem(months[i]);
		}
		for(int i = 1; i <= 31; i++){
			dayCombo.addItem(i);
			dayCombo2.addItem(i);
		}
		
		//Set panels and tabbedPane
		basicPanel.setPreferredSize(new Dimension(424, 512));
		basicPanel.setLayout(null);
		healthPanel.setPreferredSize(new Dimension(424, 512));
		healthPanel.setLayout(null);
		frame.add(tabbedPane);
		tabbedPane.setBounds(0, 0, 424, 512);		
		tabbedPane.addTab("Basic", basicPanel);
		tabbedPane.addTab("Health", healthPanel);
		basicPanel.setBackground(tabbedPane.getBackground());
		healthPanel.setBackground(tabbedPane.getBackground());
		maleRadio.setBackground(tabbedPane.getBackground());
		femaleRadio.setBackground(tabbedPane.getBackground());
		
		//Add tab1 components
		basicPanel.add(lastLabel);
		basicPanel.add(firstLabel); 
		basicPanel.add(birthLabel);
		basicPanel.add(genderLabel);
		basicPanel.add(addrLabel);
		basicPanel.add(contactLabel);
		basicPanel.add(heightLabel);
		basicPanel.add(weightLabel);
		basicPanel.add(bloodLabel);
		basicPanel.add(insurLabel);
		basicPanel.add(idLabel);
		basicPanel.add(id);
		basicPanel.add(allergyLabel);
		basicPanel.add(mediLabel);	
		basicPanel.add(lastField);
		basicPanel.add(firstField);
		basicPanel.add(addrField);
		basicPanel.add(contactField);
		basicPanel.add(heightField);
		basicPanel.add(weightField);
		basicPanel.add(bloodField);
		basicPanel.add(insurField);
		basicPanel.add(allergyArea);
		basicPanel.add(mediArea);
		basicPanel.add(allergyScroll);
		basicPanel.add(mediScroll);
		basicPanel.add(monthCombo);
		basicPanel.add(dayCombo);
		basicPanel.add(yearCombo);
		basicPanel.add(saveButton);
		basicPanel.add(cancelButton);
		basicPanel.add(maleRadio);
		basicPanel.add(femaleRadio);
		radioGroup.add(maleRadio);
		radioGroup.add(femaleRadio);
		
		//Set tab1 components
		lastLabel.setBounds(20, 10, 75, 20);
		lastField.setBounds(95, 10, 100, 20);
		firstLabel.setBounds(230, 10, 75, 20);
		firstField.setBounds(305, 10, 100, 20);
		birthLabel.setBounds(20, 50, 50, 20);
		monthCombo.setBounds(70, 50, 50, 20);
		dayCombo.setBounds(125, 50, 50, 20);
		yearCombo.setBounds(180, 50, 60, 20);
		genderLabel.setBounds(270, 50, 70, 20);
		maleRadio.setBounds(325, 40, 70, 20);
		femaleRadio.setBounds(325, 60, 70, 20);
		addrLabel.setBounds(20, 90, 75, 20);
		addrField.setBounds(95, 90, 100, 20);
		contactLabel.setBounds(230, 90, 75, 20);
		contactField.setBounds(305, 90, 100, 20);
		heightLabel.setBounds(20, 130, 75, 20);
		heightField.setBounds(95, 130, 45, 20);
		weightLabel.setBounds(155, 130, 75, 20);
		weightField.setBounds(225, 130, 45, 20);
		bloodLabel.setBounds(285, 130, 75, 20);
		bloodField.setBounds(360, 130, 45, 20);
		insurLabel.setBounds(20, 170, 75, 20);
		insurField.setBounds(95, 170, 100, 20);
		idLabel.setBounds(230, 170, 20, 20);
		id.setBounds(250, 170, 100, 20);
		allergyLabel.setBounds(20, 205, 75, 20);
		allergyArea.setBounds(95, 210, 310, 100);
		allergyScroll.setBounds(95, 210, 310, 100);
		mediLabel.setBounds(20, 325, 75, 20);
		mediArea.setBounds(95, 330, 310, 100);
		mediScroll.setBounds(95, 330, 310, 100);
		saveButton.setBounds(180, 450, 100, 30);
		cancelButton.setBounds(305, 450, 100, 30);
		
		//Add tab2 components
		healthPanel.add(dateLabel);
		healthPanel.add(tempLabel); 
		healthPanel.add(pressureLabel);
		healthPanel.add(sugarLabel);
		healthPanel.add(weightLabel2);
		healthPanel.add(complainLabel);
		healthPanel.add(observeLabel);
		healthPanel.add(prescriptLabel);
		healthPanel.add(tempField);
		healthPanel.add(pressureField);
		healthPanel.add(sugarField);
		healthPanel.add(weightField2);	
		healthPanel.add(monthCombo2);
		healthPanel.add(dayCombo2);
		healthPanel.add(yearCombo2);
		healthPanel.add(complainArea);
		healthPanel.add(observeArea);
		healthPanel.add(prescriptArea);
		healthPanel.add(complainScroll);
		healthPanel.add(observeScroll);
		healthPanel.add(prescriptScroll);
		healthPanel.add(saveButton2);
		healthPanel.add(cancelButton2);
		
		//Set tab1 components
		dateLabel.setBounds(20, 10, 50, 20);
		monthCombo2.setBounds(70, 10, 50, 20);
		dayCombo2.setBounds(125, 10, 50, 20);
		yearCombo2.setBounds(180, 10, 60, 20);
		tempLabel.setBounds(265, 10, 100, 20);
		tempField.setBounds(365, 10, 40, 20);
		pressureLabel.setBounds(20, 50, 100, 20);
		pressureField.setBounds(120, 50, 40, 20);		
		sugarLabel.setBounds(185, 50, 50, 20);
		sugarField.setBounds(230, 50, 40, 20);
		weightLabel2.setBounds(290, 50, 70, 20);
		weightField2.setBounds(365, 50, 40, 20);
		complainLabel.setBounds(20, 85, 70, 20);
		complainArea.setBounds(100, 90, 305, 100);
		complainScroll.setBounds(100, 90, 305, 100);		
		observeLabel.setBounds(20, 205, 70, 20);
		observeArea.setBounds(100, 210, 305, 100);
		observeScroll.setBounds(100, 210, 305, 100);		
		prescriptLabel.setBounds(20, 325, 70, 20);
		prescriptArea.setBounds(100, 330, 305, 100);
		prescriptScroll.setBounds(100, 330, 305, 100);		
		saveButton2.setBounds(180, 450, 100, 30);
		cancelButton2.setBounds(305, 450, 100, 30);
		
		//Set button event
		ButtonListen btnListener = new ButtonListen();
		saveButton.addActionListener(btnListener);
		cancelButton.addActionListener(btnListener);
		saveButton2.addActionListener(btnListener);
		cancelButton2.addActionListener(btnListener);
	}
	
	public void PatientInfoVisible(){
		frame.setVisible(true);		
	}
	
	private class ButtonListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == saveButton){
				//Check if the information are correctly entered
				if(lastField.getText().length() == 0 || firstField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the names!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}				
				else if(maleRadio.isSelected() == false && femaleRadio.isSelected() == false){
					JOptionPane.showMessageDialog(null, "Please select the gender!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if(addrField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the address!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if(contactField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the contact!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}				
				else if(heightField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the height!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if(weightField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the weight!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if(bloodField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the blood type!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if(insurField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the insurance information!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if(allergyArea.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the allergy!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if(mediArea.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the medication!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}				
				else if((monthCombo.getSelectedIndex() == 4 || monthCombo.getSelectedIndex() == 6 || 
				monthCombo.getSelectedIndex() == 9 || monthCombo.getSelectedIndex() == 11) &&
				dayCombo.getSelectedIndex() > 30){
					JOptionPane.showMessageDialog(null, "Birth is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if((monthCombo.getSelectedIndex() == 2 && ((int)(yearCombo.getSelectedItem()) % 4 == 0 &&
				((int)yearCombo.getSelectedItem()) % 100 == 0 && ((int)yearCombo.getSelectedItem()) % 400 == 0)) &&
				dayCombo.getSelectedIndex() > 29){
					JOptionPane.showMessageDialog(null, "Birth is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				else if((monthCombo.getSelectedIndex() == 2 && ((int)(yearCombo.getSelectedItem()) % 4 == 0 &&
				((int)yearCombo.getSelectedItem()) % 100 != 0)) &&
				dayCombo.getSelectedIndex() > 29){
					JOptionPane.showMessageDialog(null, "Birth is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				else if((monthCombo.getSelectedIndex() == 2 && ((int)(yearCombo.getSelectedItem()) % 4 != 0 ||
				(((int)yearCombo.getSelectedItem()) % 100 == 0 && ((int)yearCombo.getSelectedItem()) % 400 != 0))) &&
				dayCombo.getSelectedIndex() > 28){
					JOptionPane.showMessageDialog(null, "Birth is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(monthCombo.getSelectedIndex() == 0 || dayCombo.getSelectedIndex() == 0 || yearCombo.getSelectedIndex() == 0 ){
					JOptionPane.showMessageDialog(null, "Please enter birth date!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}	
			}
			else if (e.getSource() == cancelButton){
//				SearchPatient searchPatient = new SearchPatient();
//				searchPatient.SearchPatientVisible();
//				frame.setVisible(false);
			}
			else if (e.getSource() == saveButton2){
				//Check if the information are correctly entered
				if(tempField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the temperature!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}
				else if(pressureField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the blood pressure!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}
				else if(sugarField.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the blood sugar level!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}
				else if(weightField2.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the weight!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}				
				else if(complainArea.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the complain!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}
				else if(observeArea.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the observation!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}
				else if(prescriptArea.getText().length() == 0){
					JOptionPane.showMessageDialog(null, "Please enter the prescription!", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}				
				else if((monthCombo2.getSelectedIndex() == 4 || monthCombo2.getSelectedIndex() == 6 || 
				monthCombo2.getSelectedIndex() == 9 || monthCombo2.getSelectedIndex() == 11) &&
				dayCombo2.getSelectedIndex() > 30){
					JOptionPane.showMessageDialog(null, "Date is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
				else if((monthCombo2.getSelectedIndex() == 2 && ((int)(yearCombo2.getSelectedItem()) % 4 == 0 &&
				((int)yearCombo2.getSelectedItem()) % 100 == 0 && ((int)yearCombo2.getSelectedItem()) % 400 == 0)) &&
				dayCombo2.getSelectedIndex() > 29){
					JOptionPane.showMessageDialog(null, "Date is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				else if((monthCombo2.getSelectedIndex() == 2 && ((int)(yearCombo2.getSelectedItem()) % 4 == 0 &&
				((int)yearCombo2.getSelectedItem()) % 100 != 0)) &&
				dayCombo2.getSelectedIndex() > 29){
					JOptionPane.showMessageDialog(null, "Date is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				else if((monthCombo2.getSelectedIndex() == 2 && ((int)(yearCombo2.getSelectedItem()) % 4 != 0 ||
				(((int)yearCombo2.getSelectedItem()) % 100 == 0 && ((int)yearCombo2.getSelectedItem()) % 400 != 0))) &&
				dayCombo2.getSelectedIndex() > 28){
					JOptionPane.showMessageDialog(null, "Date is wrong!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(monthCombo2.getSelectedIndex() == 0 || dayCombo2.getSelectedIndex() == 0 || yearCombo2.getSelectedIndex() == 0 ){
					JOptionPane.showMessageDialog(null, "Please enter the date!", "ERROR", JOptionPane.INFORMATION_MESSAGE);	
				}
			}
			else if (e.getSource() == cancelButton2){
//				SearchPatient searchPatient = new SearchPatient();
//				searchPatient.SearchPatientVisible();
//				frame.setVisible(false);
			}
		}
	}
}
