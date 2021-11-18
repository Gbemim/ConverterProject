package model;

public class ValueToConvert {
	
	public static String cmToFeet(double cm) {
		return Double.toString(cm/30.48) + " ft";
	}
	
	public static String  cmToMeters(double cm) {
		return Double.toString(cm/100) + " m";
	}
}
