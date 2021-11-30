package controller;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> observerList = new ArrayList<Observer>();
	
	public abstract double getValue();
	
	protected void addObserver(Observer o) {
	observerList.add(o);
	}
	
	protected void removeObserver(Observer o) {
		observerList.remove(o);
	}
	
	protected void notifyObjects() {
		for (Observer o : observerList) {
			o.update();
	}
}
}
