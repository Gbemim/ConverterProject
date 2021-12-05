package view;

import javax.swing.JTextArea;

import model.Subject;

/*
 * This is one of Concrete Observer for the Observer design pattern
 */
public class MeterConversionArea extends JTextArea implements Observer{
	private Subject subject;
	private double cm;
	
	/*
	 * This is a constructor for a new JTextArea with a string and the number of rows and columns 
	 * 
	 * @param str the area name for a feet conversion
	 * @param r the number of rows
	 * @param c the number of columns
	 */
	public MeterConversionArea(String str, int r, int c) {
		super(str,r,c);
	}
	
	/*
	 * This sets the name of a conversion area
	 * 
	 * @param sub name of a conversion area
	 */
	public void setSubject(Subject sub) {
		subject = sub;
	}
	
	/*
	 * This updates a new value based on the obtained input
	 */
	@Override
	public void update() {
		cm = subject.getValue();
		setText(conversion());
	}
	
	/*
	 * This converts the input in feet
	 * 
	 * @return the converted value in feet
	 */
	private String conversion() {
		return Double.toString(cm/100)+ " m";
	}	
}
