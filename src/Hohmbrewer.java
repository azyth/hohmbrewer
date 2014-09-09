
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;


public class Hohmbrewer implements ActionListener{

	public static void main(String[] args) throws IOException{
		Calculators calc = new Calculators();
		calc.interfaceCalcIBU();
//		javax.swing.SwingUtilities.invokeLater(new Runnable() {
//	          public void run() { createAndShowGUI(); }
//	      }  );
	}
	public static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);  
		JFrame frame = new JFrame("Hohm Brewer 2.0"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Hohmbrewer app = new Hohmbrewer();
		
		JPanel action = new JPanel(new GridLayout(1,1));
		JButton brew = new JButton("Brew");
		brew.addActionListener(app);
		action.add(brew);
		
		frame.add(action);
		
		frame.pack();  
		frame.setVisible(true);
		frame.setSize(650, 650);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
