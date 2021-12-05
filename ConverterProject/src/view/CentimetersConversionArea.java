package view;

import javax.swing.JTextArea;

import model.Subject;

/*
 * This class behaves as a Concrete Command for a Command design pattern.
 */
public class CentimetersConversionArea extends JTextArea implements Observer {
	
	private Subject subject;
	
	/*
	 * This is a constructor for a new JTextArea with a string and the number of rows and columns 
	 * 
	 * @param str the area name for a feet conversion
	 * @param r the number of rows
	 * @param c the number of columns
	 */
	public CentimetersConversionArea(String str, int r, int c) {
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
	 * does nothing for this Observer implementation
	 */
	public void update() {
		
	}
}

