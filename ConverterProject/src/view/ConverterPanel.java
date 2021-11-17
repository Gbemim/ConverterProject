package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

public class ConverterPanel extends JPanel {
	JTextArea greenArea = new JTextArea("0",14,21);
	JTextArea orangeArea = new JTextArea("0",14,21);
	JTextArea yellowArea = new JTextArea("0",14,21);
	
	public ConverterPanel() {
		setTextColors();
		orangeArea.setEditable(false);
		greenArea.setEditable(false);
		add(greenArea);
		add(orangeArea);
		add(yellowArea);

	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public void setTextColors() {
		greenArea.setBackground(Color.GREEN);
		yellowArea.setBackground(Color.YELLOW);
		orangeArea.setBackground(Color.ORANGE);
	}
	
}
