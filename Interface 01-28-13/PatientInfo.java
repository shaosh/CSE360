import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PatientInfo extends JFrame{
	//Component for Basic Info page
	private JLabel lastLabel, firstLabel, birthLabel, genderLabel;
	private JLabel addrLabel, contactLabel, heighLabel, weightLabel;
	private JLabel bloodLabel, insurLabel, allergyLabel, mediLabel;	
	private JTextField lastField, firstField, addrField, contactField;
	private JTextField heightField, weightField, bloodField, insurField;
	private JTextArea allergyArea, mediArea;	
	private JComboBox monthCombo, dayCombo, yearCombo;
	private JButton saveButton, cancelButton;
	private JRadioButton maleRadio, femaleRadio;
	private ButtonGroup radioGroup;
	
	//Component for Health Info page
	private JLabel dateLabel, tempLabel, pressureLabel, sugarLabel;
	private JLabel weightLabel2, complainLabel, observeLabel, prescriptLabel;
	private JTextField tempField, pressureField, sugarField, weightField2;
	private JComboBox monthCombo2, dayCombo2, yearCombo2;
	private JTextArea complainArea, observeArea, prescriptArea;
	private JButton saveButton2, cancelButton2;
	
	private JTabbedPane tabbedPane;
	private JFrame frame;
	private JPanel panel;
	
	public PatientInfo(){
		frame = new JFrame("Patient Info");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setVisible(true);
		frame.setSize(440, 550);			
		frame.setResizable(true);
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
		heighLabel = new JLabel("Height");
		weightLabel = new JLabel("Weight");
		bloodLabel = new JLabel("Blood Type");
		insurLabel = new JLabel("Insurance");
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
		tempLabel = new JLabel("Temperature"); 
		pressureLabel = new JLabel("Blood Pressure");
		sugarLabel = new JLabel("Sugar");
		weightLabel2 = new JLabel("Weight");
		complainLabel = new JLabel("Complain");
		observeLabel = new JLabel("Observe");
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
		saveButton2 = new JButton("Save");
		cancelButton2 = new JButton("Cancel");
		
		panel = new JPanel();
		tabbedPane = new JTabbedPane();
		
		panel.setPreferredSize(new Dimension(440, 550));
		panel.setLayout(null);
		frame.add(panel);
		panel.add(tabbedPane);
		
		tabbedPane.setBounds(0, 0, 440, 550);
		tabbedPane.addTab("Basic", null);
		tabbedPane.addTab("Health", null);
	}
	
	public void PatientInfoVisible(){
		frame.setVisible(true);		
	}
}
