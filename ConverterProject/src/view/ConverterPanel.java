package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

public class ConverterPanel extends JPanel {
	JTextArea feetConversionArea = new JTextArea("0",14,21);
	JTextArea meterConversionArea = new JTextArea("0",14,21);
	JTextArea centimetersConversionArea = new JTextArea("0",14,21);
	
	public ConverterPanel() {
		setTextColors();
		meterConversionArea.setEditable(false);
		feetConversionArea.setEditable(false);
		centimetersConversionArea.getDocument().putProperty("filterNewlines", Boolean.TRUE); // creates space instead of new line
		add(feetConversionArea);
		add(meterConversionArea);
		add(centimetersConversionArea);

	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public void setTextColors() {
		feetConversionArea.setBackground(Color.GREEN);
		centimetersConversionArea.setBackground(Color.YELLOW);
		meterConversionArea.setBackground(Color.ORANGE);
	}
	
	public JTextArea getMeterArea() { return meterConversionArea; }
	public JTextArea getCmArea() { return centimetersConversionArea; }
	public JTextArea getFeetArea() { return feetConversionArea; }
	
}
