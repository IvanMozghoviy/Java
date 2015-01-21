import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Pimp {
	
	private JTextField textfield;
	private JButton pimp;
	private JButton load;
	
	private JButton pimp (){
		
		return pimp;
	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ();
		frame.setTitle("pimp my ride");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
