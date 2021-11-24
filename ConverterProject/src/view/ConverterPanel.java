package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

public class ConverterPanel extends JPanel {
	private JTextArea feetConversionArea;
	private JTextArea meterConversionArea;
	private JTextArea centimetersConversionArea;
	
	/*
	 * This is a default constructor for the three JTextAreas.
	 */
	public ConverterPanel() {
		feetConversionArea = new JTextArea("0",14,21);
		meterConversionArea = new JTextArea("0",14,21);
		centimetersConversionArea = new JTextArea("0",14,21);
		
		setTextColors();
		meterConversionArea.setEditable(false);
		feetConversionArea.setEditable(false);
		centimetersConversionArea.getDocument().putProperty("filterNewlines", Boolean.TRUE); // creates space instead of new line
		add(feetConversionArea);
		add(meterConversionArea);
		add(centimetersConversionArea);

	}
	
	/*
	 * This paints the major components on the panel.
	 * 
	 * @param g
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	/*
	 * This sets up the colors of each JTextArea's background.
	 */
	public void setTextColors() {
		feetConversionArea.setBackground(Color.GREEN);
		centimetersConversionArea.setBackground(Color.YELLOW);
		meterConversionArea.setBackground(Color.ORANGE);
	}
	
	/*
	 * This obtains a JTextArea which is for converting to meters.
	 * 
	 * @return the area for meters 
	 */
	public JTextArea getMeterArea() { return meterConversionArea; }
	
	/*
	 * This obtains a JTextArea for the user input.
	 * 
	 * @return the area for the user input
	 */
	public JTextArea getCmArea() { return centimetersConversionArea; }
	
	/*
	 * This obtains a JTextArea which is for converting to feet.
	 * 
	 * @return the area for feet 
	 */
	public JTextArea getFeetArea() { return feetConversionArea; }
	
}
