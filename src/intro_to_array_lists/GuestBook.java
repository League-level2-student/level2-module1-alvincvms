package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton viewName;
	String n;
	String l = "";
	ArrayList<String> names = new ArrayList<String>();
	
	void run() {
		frame = new JFrame("Guestbook");
		panel = new JPanel();
		addName = new JButton("Add Name");
		viewName = new JButton("View Names");
		
		addName.addActionListener(this);
		viewName.addActionListener(this);
		
		panel.add(addName);
		panel.add(viewName);
		frame.add(panel);
		
		frame.pack();
		frame.setLocation(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addName) {
			names.add(JOptionPane.showInputDialog("Please sign the name here:"));
			l = "";
			for(int i = 0; i < names.size(); i++) {
				
				n = "guest #" + (i+1) + " " + names.get(i) + "\n";
				l += n;
				
			}
		}
		if (e.getSource() == viewName) {
			
			
			JOptionPane.showMessageDialog(null, l);
		}
	}
}
