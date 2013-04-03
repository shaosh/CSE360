import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PatientList extends JFrame {
	private JList list;
	private JButton enterButton, gobackButton;
	private JFrame frame;
	private JPanel panel;
	private JScrollPane scroll;
	
	public PatientList(){
		frame = new JFrame("Patient List");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setVisible(true);
		frame.setSize(450, 300);			
		frame.setResizable(false);
		//Set the interface to the center of the screen
		int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		frame.setLocation((screenWidth - frame.getSize().width) / 2,(screenHeight - frame.getSize().height) / 2); 
		
		//Initialize components
		list = new JList();
		enterButton = new JButton("Enter");
		gobackButton = new JButton("Go Back");
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(450, 300));
		panel.setLayout(null);
		
		//Set and add components to the panel
		DefaultListModel defaultItem = new DefaultListModel();
		defaultItem.addElement("New Patient");
		//Need to add searched item here
		//Need to add searched item here
		list.setModel(defaultItem);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(list);
		scroll = new JScrollPane(list);
		panel.add(scroll);
		panel.add(enterButton);
		panel.add(gobackButton);
		frame.add(panel);
				
		//Adjust component position
//		list.setBounds(50, 25, 350, 175);
		scroll.setBounds(new Rectangle(50, 50, 350, 150));
		enterButton.setBounds(175, 225, 100, 30);
		gobackButton.setBounds(300, 225, 100, 30);
		
		//Set button event
		ButtonListen btnListener = new ButtonListen();
		enterButton.addActionListener(btnListener);
		gobackButton.addActionListener(btnListener);
	}
	
	public void PatientListVisible(){
		frame.setVisible(true);		
	}
	
	private class ButtonListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == enterButton){
				if(list.getSelectedIndex() == 0){
								
				}
				else{
					History history = new History();
					history.HistoryVisible();
					frame.setVisible(false);
				}
			}
			else if (e.getSource() == gobackButton){
				SearchPatient searchPatient = new SearchPatient();
				searchPatient.SearchPatientVisible();
				frame.setVisible(false);
			}
		}
	}
}
