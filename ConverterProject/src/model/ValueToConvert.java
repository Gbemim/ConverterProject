package model;

import controller.Observer;
import controller.Subject;
import view.ConverterPanel;

/* The model comprises a class named ValueToConvert that
 1) encapsulates the values in centimeters that are specified by the user in the CentimetersConversionArea JTextArea.
 2) When the ValueToConvert�state changes, ValueToConvert notifies FeetConversionArea and
MeterConversionArea. */

public class ValueToConvert implements Subject {
	//Satisfies 1)
	private double cm = 0; 
	Observer conversionObserver;
	
	/*
	 * This is a constructor which sets up a main panel
	 * and initializes a class for converting values.
	 * 
	 *  @param converterPanel the main interface for the application
	 */
	public ValueToConvert(double startingCM) {
		cm = startingCM;
	}
	
	/*
	 * This obtains a new input value and assigns it to cm.
	 * It also calls a method to notify other JTextAreas with the updated value.
	 * 
	 * @param cm a new value in centimeters
	 */
	public void getValue(double cm) {
		this.cm = cm;
		notify(cmToMeter(cm) + " m",cmToFeet(cm) + " ft");
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

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		conversionObserver = o;
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		conversionObserver = null;
	}

	@Override
	public void notify(String meters, String feet) {
		// TODO Auto-generated method stub
		conversionObserver.update(meters, feet);
	}
	
	
}
