import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class History extends JFrame {
	private JLabel nameLabel, name, idLabel, id;
	private JList list;
	private JButton openButton, gobackButton, indicatorButton;
	private JFrame frame;
	private JPanel panel;
	private JScrollPane scroll;
	
	public History(){
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
		nameLabel = new JLabel("Name:");
		name = new JLabel();
		idLabel = new JLabel("ID:");
		id = new JLabel();
		list = new JList();
		
		indicatorButton = new JButton("Indicators");
		openButton = new JButton("Enter");
		gobackButton = new JButton("Go Back");
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(450, 300));
		panel.setLayout(null);
		
		//Set and add components to the panel
		DefaultListModel defaultItem = new DefaultListModel();
		defaultItem.addElement("New Visit");

		//Need to add history entry here
		//Need to add history entry here
		list.setModel(defaultItem);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(list);
		scroll = new JScrollPane(list);
		panel.add(scroll);
		panel.add(nameLabel);
		panel.add(name);
		panel.add(idLabel);
		panel.add(id);		
		panel.add(indicatorButton);
		panel.add(openButton);
		panel.add(gobackButton);
		frame.add(panel);
				
		//Adjust component position
		nameLabel.setBounds(50, 25, 50, 20);
		name.setBounds(110, 25, 100, 20);
		idLabel.setBounds(220, 25, 30, 20);
		id.setBounds(260, 25, 100, 20);
		scroll.setBounds(new Rectangle(50, 50, 350, 150));
		indicatorButton.setBounds(50, 225, 100, 30);
		openButton.setBounds(175, 225, 100, 30);
		gobackButton.setBounds(300, 225, 100, 30);
		
		//Set button event
		ButtonListen btnListener = new ButtonListen();
		indicatorButton.addActionListener(btnListener);
		openButton.addActionListener(btnListener);
		gobackButton.addActionListener(btnListener);
	}
	
	public void HistoryVisible(){
		frame.setVisible(true);		
	}
	
	private class ButtonListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == indicatorButton){
				
			}
			else if (e.getSource() == openButton){
				if(list.getSelectedIndex() == 0){
								
				}
				else{
//					History history = new History();
//					history.HistoryVisible();
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
