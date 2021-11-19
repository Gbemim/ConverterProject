package model;

import view.ConverterPanel;

/* The model comprises a class named ValueToConvert that
 1) encapsulates the values in centimeters that are specified by the user in the CentimetersConversionArea JTextArea.
 2) When the ValueToConvert‘state changes, ValueToConvert notifies FeetConversionArea and
MeterConversionArea. */

public class ValueToConvert {
	//Satisfies 1)
	double cm; 
	private final ConverterPanel panel;
	
	/*
	 * This is a constructor which sets up a main panel
	 * and initializes a class for converting values.
	 * 
	 *  @param converterPanel the main interface for the application
	 */
	public ValueToConvert(ConverterPanel converterPanel) {
		this.panel = converterPanel;
	}
	
	/*
	 * This obtains a new input value and assigns it to cm.
	 * It also calls a method to notify other JTextAreas with the updated value.
	 * 
	 * @param cm a new value in centimeters
	 */
	public void updateValue(double cm) {
		this.cm = cm;
		notifyAreas();
		}
	
	//Satisfies 2)
	/*
	 * This notifies two JTextAreas to update converted values.
	 */
	public void notifyAreas() {
		panel.getFeetArea().setText(cmToFeet(cm) + " ft");	
		panel.getMeterArea().setText(cmToMeter(cm) + " m");
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
