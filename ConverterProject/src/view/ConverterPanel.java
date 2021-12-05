package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

/*
 * This behaves as a Receiver for a Command design pattern.
 */
public class ConverterPanel extends JPanel {
	private FeetConversionArea feetConversionArea;
	private MeterConversionArea meterConversionArea;
	private CentimetersConversionArea centimetersConversionArea;
	
	/*
	 * This is a default constructor for the three JTextAreas.
	 */
	public ConverterPanel() {
		centimetersConversionArea = new CentimetersConversionArea("0",14,21);
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
	
	/*
	 * This obtains the area for a feet conversion
	 * 
	 * @return area for a feet conversion
	 */
	public FeetConversionArea getFeetConversionArea() { return feetConversionArea;}
	
	/*
	 * This obtains the area for a meter conversion
	 * 
	 * @return area for a meter conversion
	 */
	public MeterConversionArea getMeterConversionArea() { return meterConversionArea;}

	/*
	 * This obtains the area for a user input
	 * 
	 * @return area for a user input
	 */
	public CentimetersConversionArea getCmArea() { return centimetersConversionArea;}
}



