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
	
	public ValueToConvert(ConverterPanel converterPanel) {
		this.panel = converterPanel;
	}
	
	public void updateValue(double cm) {
		this.cm = cm;
		notifyAreas();
		}
	
	//Satisfies 2)
	public void notifyAreas() {
		panel.getFeetArea().setText(cmToFeet(cm) + " ft");	
		panel.getMeterArea().setText(cmToMeter(cm) + " m");
	}
	
	public String cmToFeet(double cm) {
		return Double.toString(cm/30.48);
	}
	
	public String cmToMeter(double cm) {
		return Double.toString(cm/100);
	}
	
	
}
