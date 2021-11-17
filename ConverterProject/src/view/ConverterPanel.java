package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

public class ConverterPanel extends JPanel {
	JTextArea greenArea = new JTextArea("0",14,21);
	JTextArea yellowArea = new JTextArea("0",14,21);
	JTextArea orangeArea = new JTextArea("0",14,21);
	
	public ConverterPanel() {
		setTextColors();
		setTextPositions();
		add(greenArea);
		add(yellowArea);
		add(orangeArea);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public void setTextPositions() {
		greenArea.setLocation(100,10);
		yellowArea.setLocation(305,10);
		orangeArea.setLocation(200,215);
	}
	
	public void setTextColors() {
		greenArea.setBackground(Color.GREEN);
		yellowArea.setBackground(Color.YELLOW);
		orangeArea.setBackground(Color.ORANGE);
	}
	
}
