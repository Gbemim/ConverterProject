package view;

import javax.swing.JTextArea;

import controller.Observer;
import controller.Subject;

public class MeterConversionArea extends JTextArea implements Observer{
	private Subject subject;
	private double cm;
	
	public MeterConversionArea(String str, int r, int c) {
		super(str,r,c);
	}
	
	public void setSubject(Subject sub) {
		subject = sub;
	}
	
	@Override
	public void update() {
		cm = subject.getValue();
		setText(conversion());
	}
	
	private String conversion() {
		return Double.toString(cm/100)+ " m";
	}
	
}
