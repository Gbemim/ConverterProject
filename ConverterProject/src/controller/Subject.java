package controller;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	public List<Observer> observerList = new ArrayList<Observer>();
	
	public abstract double getValue();
	
	public void addObserver(Observer o) {
	observerList.add(o);
	}
	
	public void removeObserver(Observer o) {
		observerList.remove(o);
	}
	
	public void notifyObjects() {
		for (Observer o : observerList) {
			o.update();
	}
}
}
