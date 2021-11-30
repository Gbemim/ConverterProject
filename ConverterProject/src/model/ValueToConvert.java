package model;

import controller.Subject;
import view.ConverterPanel;


/* The model comprises a class named ValueToConvert that
 1) encapsulates the values in centimeters that are specified by the user in the CentimetersConversionArea JTextArea.
 2) When the ValueToConvert�state changes, ValueToConvert notifies FeetConversionArea and
MeterConversionArea. */

public class ValueToConvert extends Subject {
	private double cm;
	ConverterPanel panel;
	
	/*
	 * This is a constructor which sets up a main panel
	 * and initializes a class for converting values.
	 * 
	 *  @param converterPanel the main interface for the application
	 */
	public ValueToConvert(ConverterPanel pan) {
		cm = 0;
		panel = pan;
		pan.getMeterConversionArea().setSubject(this);
		pan.getFeetConversionArea().setSubject(this);
		addObserver(pan.getFeetConversionArea());
		addObserver(pan.getMeterConversionArea());
		//new MeterConversionArea(this);
		//new FeetConversionArea(this);
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
	}
	
	public double getValue() {
		return cm;
		}

	/*
	 * This is a converter from the input value in cm to a value in feet.
	 * 
	 * @param cm a new value to convert
	 * @return a converted value in string
	 */
	public String cmToFeet(double cm) {
		return Double.toString(cm/30.48);
	}
	
	/*
	 * This is a converter from the input value in cm to a value in meters.
	 * 
	 * @param cm a new value to convert
	 * @return a converted value in string
	 */
	public String cmToMeter(double cm) {
		return Double.toString(cm/100);
	}


	
	
}
