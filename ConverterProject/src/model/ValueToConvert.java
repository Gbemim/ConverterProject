package model;

import controller.Subject;
import view.ConverterPanel;


/* The model comprises a class named ValueToConvert that
 1) encapsulates the values in centimeters that are specified by the user in the CentimetersConversionArea JTextArea.
 2) When the ValueToConvert�state changes, ValueToConvert notifies FeetConversionArea and
MeterConversionArea. */

public class ValueToConvert extends Subject {
	private double cm = 0;	
	/*
	 * This is a constructor which sets up a main panel
	 * and initializes a class for converting values.
	 * 
	 *  @param converterPanel the main interface for the application
	 */
	public ValueToConvert(ConverterPanel panel) {
		panel.getMeterConversionArea().setSubject(this);
		panel.getFeetConversionArea().setSubject(this);
		addObserver(panel.getFeetConversionArea());
		addObserver(panel.getMeterConversionArea());
		notifyObjects();
	}
	
	/*
	 * This obtains a new input value and assigns it to cm.
	 * It also calls a method to notify other JTextAreas with the updated value.
	 * 
	 * @param cm a new value in centimeters
	 */
	public void setValue(double cm) {
		this.cm = cm;		
		notifyObjects();

	}
	
	public double getValue() {
		return cm;
		}
	
}
