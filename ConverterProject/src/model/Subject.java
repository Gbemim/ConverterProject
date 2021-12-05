package model;

import java.util.ArrayList;
import java.util.List;

import view.Observer;

/*
 * This is a Subject for the Observer design pattern
 */
public abstract class Subject {
	
	private List<Observer> observerList = new ArrayList<Observer>();
	
	/*
	 * This obtains a value on the screen
	 * 
	 * @return the obtained value in double 
	 */
	public abstract double getValue();
	
	/*
	 * Add observers to the list
	 * 
	 * @param o observer to add
	 */
	protected void addObserver(Observer o) {
		observerList.add(o);
	}
	
	/*
	 * Remove observers from the list
	 * 
	 * @param o observer to remove
	 */
	protected void removeObserver(Observer o) {
		observerList.remove(o);
	}
	
	/*
	 * Notify the change to other objects 
	 *
	 */
	protected void notifyObjects() {
		for (Observer o : observerList) {
			o.update();
	}
}
}
