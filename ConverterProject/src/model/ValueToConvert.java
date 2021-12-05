package model;

import view.ConverterPanel;


/* The model comprises a class named ValueToConvert that
 1) encapsulates the values in centimeters that are specified by the user in the CentimetersConversionArea JTextArea.
 2) When the ValueToConvert�state changes, ValueToConvert notifies FeetConversionArea and
MeterConversionArea. */

public class ValueToConvert extends Subject {
	ConverterPanel panel;
	private double cm = 0;	
	/*
	 * This is a constructor which sets up a main panel
	 * and initializes a class for converting values.
	 * 
	 *  @param p the main interface for the application
	 */
	public ValueToConvert(ConverterPanel p) {
		panel = p;
		panel.getMeterConversionArea().setSubject(this);
		panel.getFeetConversionArea().setSubject(this);
		addObserver(panel.getFeetConversionArea());
		addObserver(panel.getMeterConversionArea());
		notifyObjects();
	}
	
	/*
	 * This obtains a new input value and assigns it to cm.
	 * If received String is not valid input, does not assign value to cm and empties cmArea string.
	 * It also calls a method to notify other JTextAreas with the updated value.
	 * 
	 * @param userInput a new value in centimeters
	 */
	public void save(String userInput) {
		
		//updates model only if its a whole number
		if (userInput.matches("^\\d+$")) {
			this.cm = Integer.parseInt(userInput);
		} else {
			panel.getCmArea().setText("");
		}	
		notifyObjects();
	}
	
	/*
	 * This obtains a new input value in cm.
	 * 
	 * @return the obtained value in centimeters
	 */
	public double getValue() {
		return cm;
	}
	
}
