package view;

import javax.swing.JTextArea;

import controller.Observer;
import controller.Subject;

public class FeetConversionArea extends JTextArea implements Observer{
	
	private Subject subject;
	private double cm;
	
	public FeetConversionArea(String str, int r, int c) {
		super(str,r,c);
	}
	
	public void setSubject(Subject sub) {
		subject = sub;
	}
	
	public void update() {
		cm = subject.getValue();
		setText(conversion());
	} 
	
	private String conversion() {
		return Double.toString(cm/30.48)+ " ft";
	}

}
