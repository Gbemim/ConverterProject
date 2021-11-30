package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.Observer;

import java.awt.*;

public class ConverterPanel extends JPanel {
	private FeetConversionArea feetConversionArea;
	private MeterConversionArea meterConversionArea;
	private JTextArea centimetersConversionArea;
	
	/*
	 * This is a default constructor for the three JTextAreas.
	 */
	public ConverterPanel() {
		centimetersConversionArea = new JTextArea("0",14,21);
		centimetersConversionArea.setBackground(Color.YELLOW);
		centimetersConversionArea.getDocument().putProperty("filterNewlines", Boolean.TRUE); // creates space instead of new line
		
		feetConversionArea = new FeetConversionArea("0 ft",14,21);
		feetConversionArea.setEditable(false);
		feetConversionArea.setBackground(Color.GREEN);
		
		meterConversionArea = new MeterConversionArea("0 m",14,21);
		meterConversionArea.setEditable(false);
		meterConversionArea.setBackground(Color.ORANGE);
		
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
	
	public FeetConversionArea getFeetConversionArea() { return feetConversionArea;}
	
	public MeterConversionArea getMeterConversionArea() { return meterConversionArea;}

	public void setMeterArea(MeterConversionArea meterArea) { meterConversionArea = meterArea; }
	

	public JTextArea getCmArea() { return centimetersConversionArea; }
	
	/*
	 * This obtains a JTextArea which is for converting to feet.
	 * 
	 * @return the area for feet 
	 */
	public void setFeetArea( FeetConversionArea ftArea) {feetConversionArea = ftArea; }
	
}



