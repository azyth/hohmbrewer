import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Component {
	
	public void buildControlls(ActionListener app){
		//inputs-room temp, batch size, grain temp, brew system size, efeciency,
		JPanel action = new JPanel(new GridLayout(1,1));
		JButton brew = new JButton("Brew");
		brew.addActionListener(app);
		action.add(brew);
	}
	public void buildCalculators(){
		//IBU calculator
		//Strike H20
		//Mash H20
	}
	public void buildGrainList(){
		//input line,amount,
		//display of added grains
	}
	public void buildHopList(){
		//input line, amount, AA, boil time, -> IBU,
		//display of added hops.
	}
	public void buildMash(){
		
	}

}
