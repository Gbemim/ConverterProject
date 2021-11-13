package view;

import javax.swing.*;
import java.awt.*;

public class ConverterPanel extends JPanel{
	
	public ConverterPanel() {
		super(null);
		//super.setBackground(new Color(112, 176, 49));
		//uiFont = new Font("UI", Font.BOLD, 15);
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
		
		paintText(g);
	}
	
	private void paintText(Graphics g) {
		// after user input
		
		g.setColor(Color.BLACK);
		g.drawString("0 ft", 100, 20);
		g.drawString("0 m", 305, 20);
		g.drawString("0", 200, 225);
		
	}

}
