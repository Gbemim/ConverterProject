package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.*;

public class ConverterPanel extends JPanel {
	JTextArea greenArea = new JTextArea(200,200);
	JTextArea yellowArea = new JTextArea(200,200);
	JTextArea orangeArea = new JTextArea(200,200);
	
	public ConverterPanel() {
		add(greenArea);
		add(yellowArea);
		add(orangeArea);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.GREEN);
		g.fillRect(100, 10, 200, 200);
		
		g.setColor(Color.ORANGE);
		g.fillRect(305, 10, 200, 200);
		
		g.setColor(Color.YELLOW);
		g.fillRect(200, 215, 200, 200);
		
		//paintText(g);
	}
	
	public void textAreaPositions() {
	}
	
}
