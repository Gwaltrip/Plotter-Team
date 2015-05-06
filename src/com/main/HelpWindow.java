package com.main;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class HelpWindow extends JDialog{
	int HEIGHT=600;
	int WIDTH=700;
	
	private JPanel pan;
	private JTextPane txtPane;
	
	public HelpWindow(){
		setBounds(30,30,WIDTH,HEIGHT);
		setTitle("ReadMe");
		setModal(true);
		pan=new JPanel();
		pan.setLayout(null);
		txtPane = new JTextPane();
		txtPane.setBounds(5, 5, 690, 585);
		txtPane.setText("Welcome to the Plotter help page. Here lies information on "
				+ "how exactly to use the Ploter program.\n"
				+ "\n1) Entering a function:\n"
				+ "- Functions can be entered into the text field right above the graph.\n"
				+ "- The proper variable names must be used on each coordinate system:\n"
				+ "	- \"x\" in Cartesian 2D\n"
				+ "	- \"x\", \"y\" in Polar 2D\n"
				+ "	- \"x\", \"y\", \"z\" in Cartesian 3D\n"
				+ "- Coefficients must be entered with multiplication sign, i.e: \"2*x\" is equivalent to 2x.\n"
				+ "- Once equation is entered, draw can be pressed to draw resultant graph.\n"
				+ "\n2) Controls:\n"
				+ "- Graphs can be navigated by using the arrow keys along with clicking them with the mouse.\n"
				+ "- Display Ranges can be entered into the text fields to adjust the display range, \"Draw\" must be pressed to update graph.\n"
				+ "- The arrow buttons next to the display ranges increse or decrease the range by 1 and update graph.\n"
				+ "- Zoom in/out is contoled with the \"+\" and \"-\" buttons respectively.\n"
				+ "- The \"Draw\" button will draw a graph for the input range.\n"
				+ "- The \"Show DF\" button will display a derivative on a Cartesian 2D graph.\n"
				+ "- The \"Integral\" button will pop up a window for calculating integrals.\n"
				+ "- The \"Visualization\" tab will allow for switching between Cartesian 2D or 3D, and Polar 2D.\n"
				+ "- The \"Recenter\" button will bring the graph back to it's original coordinates and zoom.\n"
				+ "- The \"Colors\" tab allows for selection of different colors to be used in graph.\n"
				+ "- The \"Save\" tab allows for saving of graph into image file and exportation of data into a file.\n"
				+ "\n3) Supported Oporations\n"
				+ "- addition: \"+\"\n"
				+ "- subtraction: \"-\"\n"
				+ "- multiplication: \"*\"\n"
				+ "- division: \"/\"\n"
				+ "- power: \"^\"\n"
				+ "- sine: \"sin()\"\n"
				+ "- cosine: \"cos()\"\n"
				+ "- tangent: \"tan()\"\n"
				+ "- parentheses are allowed to aid in order of operations");
		txtPane.setEditable(false);
		pan.add(txtPane);
		add(pan);
		setVisible(true);
	}

}
